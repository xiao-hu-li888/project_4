package com.accp.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Reimburse;
import com.accp.pojo.Reimburse_detail;

public interface ReimburseDao {
	/**
	 * 根据主键删除
	 * @param reimburseId
	 * @return
	 */
    int deleteByPrimaryKey(@Param("reimburseId") Integer reimburseId);

    int insert(Reimburse record);

    int insertSelective(Reimburse record);
    
    /**
     * 主祥新增
     * @param rei
     * @return
     */
    int insertZhuAndXiang(@Param("rei") Reimburse rei); 
    
    /**
     * 根据主表id查询详表
     * @param mainId
     * @return
     */
    List<Reimburse_detail> selectXiangByReiid(@Param("mainId") Integer mainId);

    Reimburse selectByPrimaryKey(Integer reimburseId);
    
    /**
     * 根据主键修改主表
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(@Param("record") Reimburse record);
    
    /**
     * 根据主表id删除详表
     * @param reimburseId
     * @return
     */
    int deleteXiangByReiid(@Param("reimburseId") Integer reimburseId);
    
    /**
     * 新增详表
     * @param mainId
     * @param reides
     * @return
     */
    int insertXiang(@Param("reimburseId") Integer reimburseId,@Param("reides") List<Reimburse_detail> reides);

    int updateByPrimaryKey(Reimburse record);
}