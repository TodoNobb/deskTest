package ch01;

import java.io.Console;
import java.util.Scanner;

/**
 * ��ȡ����
 * @Core_Java_Volume_I-Fundamentals
 * @author: Administrator
 * @version: 1.0
 * @date: 2018��7��19�� ����12:37:42
 * @copyright Just Do IT
 * @power by Windows7
 */
public class InputTest {

	public static void main (String[] args) {
		//��ȡ��Ϣ
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println("How old are you?");
		int age = in.nextInt();
		System.out.println("Hello," +name+ ".Next year, you'll be " +(age+1) );
		//��������ʱ�ǿɼ��ģ�����Scanner���ʺ��������룬��ҪConsole��,ÿ��ֻ��ȡһ��
		//Ϊ�˰�ȫ�������ȡ���������������У���������д���֮��Ӧ��������һ�����ֵ��������Ԫ��
		//����ָ���쳣���޷�ִ��
		Console cons = System.console();
		String username = cons.readLine("User name: ");
		char[] passwd = cons.readPassword("Password: ");
	}

}
