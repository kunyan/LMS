package org.yankun.lms.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDao extends JdbcTemplate{
	@Autowired
	public BaseDao(@Qualifier("mainDataSource") DataSource ds){
		super.setDataSource(ds);
	}
}
