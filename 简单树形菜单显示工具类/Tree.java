package com.cn;
/**
 * Ê÷½Úµã
 * @author a
 * µÝ¹é
 */
public class Tree {
	 private int id;
	 
	 private String name;
	 
	 private int pid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Tree(int id, String name, int pid) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
	}

}
