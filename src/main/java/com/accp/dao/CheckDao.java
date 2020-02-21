package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Check;
import com.accp.vo.CheckVo;

public interface CheckDao {
    int deleteByPrimaryKey(Integer checkId);

    int insert(Check record);

    /**
     * 新增审查表
     * @param record
     * @return
     */
    int insertSelective(@Param("record") Check record);

    Check selectByPrimaryKey(Integer checkId);
    
    /**
     * 根据业务编号进行查询
     * @param checkId
     * @return
     */
    List<CheckVo> selectCheckVoByBizid(@Param("typeId") Integer typeId,@Param("bizId") Integer bizId);

    int updateByPrimaryKeySelective(Check record);

    int updateByPrimaryKey(Check record);
}