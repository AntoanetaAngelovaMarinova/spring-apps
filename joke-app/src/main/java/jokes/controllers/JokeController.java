package jokes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jokes.services.IJokeService;

@RestController
public class JokeController {
	
	private IJokeService jokeService;
	
	/**
	 * Creates a new JokeController with a given joke service.
	 */
	@Autowired
	public JokeController(IJokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@GetMapping(value = "/joke/Any")
    public String fetchDataFromOtherService() {
		return jokeService.fetchDataFromRemoteService();
	}

}
