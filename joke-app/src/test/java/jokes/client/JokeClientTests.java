package jokes.client;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

class JokeClientTests {
	private static final String PORT = "8080";
	private static final String BASE_URL = "http://localhost:" + PORT;

	private RestTemplate restTemplate = new RestTemplate();

	@Test
	public void getJoke() {

		String joke = restTemplate.getForObject(BASE_URL + "/joke/Any", String.class);

		assertNotNull(joke);
		assertFalse(joke.isEmpty());
	}
}
