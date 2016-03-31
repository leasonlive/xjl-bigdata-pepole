package com.zxhy.xjl.bigdata.pepole;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:ApplicationContext-pepole.xml"})
public class PepoleServiceTest {
   @Autowired
   PepoleService pepoleService;
   @Test
   public void checkID(){
	   Assert.assertTrue(this.pepoleService.checkID("", "冒蓓菡"));
	   Assert.assertFalse(this.pepoleService.checkID("3201", "张三"));
   }
   
}
