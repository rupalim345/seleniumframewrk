package Contactpackage;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void test() {
		
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("create contacttest");
	}
	@Test
	public void test1() {
		System.out.println("fetch test1");
	}
	@Test
	public void test2() {
		System.out.println("execute saveTest");
	}
	
	@Test
	public void test3() {
		System.out.println("execute deleteContactTest");
	}
}
