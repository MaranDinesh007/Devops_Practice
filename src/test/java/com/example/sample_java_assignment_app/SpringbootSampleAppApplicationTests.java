package com.example.sample_java_assignment_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringbootSampleAppApplicationTests {

	@Test
	public void login_Test(){
		SpringbootSampleAppApplication app = new SpringbootSampleAppApplication();
		String result = app.login(".");
		assertEquals("Please input your credentials for login...",result);
	}
	@Test
	public void mainTest(){
		SpringbootSampleAppApplication.main(new String[]{});
	}

	@Test
	public void register_Test(){
		SpringbootSampleAppApplication app = new SpringbootSampleAppApplication();
		String result = app.register("..");
		assertEquals("Please follow registration process...",result);
	}

}
