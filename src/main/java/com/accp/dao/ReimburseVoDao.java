package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.ReimburseVo;

public interface ReimburseVoDao {
	
	/**
	 * 查询报销vo对象
	 * @param startTime
	 * @param endTime
	 * @param statusId
	 * @return
	 */
    List<ReimburseVo> selectReimburseVo(@Param("startTime") String startTime, @Param("endTime") String endTime,@Param("statusId") Integer statusId,@Param("positionid") Integer positionid,@Param("employeeId") Integer employeeId,@Param("departmentId") Integer departmentId);
    
    /**
     * 根据id查询报销vo对象
     * @param reimburseId
     * @return
     */
    ReimburseVo selectReivoByReiid(@Param("reimburseId") Integer reimburseId);
}
