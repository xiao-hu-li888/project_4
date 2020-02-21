package com.accp.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ReimburseVo {
	private Integer reimburseId;		//报销id
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date createTime;			//填报日期
	private Integer employeeId;			//填报人id
	private String employeeName;		//填报人
	private Float totalCount;			//总金额
	private String statusName;			//状态
	private Integer employeeId2;		//待处理人id
	private String employeeName2;		//待处理人
	private String departmentName;		//部门名称
	private String positionName;		//职位名称
	private Integer departmentId;		//部门id
	private Integer positionId;			//职位id
	private String event;				//报销事由
	public Integer getReimburseId() {
		return reimburseId;
	}
	public void setReimburseId(Integer reimburseId) {
		this.reimburseId = reimburseId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Float getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Float totalCount) {
		this.totalCount = totalCount;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getEmployeeName2() {
		return employeeName2;
	}
	public void setEmployeeName2(String employeeName2) {
		this.employeeName2 = employeeName2;
	}
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getEmployeeId2() {
		return employeeId2;
	}
	public void setEmployeeId2(Integer employeeId2) {
		this.employeeId2 = employeeId2;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getPositionId() {
		return positionId;
	}
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public ReimburseVo(Integer reimburseId, Date createTime, Integer employeeId, String employeeName, Float totalCount,
			String statusName, Integer employeeId2, String employeeName2, String departmentName, String positionName,
			Integer departmentId, Integer positionId, String event) {
		super();
		this.reimburseId = reimburseId;
		this.createTime = createTime;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.totalCount = totalCount;
		this.statusName = statusName;
		this.employeeId2 = employeeId2;
		this.employeeName2 = employeeName2;
		this.departmentName = departmentName;
		this.positionName = positionName;
		this.departmentId = departmentId;
		this.positionId = positionId;
		this.event = event;
	}
	public ReimburseVo() {
		super();
	}
	
}
