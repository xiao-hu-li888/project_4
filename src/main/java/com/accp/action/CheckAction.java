package com.accp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.CheckBiz;
import com.accp.pojo.Check;
import com.accp.vo.CheckVo;

@RestController
@RequestMapping("/api/checks") // 命名空间
public class CheckAction {
	@Autowired
	private CheckBiz checkBiz;

	/**
	 * 根据业务编号进行查询
	 * 
	 * @param checkId
	 * @return
	 */
	@GetMapping("/checkvo/{typeId}/{bizId}")
	public List<CheckVo> selectCheckVoByBizid(@PathVariable Integer typeId,@PathVariable Integer bizId) {
		return checkBiz.selectCheckVoByBizid(typeId,bizId);
	}

	/**
	 * 新增审查表
	 * 
	 * @param record
	 * @return
	 */
	@PostMapping("/check")
	public Map<String, String> insertSelective(@RequestBody Check check) {
		checkBiz.insertSelective(check);
		Map<String, String> message = new HashMap<String, String>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
}
