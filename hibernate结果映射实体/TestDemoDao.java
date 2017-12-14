package xggl.lsqgzx.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.davidstudio.gbp.core.orm.OrmException;
import com.davidstudio.gbp.core.orm.hibernate.HibernatePagedDao;
import com.davidstudio.gbp.core.orm.paged.IPagedList;
import com.davidstudio.gbp.core.util.EscColumnToBean;

import xggl.lsqgzx.vo.TestDemo;
import xggl.lsqgzx.vo.Xn_lsygxx;

/**
 * xn_lsygxx对象的数据访问类
 * 
 * 
 * @author dxl
 * @since 2017-11-29
 * @version 1.0
 */
public class TestDemoDao extends HibernatePagedDao<TestDemo> {
		public List<TestDemo> queryAll(){
			Query query= getSession().createSQLQuery("select * from tb_test");
			query.setResultTransformer(new EscColumnToBean(TestDemo.class));
			List<TestDemo> list= query.list();
			if(list!=null && list.size()>0){
				  for (TestDemo testDemo : list) {
						System.out.println("-----"+testDemo.gettId());
						System.out.println("-----"+testDemo.getName());
						System.out.println("-----"+testDemo.getDescription());
					}
			}
			return list;
		}
}
