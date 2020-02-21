package project_4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.LeaveBiz;
import com.accp.pojo.Leave;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class TestLeave {
	@Resource
	private LeaveBiz leaveBiz;
	
	@Test
	public void testupdateByPrimaryKeySelective() {
		Leave leave=new Leave();
		leave.setLeaveId(1);
		leave.setEvent("病假");
		leave.setStatusId(3);
		leaveBiz.updateByPrimaryKeySelective(leave);
	}
}
