package com.accp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.LeaveVoBiz;
import com.accp.vo.LeaveVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/leavevos") // 命名空间
public class LeaveVoAction {
	@Autowired
	private LeaveVoBiz leavevoBiz;
	
	/**
	 * 查询请假vo对象
	 * @param startTime
	 * @param endTime
	 * @param positionid
	 * @param employeeId
	 * @param departmentId
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}/{startTime}/{endTime}/{positionid}/{employeeId}/{departmentId}")
	public PageInfo<LeaveVo> selectLeaveVo(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable String startTime,@PathVariable String endTime,@PathVariable Integer positionid,@PathVariable Integer employeeId,@PathVariable Integer departmentId){
		if ("null".equals(startTime)) {
			startTime=null;
		}
		if ("null".equals(endTime)) {
			endTime=null;
		}
		System.out.println("jinlai");
		PageInfo<LeaveVo> page=leavevoBiz.selectLeaveVo(pageNum, pageSize, startTime, endTime, positionid, employeeId, departmentId);
		return page;
	}
	/**
     * 根据请假id查询请假vo对象
     * @param leaveId
     * @return
     */
	@GetMapping("/{leavevo}/{leaveId}")
	public LeaveVo selectReivoByReiid(@PathVariable Integer leaveId) {
		return leavevoBiz.selectLeavevoByleaveid(leaveId);
	}
}
