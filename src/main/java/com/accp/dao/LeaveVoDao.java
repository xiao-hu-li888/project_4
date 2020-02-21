package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.LeaveVo;

public interface LeaveVoDao {
	/**
	 * 查询请假vo对象
	 * @param startTime
	 * @param endTime
	 * @param positionid
	 * @param employeeId
	 * @param departmentId
	 * @return
	 */
	List<LeaveVo> selectLeaveVo(@Param("startTime") String startTime,@Param("endTime") String endTime,@Param("positionid") Integer positionid,@Param("employeeId") Integer employeeId,@Param("departmentId") Integer departmentId);
	
	/**
	 * 根据请假id查询请假vo对象
	 * @param leaveId
	 * @return
	 */
	LeaveVo selectLeavevoByleaveid(@Param("leaveId") Integer leaveId);
}
