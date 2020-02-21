package com.accp.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class CheckVo {
	private Integer checkId;			//审查记录编号
    private Integer bizId;				//业务编号
    private Integer typeId;				//哪个表
    @JSONField(format = "yyyy-MM-dd") //ajax
	@DateTimeFormat(pattern = "yyyy-MM-dd") //mvc
    private Date checkTime;				//审查时间
    private Integer checkMan;			//审查人编号
    private String employeeName;		//审查人名称
    private Integer checkResult;		//审查结果
    private String resultName;			//审查结果名称
    private String checkComment;		//审查意见
	public Integer getCheckId() {
		return checkId;
	}
	public void setCheckId(Integer checkId) {
		this.checkId = checkId;
	}
	public Integer getBizId() {
		return bizId;
	}
	public void setBizId(Integer bizId) {
		this.bizId = bizId;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Date getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}
	public Integer getCheckMan() {
		return checkMan;
	}
	public void setCheckMan(Integer checkMan) {
		this.checkMan = checkMan;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getCheckResult() {
		return checkResult;
	}
	public void setCheckResult(Integer checkResult) {
		this.checkResult = checkResult;
	}
	public String getResultName() {
		return resultName;
	}
	public void setResultName(String resultName) {
		this.resultName = resultName;
	}
	public String getCheckComment() {
		return checkComment;
	}
	public void setCheckComment(String checkComment) {
		this.checkComment = checkComment;
	}
	public CheckVo(Integer checkId, Integer bizId, Integer typeId, Date checkTime, Integer checkMan,
			String employeeName, Integer checkResult, String resultName, String checkComment) {
		super();
		this.checkId = checkId;
		this.bizId = bizId;
		this.typeId = typeId;
		this.checkTime = checkTime;
		this.checkMan = checkMan;
		this.employeeName = employeeName;
		this.checkResult = checkResult;
		this.resultName = resultName;
		this.checkComment = checkComment;
	}
	public CheckVo() {
		super();
	}
}
