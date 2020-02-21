package com.accp.dao;

import com.accp.pojo.Status;

public interface StatusDao {
    int deleteByPrimaryKey(Integer statusId);

    int insert(Status record);

    int insertSelective(Status record);

    Status selectByPrimaryKey(Integer statusId);

    int updateByPrimaryKeySelective(Status record);

    int updateByPrimaryKey(Status record);
}