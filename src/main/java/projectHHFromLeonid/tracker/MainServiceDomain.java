package projectHHFromLeonid.tracker;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class MainServiceDomain {
    public final RestTemplate restTemplate;

    public MainServiceDomain(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void downloadAndSaveVacancies(){
        RestTemplate restTemplate = new RestTemplate();
        MainServiceDomain mainServiceDomain = restTemplate.getForObject("https://api.hh.ru/vacancies", MainServiceDomain.class);
      //  ArrayList<String> allVacancies = new ArrayList<>();

        String fooResourceUrl
                = "http://localhost:8080/spring-rest/foos";
        ResponseEntity<List> response
                = restTemplate.getForEntity(fooResourceUrl, List.class);
        System.out.println(response);



    }
}