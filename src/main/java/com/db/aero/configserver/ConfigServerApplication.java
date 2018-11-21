package com.db.aero.configserver;

import com.db.aero.configserver.models.User;
import com.db.aero.configserver.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfigServerApplication {

	private static final Logger log = LoggerFactory.getLogger(ConfigServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(UserRepository userRepository){
		return (args -> {
			//userRepository.save(new User("ausaif","nice123"));
			//userRepository.save(new User("ali","awesome123"));
			userRepository.save(new User("ilya","cool123"));

			for(User user : userRepository.findAll()){
				log.info(user.toString());
			}
		});
	}
}
