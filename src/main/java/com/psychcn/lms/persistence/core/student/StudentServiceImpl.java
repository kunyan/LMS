package com.psychcn.lms.persistence.core.student;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.psychcn.lms.persistence.dao.BaseDao;
import com.psychcn.lms.persistence.entity.Student;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {

	@Resource
	private BaseDao dao;
	
	@Override
	public Student getStudentById(String sysId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Cacheable("student")
	public Map<String,Object> getStudentByUsername(String username) {
		String sql = "select top 1 * from Student where username= ?";
		return dao.queryForMap(sql, username);
	}

}
