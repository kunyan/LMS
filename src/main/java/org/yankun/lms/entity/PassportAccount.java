package org.yankun.lms.entity;

import java.io.Serializable;
import java.util.Date;


public class PassportAccount implements Serializable {

	private static final long serialVersionUID = 3381650015267675488L;
	

	private String userid;

    private String password;

    private String email;

    private Date regdate2;
    
    private byte source;
    
    private String ip;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegdate2() {
		return regdate2;
	}

	public void setRegdate2(Date regdate2) {
		this.regdate2 = regdate2;
	}

	public void setSource(byte source) {
		this.source = source;
	}

	public byte getSource() {
		return source;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}
}
