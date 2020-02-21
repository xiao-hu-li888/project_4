package project_4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.CheckBiz;
import com.accp.pojo.Check;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class TestCheck {
	@Resource
	private CheckBiz checkBiz;
	
	@Test
	public void testselectCheckVoByBizid() {
		checkBiz.selectCheckVoByBizid(2,2).forEach(temp->{
			System.out.println(temp.getEmployeeName());
			System.out.println(temp.getResultName());
		});
	}
	
	@Test
	public void testinsertSelective() {
		Check check=new Check();
		check.setBizId(2);
		check.setCheckMan(1004);
		check.setTypeId(2);
		check.setCheckResult(2);
		checkBiz.insertSelective(check);
	}
}
