package com.example.demo;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.AreaDao;
import com.example.demo.entity.Area;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void queryArea() {
//		List<Area> areaList = areaDao.queryArea();
//		assertEquals(2,areaList.size());
//		areaList.forEach(a -> {
//			System.out.println(a.getAreaName());
//		});
		Area area = new Area();
		area.setAreaName("西苑");
		area.setPriority(1);
//		area.setLastEditTime(new Date());
		areaDao.insertArea(area);
	}

}
