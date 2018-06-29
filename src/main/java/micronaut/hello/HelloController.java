package micronaut.hello;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {
    @Get("/{name}")
    public String hello(String name) {
        return "Hello " + name;
    }

    @Get("/")
    public String hello1() {
        return "Hello work";
    }
}