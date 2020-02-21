package com.accp.dao;

import com.accp.pojo.Count;

public interface CountDao {
    int deleteByPrimaryKey(Integer countId);

    int insert(Count record);

    int insertSelective(Count record);

    Count selectByPrimaryKey(Integer countId);

    int updateByPrimaryKeySelective(Count record);

    int updateByPrimaryKey(Count record);
}