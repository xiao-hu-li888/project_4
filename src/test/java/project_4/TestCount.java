package project_4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.CountBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class TestCount {
	@Resource
	private CountBiz countBiz;
	
	@Test
	public void testselectGroupyear() {
		countBiz.selectGroupyear().forEach(temp->{
			System.out.println(temp.getMoney());
			System.out.println(temp.getYear());
		});
	}
	
	@Test
	public void testselectGroupyearAndmonth() {
		countBiz.selectGroupyearAndmonth(1, 3).getList().forEach(temp->{
			System.out.println(temp.getMoney());
			System.out.println(temp.getYear());
			System.out.println(temp.getMonth());
		});
	}
	
	@Test
	public void testselectByyear() {
		countBiz.selectByyear(2020).forEach(temp->{
			System.out.println(temp.getYear());
			System.out.println(temp.getMonth());
			System.out.println(temp.getMoney());
		});
	}
	
	@Test
	public void testselectByyearAndmonth() {
		countBiz.selectByyearAndmonth(2020, 2).forEach(temp->{
			System.out.println(temp.getMonth());
			System.out.println(temp.getMoney());
		});
	}
}
