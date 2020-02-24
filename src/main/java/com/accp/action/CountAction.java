package com.accp.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.CountBiz;
import com.accp.pojo.Count;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/counts") // 命名空间
public class CountAction {
	@Autowired
	private CountBiz countBiz;
	
	/**
     * 查询年度报表
     * @return
     */
	@GetMapping("/yearAndmonth")
	public List<Count> selectGroupyear(){
		return countBiz.selectGroupyear();
	}
	/**
     * 查询月度报表
     * @return
     */
	@GetMapping("/month/{pageNum}/{pageSize}")
	public PageInfo<Count> selectGroupyearAndmonth(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		PageInfo<Count> page=countBiz.selectGroupyearAndmonth(pageNum, pageSize);
		return page;
	}
	/**
     * 根据年份查询
     * @param year
     * @return
     */
	@GetMapping("/byyear/{year}")
	public List<Count> selectByyear(@PathVariable Integer year) {
		return countBiz.selectByyear(year);
	}
	/**
     * 根据年份和月份查询
     * @param year
     * @param month
     * @return
     */
	@GetMapping("/bymonth/{year}/{month}")
	public List<Count> selectByyearAndmonth(@PathVariable Integer year,@PathVariable Integer month) {
		return countBiz.selectByyearAndmonth(year, month);
	}
}
