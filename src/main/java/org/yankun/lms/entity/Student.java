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
	 * ��ϵ��Ϣ
	 * 
	 * **********************************
	 */
	/**
	 * �̶��绰
	 */
	private String telephone;
	
	/**
	 * �ƶ��绰
	 */
	private String mobile;
	
	/**
	 * ����
	 */
	private String email;
	
	/**
	 * QQ����
	 */
	private String qq;
	
	/**
	 * MSN����
	 */
	private String msn;
	
	/**
	 * ʡ��
	 */
	private String province;
	
	/**
	 * ����
	 */
	private String city;
	
	/**
	 * ���͵�ַ
	 */
	private String address;
	
	/**
	 * ��������
	 */
	private String zipcode;
	
	
	/*
	 * **********************************
	 * 
	 * ������Ϣ
	 * 
	 * **********************************
	 */
	
	/**
	 * ��ҵѧУ
	 */
	private String school;
	
	/**
	 * ��ѧרҵ
	 */
	private String major;
	
	/**
	 * ѧ��
	 */
	private String education;
	
	/**
	 * ѧλ
	 */
	private String degree;
	
	/**
	 * ��ҵʱ��
	 */
	private Date dateOfGraduation;
	
	/*
	 * ******************************
	 * 
	 *  ְҵ��Ϣ
	 * 
	 * ******************************
	 */
	
	/**
	 * ְҵ
	 */
	private String jobOccupation;
	
	/**
	 * ��˾����
	 */
	private String companyName;
	
	/**
	 * ����
	 */
	private Integer workYears;
}
