package com.accp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Reimburse {
    private Integer reimburseId;

    private Integer typeId;

    private Integer createMan;

    @JSONField(format = "yyyy-MM-dd") //ajax
	@DateTimeFormat(pattern = "yyyy-MM-dd") //mvc
    private Date createTime;

    private Integer departmentId;

    private Integer nextDealMan;

    private String event;

    private Float totalCount;

    private Integer statusId;
    
    private List<Reimburse_detail> reides=new ArrayList<Reimburse_detail>(0);

    public Integer getReimburseId() {
        return reimburseId;
    }

    public void setReimburseId(Integer reimburseId) {
        this.reimburseId = reimburseId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getCreateMan() {
        return createMan;
    }

    public void setCreateMan(Integer createMan) {
        this.createMan = createMan;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getNextDealMan() {
        return nextDealMan;
    }

    public void setNextDealMan(Integer nextDealMan) {
        this.nextDealMan = nextDealMan;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event == null ? null : event.trim();
    }

    public Float getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Float totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

	public List<Reimburse_detail> getReides() {
		return reides;
	}

	public void setReides(List<Reimburse_detail> reides) {
		this.reides = reides;
	}

	public Reimburse(Integer reimburseId, Integer typeId, Integer createMan, Date createTime, Integer departmentId,
			Integer nextDealMan, String event, Float totalCount, Integer statusId, List<Reimburse_detail> reides) {
		super();
		this.reimburseId = reimburseId;
		this.typeId = typeId;
		this.createMan = createMan;
		this.createTime = createTime;
		this.departmentId = departmentId;
		this.nextDealMan = nextDealMan;
		this.event = event;
		this.totalCount = totalCount;
		this.statusId = statusId;
		this.reides = reides;
	}

	public Reimburse() {
		super();
	}
    
}