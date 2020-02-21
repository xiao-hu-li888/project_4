package com.accp.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Check {
    private Integer checkId;

    private Integer bizId;

    private Integer typeId;

    @JSONField(format = "yyyy-MM-dd") //ajax
	@DateTimeFormat(pattern = "yyyy-MM-dd") //mvc
    private Date checkTime;

    private Integer checkMan;

    private Integer checkResult;

    private String checkComment;
    

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

    public Integer getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Integer checkResult) {
        this.checkResult = checkResult;
    }

    public String getCheckComment() {
        return checkComment;
    }

    public void setCheckComment(String checkComment) {
        this.checkComment = checkComment == null ? null : checkComment.trim();
    }

	public Check(Integer checkId, Integer bizId, Integer typeId, Date checkTime, Integer checkMan, Integer checkResult,
			String checkComment) {
		super();
		this.checkId = checkId;
		this.bizId = bizId;
		this.typeId = typeId;
		this.checkTime = checkTime;
		this.checkMan = checkMan;
		this.checkResult = checkResult;
		this.checkComment = checkComment;
	}

	public Check() {
		super();
	}
    
}