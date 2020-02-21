package com.accp.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class LeaveVo {
	private Integer leaveId;			//请假编号
    private Integer createMan;			//请假人编号
    private String employeeName;		//请假人名称
    private Integer departmentId;		//请假人部门编号
    private String departmentName;		//请假人部门名称
    private Integer positionId;			//请假人职位id
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date createTime;			//创建时间
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date startTime;				//请假开始时间
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date endTime;				//请假结束时间
    private Integer nextDealMan;		//下个处理人，外键
    private String employeeName2;		//下个处理人名称
    private String event;				//请假事由
    private Integer totalCount;			//请假总天数
    private Integer statusId;			//状态
    private String statusName;			//状态名称
    private String resultName;			//审批意见
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date checkTime;				//审批时间 
	public Integer getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}
	public Integer getCreateMan() {
		return createMan;
	}
	public void setCreateMan(Integer createMan) {
		this.createMan = createMan;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Integer getNextDealMan() {
		return nextDealMan;
	}
	public void setNextDealMan(Integer nextDealMan) {
		this.nextDealMan = nextDealMan;
	}
	public String getEmployeeName2() {
		return employeeName2;
	}
	public void setEmployeeName2(String employeeName2) {
		this.employeeName2 = employeeName2;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getResultName() {
		return resultName;
	}
	public void setResultName(String resultName) {
		this.resultName = resultName;
	}
	public Date getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}
	
	public Integer getPositionId() {
		return positionId;
	}
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	public LeaveVo(Integer leaveId, Integer createMan, String employeeName, Integer departmentId, String departmentName,
			Integer positionId, Date createTime, Date startTime, Date endTime, Integer nextDealMan,
			String employeeName2, String event, Integer totalCount, Integer statusId, String statusName,
			String resultName, Date checkTime) {
		super();
		this.leaveId = leaveId;
		this.createMan = createMan;
		this.employeeName = employeeName;
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.positionId = positionId;
		this.createTime = createTime;
		this.startTime = startTime;
		this.endTime = endTime;
		this.nextDealMan = nextDealMan;
		this.employeeName2 = employeeName2;
		this.event = event;
		this.totalCount = totalCount;
		this.statusId = statusId;
		this.statusName = statusName;
		this.resultName = resultName;
		this.checkTime = checkTime;
	}
	public LeaveVo() {
		super();
	}
    
}
