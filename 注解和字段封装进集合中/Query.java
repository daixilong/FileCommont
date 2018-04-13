package com.xdl.test_h2.inte;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * 自定义一个注解
 * @author a
 *
 */
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Query {
	public String name ();
	
	public String display();
}
