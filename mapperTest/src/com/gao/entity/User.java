package com.gao.entity;

public class User {
	private int uid;
	private String uname;
	private int rid;
	private Role role;
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", rid=" + rid + ", role=" + role + "]";
	}

	
	
	

}
