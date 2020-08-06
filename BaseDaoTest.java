package test;


import com.shsxt.dao.BaseDao;
import com.shsxt.po.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BaseDaoTest {

	@Test
	public void testUpdate() {
		
		
		String sql = "insert into tb_user (uname,upwd,head,mood,nick) values (?,?,?,?,?)";
		
		List<Object> params = new ArrayList<Object>();
		params.add("lalala");
		params.add("DIjVZpTC+zvMQW4SLBBy6w==");
		params.add("404.jpg");
		params.add("Hello World");
		params.add("halo");
		
		int row = BaseDao.executeUpdate(sql, params);
		System.out.println(row);
	}
	
	
	@Test
	public void testfindSingvalue() {
		
		String sql = "select count(1) from tb_user";
		
		long count = (long)BaseDao.findSingValue(sql, null);
		
		System.out.println(count);
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testQueryRows() {
		
		String sql = "select * from tb_user";
		
		List<User> list = BaseDao.queryRows(sql, null, User.class);
		
		System.out.println(list.size());
	}
	

}
