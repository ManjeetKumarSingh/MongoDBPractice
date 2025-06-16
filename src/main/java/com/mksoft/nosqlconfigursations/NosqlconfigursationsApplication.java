package com.mksoft.nosqlconfigursations;

import com.mksoft.nosqlconfigursations.documents.User;
import com.mksoft.nosqlconfigursations.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class NosqlconfigursationsApplication {

//	@Autowired
//    static UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(NosqlconfigursationsApplication.class, args);

		// User user = User.builder().userId("123456").userEmail("manjeet@gmail.com").userName("Manjeet").build();
		//userService.saveUser(user);

		Mono<Map<Object,Object>> task1 = processTask("Task1");
		Mono<Map<Object,Object>> task2 = processTask("Task2");
		Mono<Map<Object,Object>> task3 = processTask("Task3");
		Mono<Map<Object,Object>> task4 = processTask("Task4");
		Mono<Map<Object,Object>> task5 = processTask("Task5");
		Mono<Map<Object,Object>> task6 = processTask("Task6");

		Mono.zip(task1, task2,task3,task4,task5,task6)
				.map(tuple -> tuple.getT1() + " & " + tuple.getT2()+ " & " + tuple.getT3()+ " & " + tuple.getT4()+ " & " + tuple.getT5()+ " & " + tuple.getT6())
				.subscribe(System.out::println);
	}

	private static  Mono<Map<Object,Object>> processTask(String task) {
		HashMap<Object,Object> map = new HashMap<>();
		map.put("Key",task);
		return Mono.just(map);
	}

}
