package com.tutorials;

import com.tutorials.model.Gender;
import com.tutorials.model.User;
import com.tutorials.model.UserProfile;
import com.tutorials.repository.UserProfileRepository;
import com.tutorials.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;

@SpringBootApplication
public class Main implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserProfileRepository userProfileRepository;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Clean up database tables
		userProfileRepository.deleteAllInBatch();
		userRepository.deleteAllInBatch();

		User user = new User("TheAkylino", "TheAkylino SOR", "TheAkylinoSOR@gmail.com",
				"MY_SUPER_SECRET_PASSWORD");

		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.set(1987, 11, 3);

		UserProfile userProfile = new UserProfile("+58 04143654744", Gender.MALE, dateOfBirth.getTime(),
				"CALIFORNIA HILLS", "MACARACUAY", "SAINT MARGARITA", "CARACAS",
				"MIRANDA", "VENEZUELA", "1073");

		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		userRepository.save(user);
	}

}
