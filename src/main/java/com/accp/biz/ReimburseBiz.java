package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.ReimburseDao;
import com.accp.pojo.Reimburse;
import com.accp.pojo.Reimburse_detail;

@Service("reiBiz") // 非常重要
public class ReimburseBiz {
	// 自动类型装配
	@Autowired
	private ReimburseDao reiDao;
	
	/**
     * 根据主键修改主表
     * @param record
     * @return
     */
    public int updateByPrimaryKeySelective(Reimburse record) {
    	return reiDao.updateByPrimaryKeySelective(record);
    }
    /**
     * 根据主表id删除详表
     * @param reimburseId
     * @return
     */
    public int deleteXiangByReiid(Integer reimburseId) {
    	return reiDao.deleteXiangByReiid(reimburseId);
    }
    
    /**
     * 新增详表
     * @param mainId
     * @param reides
     * @return
     */
    public int insertXiang(Integer reimburseId,List<Reimburse_detail> reides) {
    	return reiDao.insertXiang(reimburseId, reides);
    }
    /**
     * 根据主表id查询详表
     * @param mainId
     * @return
     */
    public List<Reimburse_detail> selectXiangByReiid(Integer mainId){
    	return reiDao.selectXiangByReiid(mainId);
    }
    /**
	 * 根据主键删除
	 * @param reimburseId
	 * @return
	 */
    public int deleteByPrimaryKey(Integer reimburseId) {
    	return reiDao.deleteByPrimaryKey(reimburseId);
    }
    /**
     * 主祥新增
     * @param rei
     * @return
     */
    public int insertZhuAndXiang(Reimburse rei) {
    	return reiDao.insertZhuAndXiang(rei);
    }
    
}
