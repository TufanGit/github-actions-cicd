package com.cicd.tufan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TufanApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome TUFAN ...";
	}
	public static void main(String[] args) {
		SpringApplication.run(TufanApplication.class, args);
	}

//	echo "# github-actions-cicd" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin git@github.com:TufanGit/github-actions-cicd.git
//	git push -u origin main

}
