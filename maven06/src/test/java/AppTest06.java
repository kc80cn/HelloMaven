import dao.UserDao;
import org.junit.Test;

/**
 * @author KCg
 * @create 10/04/2021 5:46 PM
 * @description maven01
 */
public class AppTest06 {
	/**
	 * VAR1, @Test
	 * VAR2, return type
	 * VAR3, function name
	 * VAR4, parameters
	 * VAR5, function body
	 *
	 */
	@Test
	public void myFunc(){
		System.out.println("this is AppTest06 ... ");
		UserDao.testDao();
	}
}
