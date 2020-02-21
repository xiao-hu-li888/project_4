package com.accp.dao;

import com.accp.pojo.Reimburse_detail;

public interface Reimburse_detailDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Reimburse_detail record);

    int insertSelective(Reimburse_detail record);

    Reimburse_detail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reimburse_detail record);

    int updateByPrimaryKey(Reimburse_detail record);
}