package org.yankun.lms.core.division.service;

import java.util.List;
import java.util.Map;

public interface DivisionService {
	Map<String,Object> getDivision(String id);
	List<Map<String,Object>> getDivisions();
}
