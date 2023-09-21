package jokes.services;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService implements IJokeService {
	
	@Override
	public String fetchDataFromRemoteService() {
			RestTemplate restTemplate = new RestTemplate();
			
			HttpHeaders headers = new HttpHeaders();
			headers.set("X-RapidAPI-Key", "5502e498b7msh41be581a59e7561p1d0e95jsnbc820a5f57e9");
			headers.set("X-RapidAPI-Host", "jokeapi-v2.p.rapidapi.com");

			HttpEntity<String> entity = new HttpEntity<>(headers);
			
	        ResponseEntity<String> response = restTemplate.exchange(
	            "https://jokeapi-v2.p.rapidapi.com/joke/Any",
	            HttpMethod.GET,
	            entity,
	            String.class
	        );

	        if (response.getStatusCode() == HttpStatus.OK) {
	            return response.getBody();
	        } else {
	            throw new RuntimeException("Failed to fetch data from the remote service.");
	        }
	    }
}
