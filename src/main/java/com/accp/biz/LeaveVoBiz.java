package com.accp.biz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.LeaveVoDao;
import com.accp.vo.LeaveVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("leavevoBiz") // 非常重要
public class LeaveVoBiz {
	// 自动类型装配
	@Autowired
	private LeaveVoDao leavevoDao;
	
	/**
	 * 查询请假vo对象
	 * @param startTime
	 * @param endTime
	 * @param positionid
	 * @param employeeId
	 * @param departmentId
	 * @return
	 */
	public PageInfo<LeaveVo> selectLeaveVo(Integer pageNum, Integer pageSize,String startTime,String endTime,Integer positionid,Integer employeeId,Integer departmentId){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<LeaveVo>(leavevoDao.selectLeaveVo(startTime, endTime, positionid, employeeId, departmentId));
	}
	/**
	 * 根据请假id查询请假vo对象
	 * @param leaveId
	 * @return
	 */
	public LeaveVo selectLeavevoByleaveid(Integer leaveId) {
		return leavevoDao.selectLeavevoByleaveid(leaveId);
	}
}
