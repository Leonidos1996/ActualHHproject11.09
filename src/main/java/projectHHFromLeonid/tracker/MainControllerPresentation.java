package projectHHFromLeonid.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;



@RestController

public class MainControllerPresentation {

    private final MainServiceDomain mainServiceDomain;


    public MainControllerPresentation(MainServiceDomain mainServiceDomain) {
        this.mainServiceDomain = mainServiceDomain;
    }


    @GetMapping("/download_vacancies")
    public void downloadVacancies() {
        mainServiceDomain.downloadAndSaveVacancies();
    }
}