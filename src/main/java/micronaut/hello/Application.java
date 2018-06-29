package micronaut.hello;

import io.micronaut.http.annotation.Controller;
import io.micronaut.runtime.Micronaut;

@Controller("/hello")
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }



}