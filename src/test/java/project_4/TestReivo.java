package project_4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.ReimburseVoBiz;
import com.accp.vo.ReimburseVo;
import com.github.pagehelper.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class TestReivo {
	@Resource
	private ReimburseVoBiz reivoBiz;
	
	@Test
	public void testselectReimburseVo() {
		PageInfo<ReimburseVo> list=reivoBiz.selectReimburseVo(1, 10, null, null, null, 2, 1004, 4);
		System.out.println("总记录数："+list.getTotal());
		//System.out.println(list.getList());
		for (ReimburseVo item : list.getList()) {
			System.out.println(item);
			System.out.println(item.getEmployeeName());
			System.out.println(item.getEmployeeName2());
			System.out.println(item.getStatusName());
			System.out.println(item.getCreateTime());
		}
		/*list.getList().forEach(temp->{
			System.out.println(temp.getReimburse().getReimburseId());
			System.out.println(temp.getEmployee().getEmployeeName());
			System.out.println(temp.getStatus().getStatusName());
		});*/
	}
}
