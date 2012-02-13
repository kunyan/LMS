package com.psychcn.lms.persistence.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository()
public class BaseDao extends JdbcTemplate{
	@Autowired
	public BaseDao(@Qualifier("mainDataSource") DataSource ds){
		super.setDataSource(ds);
	}
}
