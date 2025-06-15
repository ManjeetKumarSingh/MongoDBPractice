package com.mksoft.nosqlconfigursations;

import com.mksoft.nosqlconfigursations.documents.User;
import com.mksoft.nosqlconfigursations.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NosqlconfigursationsApplication {

//	@Autowired
//    static UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(NosqlconfigursationsApplication.class, args);

		// User user = User.builder().userId("123456").userEmail("manjeet@gmail.com").userName("Manjeet").build();
		//userService.saveUser(user);
	}

}
