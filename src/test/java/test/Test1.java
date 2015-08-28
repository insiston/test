package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lzg.dao.IUserDao;
import com.lzg.entity.User;
import com.lzg.service.IUserService;

public class Test1 extends BaseTest {

	@Autowired
	private IUserDao userDao;

	@Autowired
	private IUserService userService;

	@Test
	public void test1() {
		User user = new User();
		// user.setUserName("哈哈");
		user.setPassWord("123");
		// User user2 = userService.findUser(user);
		// System.out.println(user2);

		userDao.save(user);
	}
}
