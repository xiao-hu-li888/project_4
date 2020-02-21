package com.accp.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.LeaveBiz;
import com.accp.pojo.Leave;

@RestController
@RequestMapping("/api/leaves") // 命名空间
public class LeaveAction {
	@Autowired
	private LeaveBiz leaveBiz;

	/**
     * 新增请假表
     * @param record
     * @return
     */
	@PostMapping("/leave")
	public Map<String, String> insertSelective(@RequestBody Leave leave) {
		leaveBiz.insertSelective(leave);
		Map<String, String> message = new HashMap<String, String>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	/**
     * 修改请假表
     * @param record
     * @return
     */
	@PutMapping("/leave")
	public Map<String, String> updateByPrimaryKeySelective(@RequestBody Leave leave) {
		Map<String, String> message = new HashMap<String, String>();
		leaveBiz.updateByPrimaryKeySelective(leave);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
}
