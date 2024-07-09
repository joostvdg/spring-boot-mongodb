package net.joostvdg.demo.spring.mongodb;

import org.springframework.boot.SpringApplication;

public class TestMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.from(MongodbApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
