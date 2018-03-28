package com.example.demo.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Area;
import com.example.demo.service.AreaService;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
	
	@Autowired
	private AreaService areaService;
	
	@GetMapping("/listArea")
	private Map<String, Object> listArea(){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<Area> list = areaService.queryArea();
		modelMap.put("areaList", list);
		return modelMap;
	}
	
//	@GetMapping("getAreaById")
//	private Map<String, Object> getAreaById(Integer id){
//		Map<String, Object> modelMap = new HashMap<String, Object>();
//		Area area = areaService.getAreaById(id);
//		modelMap.put("area", area);
//		return modelMap;
//	}
	
	@PostMapping("addArea")
	private Map<String, Object> addArea(@RequestBody Area area){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("success", areaService.insertArea(area));
		return modelMap;
	}
	
	@PostMapping("updateArea")
	private Map<String, Object> updateArea(@RequestBody Area area){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("success", areaService.updateArea(area));
		return modelMap;
	}
	
	@GetMapping("updateArea")
	private Map<String, Object> deleteArea(Integer id){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("success", areaService.deleteArea(id));
		return modelMap;
	}
}
