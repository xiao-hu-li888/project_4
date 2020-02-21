package com.accp.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.ReimburseVoDao;
import com.accp.vo.ReimburseVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("reivoBiz") // 非常重要
public class ReimburseVoBiz {
	// 自动类型装配
	@Autowired
	private ReimburseVoDao reivoDao;
	
	/**
	 * 查询报销vo对象
	 * @param startTime
	 * @param endTime
	 * @param statusId
	 * @return
	 */
    public PageInfo<ReimburseVo> selectReimburseVo(Integer pageNum, Integer pageSize,String startTime,String endTime,Integer statusId,Integer positionid,Integer employeeId,Integer departmentId){
    	PageHelper.startPage(pageNum, pageSize);
    	return new PageInfo<ReimburseVo>(reivoDao.selectReimburseVo(startTime, endTime, statusId, positionid, employeeId, departmentId));
    }
    /**
     * 根据id查询报销vo对象
     * @param reimburseId
     * @return
     */
    public ReimburseVo selectReivoByReiid(Integer reimburseId) {
    	return reivoDao.selectReivoByReiid(reimburseId);
    }
}
