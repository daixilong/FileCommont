package com.xdl.test_h2.inte;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AnnotationUtil {

	/**
	 * 将注解类以及引用父类的内容封装入map,表单模块的配置
	 * @param class1 (使用注解的类)
	 * @param className(动态类的路径)
	 */
	public static List<Map<String, Object>> parse(Class class1,String className){
		List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
		try {
			Class class2=  Class.forName(className);
			Field [] fields= class2.getDeclaredFields();
			for (Field field : fields) {
				if(field.isAnnotationPresent(class1)){
					Query query= field.getAnnotation(class1);
					Map<String, Object> map=new HashMap<String, Object>();
					map.put("name", query.name());
					map.put("display", query.display());
					map.put("fieldName",field.getName());
					list.add(map);
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
