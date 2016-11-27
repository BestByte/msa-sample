package demo.msa.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 37wan on 2016/11/26.
 */
@RestController
@SpringBootApplication(scanBasePackages = "demo.msa")
public class SampleApplication {

    @RequestMapping(name="HelloService", method = RequestMethod.GET
    ,path="/hello")
    public String hello() {
        return "hello";
    }
    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class,args);
    }
}
