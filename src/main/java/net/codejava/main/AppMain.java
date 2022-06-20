package net.codejava.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages={"net.codejava.repo"}) 
@EntityScan("net.codejava.*")   
public class AppMain {
	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}
}
