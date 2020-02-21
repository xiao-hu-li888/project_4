package com.accp.dao;

import com.accp.pojo.Check_result;

public interface Check_resultDao {
    int deleteByPrimaryKey(Integer resultId);

    int insert(Check_result record);

    int insertSelective(Check_result record);

    Check_result selectByPrimaryKey(Integer resultId);

    int updateByPrimaryKeySelective(Check_result record);

    int updateByPrimaryKey(Check_result record);
}