package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.CountDao;
import com.accp.pojo.Count;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("countBiz") // 非常重要
public class CountBiz {
	// 自动类型装配
	@Autowired
	private CountDao countDao;
	
	/**
     * 查询年度报表
     * @return
     */
    public List<Count> selectGroupyear(){
    	return countDao.selectGroupyear();
    }
    /**
     * 查询月度报表
     * @return
     */
    public PageInfo<Count> selectGroupyearAndmonth(Integer pageNum, Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	return new PageInfo<Count>(countDao.selectGroupyearAndmonth());
    }
    /**
     * 根据年份查询
     * @param year
     * @return
     */
    public List<Count> selectByyear(Integer year){
    	return countDao.selectByyear(year);
    }
    /**
     * 根据年份和月份查询
     * @param year
     * @param month
     * @return
     */
    public List<Count> selectByyearAndmonth(Integer year,Integer month){
    	return countDao.selectByyearAndmonth(year, month);
    }
}
