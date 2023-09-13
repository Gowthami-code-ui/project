package project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	@Test
	void loginbyemail() {
		System.out.println("Login by Email");
		Assert.assertEquals("sai","sai");
	}
	@Test
	void loginbyfacebook() {
		System.out.println("Login by facebook");
		Assert.assertEquals("sai","sai");
	}

}
