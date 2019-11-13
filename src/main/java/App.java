import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import io.github.cdimascio.dotenv.Dotenv;

@RestController
@EnableAutoConfiguration
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);


    private static String GREETING;

    @RequestMapping("/hello/{name}")
    Map<String, String>  hello(@PathVariable String name) {
        Map<String, String> resp = new HashMap<String, String>();
        logger.info(name);

        resp.put("message", GREETING + " " + name);
        return resp;
    }

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        GREETING = dotenv.get("GREETING", "Hello");

        SpringApplication.run(App.class, args);
    }

}