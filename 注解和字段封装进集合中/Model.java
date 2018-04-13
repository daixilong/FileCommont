package com.xdl.test_h2.inte;

public class Model {

	@Query(name="name",display="测试")
	private String name;
	
	@Query(name="pass",display="密码")
	private String pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
