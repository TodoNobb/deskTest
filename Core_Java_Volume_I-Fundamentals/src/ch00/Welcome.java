package ch00;
/**
 * Welcome to Core Java
 * @Core_Java_Volume_I-Fundamentals
 * @author: Administrator
 * @version: 1.0
 * @date: 2018��7��14�� ����2:48:34
 * @copyright Just Do IT
 * @power by Windows7
 */
public class Welcome{
	public static void main(String[] args) {
		String greeting = "Welcome to Core Java!";
		System.out.println(greeting);
		//������ַ�����ġ�=��
		for(int i=0;i<greeting.length();i++) {
			System.out.print("=");
		}
	}
}
