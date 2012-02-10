package org.yankun.lms.core.division.service.impl;

import java.util.List;
import java.util.Map;

import org.yankun.lms.core.division.service.DivisionService;
import org.yankun.lms.dao.BaseDao;

public class DivisionServiceImpl implements DivisionService {
	
	private BaseDao dao;
	
	@Override
	public Map<String, Object> getDivision(String id) {
		String sql = "select * from division where sysId = ?";
		Object args[] = {id};
		
		return dao.queryForMap(sql, args);
	}

	@Override
	public List<Map<String, Object>> getDivisions() {
		// TODO Auto-generated method stub
		return null;
	}

}
