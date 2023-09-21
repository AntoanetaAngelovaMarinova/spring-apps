package jokes.services;


import org.springframework.stereotype.Service;

@Service
public class StubJokeService implements IJokeService {
	
	@Override
	public String fetchDataFromRemoteService() {
			return "{ \"error\": false, \"category\": \"Misc\", \"type\": \"single\", \"joke\": \"If you're here for the yodeling lesson, please form an orderly orderly orderly queue.\", \"flags\": { \"nsfw\": false, \"religious\": false, \"political\": false, \"racist\": false, \"sexist\": false, \"explicit\": false }, \"id\": 139, \"safe\": true, \"lang\": \"en\" }";
	        
	    }
}
