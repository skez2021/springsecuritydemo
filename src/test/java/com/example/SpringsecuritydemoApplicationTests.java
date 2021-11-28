package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class SpringsecuritydemoApplicationTests {

	@Test
	public void contextLoads() {
		PasswordEncoder pe = new BCryptPasswordEncoder();
	}

}
