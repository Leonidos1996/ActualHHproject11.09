package projectHHFromLeonid.tracker;

import org.springframework.data.domain.Page;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

public class MainServiceDomain {
    public final RestTemplate restTemplate;

    public MainServiceDomain(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void downloadAndSaveVacancies(){
        RestTemplate restTemplate = new RestTemplate();

        MainServiceDomain mainServiceDomain = restTemplate.getForObject("https://api.hh.ru/vacancies", MainServiceDomain.class);
        ArrayList<String> allVacancies = new ArrayList<>();


    }
}