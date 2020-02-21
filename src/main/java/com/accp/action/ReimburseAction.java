package com.accp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ReimburseBiz;
import com.accp.pojo.Reimburse;
import com.accp.pojo.Reimburse_detail;

@RestController
@RequestMapping("/api/reis") // 命名空间
public class ReimburseAction {
	@Autowired
	private ReimburseBiz reiBiz;

	/**
     * 根据主键修改主表
     * @param record
     * @return
     */
	@PutMapping("/rei")
	public Map<String, String> updateByPrimaryKeySelective(@RequestBody Reimburse rei) {
		Map<String, String> message = new HashMap<String, String>();
		reiBiz.updateByPrimaryKeySelective(rei);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	/**
	 * 根据主键删除
	 * 
	 * @param reimburseId
	 * @return
	 */
	@DeleteMapping("/reide/{reimburseId}")
	public Map<String, String> deleteXiangByReiid(@PathVariable Integer reimburseId) {
		Map<String, String> message = new HashMap<String, String>();
		reiBiz.deleteXiangByReiid(reimburseId);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	/**
	 * 主祥新增
	 * 
	 * @param rei
	 * @return
	 */
	@PostMapping("/reides/{reimburseId}")
	public Map<String, String> insertXiang(@PathVariable Integer reimburseId,@RequestBody List<Reimburse_detail> reides) {
		reiBiz.insertXiang(reimburseId, reides);
		Map<String, String> message = new HashMap<String, String>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	/**
	 * 根据主表id查询详表
	 * 
	 * @param mainId
	 * @return
	 */
	@GetMapping("/reide/{mainId}")
	public List<Reimburse_detail> selectXiangByReiid(@PathVariable Integer mainId) {
		return reiBiz.selectXiangByReiid(mainId);
	}

	/**
	 * 根据主键删除
	 * 
	 * @param reimburseId
	 * @return
	 */
	@DeleteMapping("/rei/{reimburseId}")
	public Map<String, String> deleteByPrimaryKey(@PathVariable Integer reimburseId) {
		Map<String, String> message = new HashMap<String, String>();
		reiBiz.deleteByPrimaryKey(reimburseId);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	/**
	 * 主祥新增
	 * 
	 * @param rei
	 * @return
	 */
	@PostMapping("/rei")
	public Map<String, String> insertZhuAndXiang(@RequestBody Reimburse rei) {
		reiBiz.insertZhuAndXiang(rei);
		Map<String, String> message = new HashMap<String, String>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
}
