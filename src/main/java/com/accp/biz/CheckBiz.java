package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.CheckDao;
import com.accp.pojo.Check;
import com.accp.vo.CheckVo;

@Service("checkBiz") // 非常重要
public class CheckBiz {
	// 自动类型装配
	@Autowired
	private CheckDao checkDao;
	
	/**
     * 新增审查表
     * @param record
     * @return
     */
    public int insertSelective(Check record) {
    	return checkDao.insertSelective(record);
    }
    /**
     * 根据业务编号进行查询
     * @param checkId
     * @return
     */
    public List<CheckVo> selectCheckVoByBizid(Integer typeId,Integer bizId) {
    	return checkDao.selectCheckVoByBizid(typeId,bizId);
    }
}
