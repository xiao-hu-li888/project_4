package com.accp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Leave;

public interface LeaveDao {
    int deleteByPrimaryKey(Integer leaveId);

    int insert(Leave record);

    /**
     * 新增请假表
     * @param record
     * @return
     */
    int insertSelective(@Param("record") Leave record);

    Leave selectByPrimaryKey(Integer leaveId);

    /**
     * 修改请假表
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(@Param("record") Leave record);

    int updateByPrimaryKey(Leave record);
}