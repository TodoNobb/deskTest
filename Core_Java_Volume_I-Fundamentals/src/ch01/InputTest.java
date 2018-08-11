package ch01;

import java.io.Console;
import java.util.Scanner;

/**
 * 读取输入
 * @Core_Java_Volume_I-Fundamentals
 * @author: Administrator
 * @version: 1.0
 * @date: 2018年7月19日 下午12:37:42
 * @copyright Just Do IT
 * @power by Windows7
 */
public class InputTest {

	public static void main (String[] args) {
		//读取信息
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println("How old are you?");
		int age = in.nextInt();
		System.out.println("Hello," +name+ ".Next year, you'll be " +(age+1) );
		//以上输入时是可见的，所以Scanner不适合输入密码，需要Console类,每次只能取一行
		//为了安全起见，读取的密码存放在数组中，对密码进行处理之后，应该马上用一个填充值覆盖数组元素
		//报空指针异常，无法执行
		Console cons = System.console();
		String username = cons.readLine("User name: ");
		char[] passwd = cons.readPassword("Password: ");
	}

}
