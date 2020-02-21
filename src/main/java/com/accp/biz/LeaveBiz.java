package com.accp.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.LeaveDao;
import com.accp.pojo.Leave;

@Service("leaveBiz") // 非常重要
public class LeaveBiz {
	// 自动类型装配
	@Autowired
	private	LeaveDao leaveDao;
	
	 /**
     * 新增请假表
     * @param record
     * @return
     */
    public int insertSelective(Leave record) {
    	return leaveDao.insertSelective(record);
    }
    /**
     * 修改请假表
     * @param record
     * @return
     */
    public int updateByPrimaryKeySelective(Leave record) {
    	return leaveDao.updateByPrimaryKeySelective(record);
    }
}
