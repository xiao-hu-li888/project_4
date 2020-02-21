package project_4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.LeaveVoBiz;
import com.accp.vo.LeaveVo;
import com.github.pagehelper.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class TestLeavevo {
	@Resource
	private LeaveVoBiz leavevoBiz;
	
	@Test
	public void testselectLeaveVo() {
		PageInfo<LeaveVo> list=leavevoBiz.selectLeaveVo(1, 3, null, null, 3, 1005, 4);
		System.out.println("总记录数："+list.getTotal());
		//System.out.println(list.getList());
		for (LeaveVo item : list.getList()) {
			System.out.println(item);
			System.out.println(item.getEmployeeName());
			System.out.println(item.getEmployeeName2());
			System.out.println(item.getStatusName());
			System.out.println(item.getCreateTime());
		}
	}
}
