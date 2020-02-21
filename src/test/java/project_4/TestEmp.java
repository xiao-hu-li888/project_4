package project_4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.EmployeeBiz;
import com.accp.pojo.Department;
import com.accp.pojo.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class TestEmp {
	@Resource
	private EmployeeBiz empBiz;
	
	@Test
	public void testselectByIdAndPwd() {
		//System.out.println("ddddd");
		Employee emp=empBiz.selectByIdAndPwd(1001, "123");
		if (emp!=null) {
			System.out.println(emp.getEmployeeName());
		}
	}
	
	@Test
	public void testselectDepartmentBydid() {
		Department depart=empBiz.selectDepartmentBydid(1);
		if (depart!=null) {
			System.out.println(depart.getDepartmentName());
		}else {
			System.out.println("没有！");
		}
		
	}
	
	@Test
	public void testselectPositionBypid() {
		System.out.println(empBiz.selectPositionBypid(3).getPositionName());
	}
	
	@Test
	public void testselectBydidAndpid() {
		System.out.println(empBiz.selectBydidAndpid(4, 2).getEmployeeName());
	}
}
