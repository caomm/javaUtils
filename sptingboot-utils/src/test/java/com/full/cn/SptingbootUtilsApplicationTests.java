package com.full.cn;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class SptingbootUtilsApplicationTests {

	@Test
	public void contextLoads() {
		ActiveXComponent xl = new ActiveXComponent("PowerPoint.Application");
		Dispatch xlo = (Dispatch)(xl.getObject());
		try {
			System.out.println("version="+xl.getProperty("Version"));
			System.out.println("version="+Dispatch.get(xlo, "Version"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			xl.invoke("Quit", new Variant[] {});
		}
	}

}
