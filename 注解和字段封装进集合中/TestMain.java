package com.xdl.test_h2.inte;

public class TestMain {
	public static void main(String[] args) {
		System.out.println(AnnotationUtil.parse(Query.class, "com.xdl.test_h2.inte.Model").size());;
	}
}
