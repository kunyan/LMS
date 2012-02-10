package org.yankun.lms.entity;

import java.util.Date;

public class Student {
	private int userId;
	
	private String name;
	private Boolean sex;
	private Date birthday;
	private String idType;
	private String idCode;
	
	/*
	 * **********************************
	 * 
	 * 联系信息
	 * 
	 * **********************************
	 */
	/**
	 * 固定电话
	 */
	private String telephone;
	
	/**
	 * 移动电话
	 */
	private String mobile;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * QQ号码
	 */
	private String qq;
	
	/**
	 * MSN号码
	 */
	private String msn;
	
	/**
	 * 省份
	 */
	private String province;
	
	/**
	 * 城市
	 */
	private String city;
	
	/**
	 * 寄送地址
	 */
	private String address;
	
	/**
	 * 邮政编码
	 */
	private String zipcode;
	
	
	/*
	 * **********************************
	 * 
	 * 教育信息
	 * 
	 * **********************************
	 */
	
	/**
	 * 毕业学校
	 */
	private String school;
	
	/**
	 * 所学专业
	 */
	private String major;
	
	/**
	 * 学历
	 */
	private String education;
	
	/**
	 * 学位
	 */
	private String degree;
	
	/**
	 * 毕业时间
	 */
	private Date dateOfGraduation;
	
	/*
	 * ******************************
	 * 
	 *  职业信息
	 * 
	 * ******************************
	 */
	
	/**
	 * 职业
	 */
	private String jobOccupation;
	
	/**
	 * 公司名称
	 */
	private String companyName;
	
	/**
	 * 工龄
	 */
	private Integer workYears;
}
