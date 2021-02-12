package com.example.Spring.with.React.JS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Spring.with.React.JS.model.User;
import com.example.Spring.with.React.JS.repository.UserRepository;

@SpringBootApplication
public class SpringWithReactJsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithReactJsApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Manoj", "React", "manoj@gmail.com", 1234567890));
		this.userRepository.save(new User("Chandu", "Python", "chandu@gmail.com", 987654321));
		this.userRepository.save(new User("Kiran", "Java", "kiran@gmail.com", 1234567890));
	}

}
