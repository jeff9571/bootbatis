package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Area;

public interface AreaService {

	List<Area> queryArea();
	int insertArea(Area area);
	int updateArea(Area area);
	int deleteArea(int areaId);
	
}
