import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class helloWorld {

    @RequestMapping("/")
    String helloWorld(){
        return "Hello World! First Microservice created. \n";
    }

    @RequestMapping("/name")
    String name(){
        return "My name is shiva! \n";
    }

    public static void main(String[] args) {
        SpringApplication.run(helloWorld.class, args);
    }
}
