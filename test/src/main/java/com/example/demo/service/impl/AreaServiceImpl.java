package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.AreaDao;
import com.example.demo.entity.Area;
import com.example.demo.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{

	@Autowired
	private AreaDao areaDao;
	
	@Override
	public List<Area> queryArea() {
		return areaDao.queryArea();
	}

	@Transactional
	@Override
	public int insertArea(Area area) {
		return areaDao.insertArea(area);
	}

	@Override
	public int updateArea(Area area) {
		return areaDao.insertArea(area);
	}

	@Override
	public int deleteArea(int areaId) {
		return areaDao.deleteArea(areaId);
	}

}
