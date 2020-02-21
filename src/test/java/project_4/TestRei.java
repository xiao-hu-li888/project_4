package project_4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.ReimburseBiz;
import com.accp.pojo.Reimburse;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class TestRei {
	@Resource
	private ReimburseBiz reiBiz;
	
	@Test
	public void testupdateByPrimaryKeySelective() {
		Reimburse rei=new Reimburse();
		rei.setReimburseId(1);
		rei.setStatusId(1);
		reiBiz.updateByPrimaryKeySelective(rei);
	}
	
	@Test
	public void testselectXiangByReiid() {
		reiBiz.selectXiangByReiid(28213053).forEach(temp->{
			System.out.println(temp.getRdesc());
			System.out.println(temp.getPictruePath());
		});
	}
}
