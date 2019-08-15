package id.febryansambuari.cruddasar.springdatajpa;

import id.febryansambuari.cruddasar.springdatajpa.model.AppUser;
import id.febryansambuari.cruddasar.springdatajpa.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private AppUserRepository appUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Creating AppUser object: appUser1");
		AppUser appUser1 = new AppUser();
		appUser1.setUsername("appuser1");
		appUser1.setFirstName("febryan");
		appUser1.setLastName("Sambuari");
		appUser1.setJoinDate(new Date());
		System.out.println("appuser1 created");

		System.out.println("Creating AppUser object: appUser2");
		AppUser appUser2 = new AppUser();
		appUser2.setUsername("appuser2");
		appUser2.setFirstName("Falin");
		appUser2.setLastName("Hasanah");
		appUser2.setJoinDate(new Date());
		System.out.println("appuser2 created");

		System.out.println("saving appuser1 . . .");
		this.appUserRepository.save(appUser1);
		System.out.println("appuser1 saved.");

		System.out.println("saving appuser2 . . .");
		this.appUserRepository.save(appUser2);
		System.out.println("appuser2 saved");
	}
}
