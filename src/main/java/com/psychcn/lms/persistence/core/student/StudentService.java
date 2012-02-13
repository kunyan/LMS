package com.psychcn.lms.persistence.core.student;

import java.util.Map;

import com.psychcn.lms.persistence.entity.Student;

public interface StudentService {
	public Student getStudentById(String sysId);
	public Map<String,Object> getStudentByUsername(String username);
}
