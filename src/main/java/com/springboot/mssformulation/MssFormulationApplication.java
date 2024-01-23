package com.springboot.mssformulation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springboot.mssformulation.models.Role;
import com.springboot.mssformulation.models.User;
import com.springboot.mssformulation.repositories.UserRepository;

@SpringBootApplication
public class MssFormulationApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MssFormulationApplication.class, args);
	}

	public void run(String... args) {
		User adminAccount = userRepository.findByRole(Role.ADMIN);
		if (adminAccount == null) {
			User user = new User();

			user.setFirstName("Admin");
			user.setLastName("001");
			user.setUsername("admin@gmail.com");
			user.setActive(true);
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));
			userRepository.save(user);
		}
	}

}
