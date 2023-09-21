package jokes.controllers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import jokes.services.StubJokeService;

@SpringBootTest
class JokeControllerTests {
	private JokeController controller;

	@BeforeEach
	public void setUp() throws Exception {
		controller = new JokeController(new StubJokeService());
	}

	@Test
	public void testHandleDetailsRequest() {
		String joke = controller.fetchDataFromOtherService();
		assertNotNull(joke);
		assertFalse(joke.isEmpty());
	}

}
