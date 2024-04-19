package cs489.miu.adsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdsapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdsapiApplication.class, args);
        System.out.println("Spring Application started");
    }

}
