package com.zhao.jpademo;

import com.zhao.bean.ShopCar;
import com.zhao.service.IShopCar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpademoApplicationTests {
	@Autowired
	private IShopCar shopCar;
	@Test
	public void contextLoads() {
		shopCar.save(new ShopCar(1, "test", "test",3.0f,new Date()));
	}


}
