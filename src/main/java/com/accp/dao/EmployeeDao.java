package com.accp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Department;
import com.accp.pojo.Employee;
import com.accp.pojo.Position;

public interface EmployeeDao {
	int deleteByPrimaryKey(Integer employeeId);

	int insert(Employee record);

	int insertSelective(Employee record);

	Employee selectByPrimaryKey(Integer employeeId);

	/**
	 * 根据工号和密码查询（登录）
	 * 
	 * @param employeeId
	 * @param password
	 * @return
	 */
	Employee selectByIdAndPwd(@Param("employeeId") Integer employeeId,@Param("password") String password);
	
	/**
	 * 根据部门id和职位id查询
	 * @param departmentId
	 * @param positionId
	 * @return
	 */
	Employee selectBydidAndpid(@Param("departmentId") Integer departmentId,@Param("positionId") Integer positionId);
	
	/**
	 * 根据部门id查询部门
	 * @param departmentId
	 * @return
	 */
	Department selectDepartmentBydid(@Param("departmentId") Integer departmentId);
	
	/**
	 * 根据职位id查询职位
	 * @param positionId
	 * @return
	 */
	Position selectPositionBypid(@Param("positionId") Integer positionId);
	
	int updateByPrimaryKeySelective(Employee record);

	int updateByPrimaryKey(Employee record);
}