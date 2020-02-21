package com.accp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ReimburseVoBiz;
import com.accp.vo.ReimburseVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/reivos") // 命名空间
public class ReimburseVoAction {
	@Autowired
	private ReimburseVoBiz reivoBiz;

	/**
	 * 查询报销vo对象
	 * 
	 * @param startTime
	 * @param endTime
	 * @param statusId
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}/{startTime}/{endTime}/{statusId}/{positionid}/{employeeId}/{departmentId}")
	public PageInfo<ReimburseVo> selectReimburseVo(@PathVariable Integer pageNum, @PathVariable Integer pageSize,
			@PathVariable String startTime, @PathVariable String endTime, @PathVariable Integer statusId,
			@PathVariable Integer positionid, @PathVariable Integer employeeId, @PathVariable Integer departmentId) {
		if ("null".equals(startTime)) {
			startTime = null;
		}
		if ("null".equals(endTime)) {
			endTime = null;
		}
		if (statusId == 0) {
			System.out.println("dengyu0");
			statusId = null;
		}
		System.out.println("jinlai");
		PageInfo<ReimburseVo> page = reivoBiz.selectReimburseVo(pageNum, pageSize, startTime, endTime, statusId,
				positionid, employeeId, departmentId);
		return page;
	}

	/**
	 * 根据id查询报销vo对象
	 * 
	 * @param reimburseId
	 * @return
	 */
	@GetMapping("/{reivo}/{reimburseId}")
	public ReimburseVo selectReivoByReiid(@PathVariable Integer reimburseId) {
		return reivoBiz.selectReivoByReiid(reimburseId);
	}
}
