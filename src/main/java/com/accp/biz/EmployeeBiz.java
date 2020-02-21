package com.accp.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EmployeeDao;
import com.accp.pojo.Department;
import com.accp.pojo.Employee;
import com.accp.pojo.Position;

@Service("empBiz") // 非常重要
public class EmployeeBiz {
	// 自动类型装配
	@Autowired
	private EmployeeDao empDao;
	
	/**
	 * 根据工号和密码查询（登录）
	 * 
	 * @param employeeId
	 * @param password
	 * @return
	 */
	public Employee selectByIdAndPwd(Integer employeeId, String password) {
		return empDao.selectByIdAndPwd(employeeId, password);
	}
	/**
	 * 根据部门id和职位id查询
	 * @param departmentId
	 * @param positionId
	 * @return
	 */
	public Employee selectBydidAndpid(Integer departmentId,Integer positionId) {
		return empDao.selectBydidAndpid(departmentId, positionId);
	}
	/**
	 * 根据部门id查询部门
	 * @param departmentId
	 * @return
	 */
	public Department selectDepartmentBydid(Integer departmentId) {
		return empDao.selectDepartmentBydid(departmentId);
	}
	/**
	 * 根据职位id查询职位
	 * @param positionId
	 * @return
	 */
	public Position selectPositionBypid(Integer positionId) {
		return empDao.selectPositionBypid(positionId);
	}
}
