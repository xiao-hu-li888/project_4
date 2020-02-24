package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Count;

public interface CountDao {
    int deleteByPrimaryKey(Integer countId);

    int insert(Count record);

    int insertSelective(Count record);

    Count selectByPrimaryKey(Integer countId);
    
    /**
     * 查询年度报表
     * @return
     */
    List<Count> selectGroupyear();
    
    /**
     * 查询月度报表
     * @return
     */
    List<Count> selectGroupyearAndmonth();
    
    /**
     * 根据年份查询
     * @param year
     * @return
     */
    List<Count> selectByyear(@Param("year") Integer year);
    
    /**
     * 根据年份和月份查询
     * @param year
     * @param month
     * @return
     */
    List<Count> selectByyearAndmonth(@Param("year") Integer year,@Param("month") Integer month);

    int updateByPrimaryKeySelective(Count record);

    int updateByPrimaryKey(Count record);
}