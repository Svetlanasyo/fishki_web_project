package flashki.web.project.flashki;

import flashki.web.project.flashki.config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlashkiApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Class<?>[] {FlashkiApplication.class, JpaConfig.class}, args);
    }

}

