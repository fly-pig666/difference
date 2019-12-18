package week3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woniu.dao.IuserDao;
import com.woniu.pojo.User;

public class AppTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IuserDao ud = ac.getBean(IuserDao.class);
		User user = new User();
		user.setUname("bbb");
		user.setUpwd("222");
		ud.save(user);
	}

}
