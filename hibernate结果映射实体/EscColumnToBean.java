package com.davidstudio.gbp.core.util;

import java.lang.reflect.Field;  
import java.util.List;  
  
import org.hibernate.HibernateException;  
import org.hibernate.property.ChainedPropertyAccessor;  
import org.hibernate.property.PropertyAccessor;  
import org.hibernate.property.PropertyAccessorFactory;  
import org.hibernate.property.Setter;  
import org.hibernate.transform.ResultTransformer;  

import com.davidstudio.gbp.core.vo.BaseEntity;

/**
 * @author dxl
 * �Զ������ݿ��ֶ�ת����pojo
 *
 */
public class EscColumnToBean implements ResultTransformer {
	 private static final long serialVersionUID = 1L;  
   private final Class<? extends BaseEntity> resultClass;  
   private Setter[] setters;  
   private PropertyAccessor propertyAccessor;  
     
   public EscColumnToBean(Class<? extends BaseEntity> resultClass) {  
       if(resultClass==null) throw new IllegalArgumentException("resultClass cannot be null");  
       this.resultClass = resultClass;  
       propertyAccessor = new ChainedPropertyAccessor(new PropertyAccessor[] { PropertyAccessorFactory.getPropertyAccessor(resultClass,null), PropertyAccessorFactory.getPropertyAccessor("field")});        
   }  
 
   //���ת��ʱ��HIBERNATE���ô˷���  
   public Object transformTuple(Object[] tuple, String[] aliases) {  
       Object result;  
         
       try {  
           if(setters==null) {//���ȳ�ʼ����ȡ��Ŀ��POJO�������SETTER����  
               setters = new Setter[aliases.length];  
               for (int i = 0; i < aliases.length; i++) {  
                   String alias = aliases[i];  
                   if(alias != null) {  
                       //�ҵ��߼���Ҫ����getSetterByColumnName�������棬��������HIBERNATE����һ������COPY��  
                       //�����������Ҫ��SETTER����  
                       setters[i] = getSetterByColumnName(alias);  
                   }  
               }  
           }  
           result = resultClass.newInstance();  
             
           //����ʹ��SETTER�������POJO����  
           for (int i = 0; i < aliases.length; i++) {  
               if(setters[i]!=null) {  
                   setters[i].set(result, tuple[i], null);  
               }  
           }  
       } catch (InstantiationException e) {  
           throw new HibernateException("Could not instantiate resultclass: " + resultClass.getName());  
       } catch (IllegalAccessException e) {  
           throw new HibernateException("Could not instantiate resultclass: " + resultClass.getName());  
       }  
         
       return result;  
   }  
 
   //�������ݿ��ֶ�����POJO����JAVA�������������������ݿ��ֶ������磺USER_ID  
   private Setter getSetterByColumnName(String alias) {  
       //ȡ��POJO����������  
       Field[] fields = resultClass.getDeclaredFields();  
       if(fields==null || fields.length==0){  
           throw new RuntimeException("ʵ��"+resultClass.getName()+"�����κ�����");  
       }  
       //���ֶ��������е��¸�ȥ��  
       String proName = alias.replaceAll("_", "").toLowerCase();  
       for (Field field : fields) {  
           if(field.getName().toLowerCase().equals(proName)){//ȥ���¸ܵ��ֶ���������������Ե��ϣ���ȡ���SETTER����  
               return propertyAccessor.getSetter(resultClass, field.getName());  
           }  
       }  
       throw new RuntimeException("�Ҳ������ݿ��ֶ� ��"+ alias + " ��Ӧ��POJO���Ի���getter�������������ݿ��ֶ�ΪUSER_ID��USERID����ôJAVA����ӦΪuserId");  
   }

	@Override
	public List transformList(List arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}  
 

}
