package com.example.demo.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

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
		List<Area> areaList = areaDao.queryArea();
		assertEquals(2,areaList.size());
	}

}
