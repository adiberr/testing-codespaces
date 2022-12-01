package dev.adiberrifai.helloworld;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}

@RestController
class PostController {

	@GetMapping("/posts")
	public List<Post> getAllPosts() {
		return List.of(
			new Post(1, "Post 1", "Description 1"),
			new Post(2, "Post 2", "Description 2"),
			new Post(3, "Post 3", "Description 3")
		);
	}
}

record Post(Integer id, String title, String description) {
}
