package com.accp.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.EmployeeBiz;
import com.accp.pojo.Department;
import com.accp.pojo.Employee;
import com.accp.pojo.Position;

@RestController
@RequestMapping("/api/emps") // 命名空间
public class EmployeeAction {
	@Autowired
	private EmployeeBiz empBiz;
	
	/**
	 * 登录
	 * @param session
	 * @param employeeId
	 * @param password
	 * @return
	 */
	//@RequestMapping("login")
	//@ResponseBody
	@GetMapping("/{employeeId}/{password}")
	public Map<String, Object> selectByIdAndPwd(HttpSession session,@PathVariable Integer employeeId,@PathVariable String password) {
		Map<String, Object> message=new HashMap<String, Object>();
		System.out.println(employeeId);
		System.out.println(password);
		Employee emp=empBiz.selectByIdAndPwd(employeeId, password);
		if (emp!=null) {
			session.setAttribute("emp", emp);
			message.put("code", "200");
		}else {
			message.put("code", "300");
		}
		return message;
	}
	
	//@RequestMapping("getemp")
	//@ResponseBody
	@GetMapping("/getemp")
	public Employee getMember(HttpServletRequest request) {
		Employee emp=(Employee)request.getSession().getAttribute("emp");
		return emp;
	}
//	
//	/**
//	 * 根据部门id查询部门
//	 * @param departmentId
//	 * @return
//	 */
//	@RequestMapping("charen")
//	@ResponseBody
//	public Employee selectBydidAndpid(Integer departmentId,Integer positionId) {
//		Employee emp=empBiz.selectBydidAndpid(departmentId, positionId);
//		return emp;
//	}
//	
	/**
	 * 根据部门id和职位id查询
	 * @param departmentId
	 * @param positionId
	 * @return
	 */
	@GetMapping("/charen/{departmentId}/{positionId}")
	public Employee selectBydidAndpid(@PathVariable Integer departmentId,@PathVariable Integer positionId) {
		Employee emp=empBiz.selectBydidAndpid(departmentId, positionId);
		return emp;
	}
	/**
	 * 根据部门id查询部门
	 * @param departmentId
	 * @return
	 */
	@GetMapping("/chabumen/{departmentId}")
	public Department selectDepartmentBydid(@PathVariable Integer departmentId) {
		Department depart=empBiz.selectDepartmentBydid(departmentId);
		return depart;
	}
	
	/**
	 * 根据职位id查询职位
	 * @param positionId
	 * @return
	 */
	//@RequestMapping("chazhiwei")
	//@ResponseBody
	@GetMapping("/chazhiwei/{positionId}")
	public Position selectPositionBypid(@PathVariable Integer positionId) {
		Position posi=empBiz.selectPositionBypid(positionId);
		return posi;
	}
}
