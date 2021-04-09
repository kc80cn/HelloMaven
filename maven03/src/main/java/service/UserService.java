package service;

import dao.UserDao;

/**
 * @author KCg
 * @create 9/04/2021 10:36 AM
 * @description
 */
public class UserService {
	public static void testService() {
		System.out.println("UserService Test ......");
		//invoke maven02, dao
		UserDao.testDao();
	}
}
