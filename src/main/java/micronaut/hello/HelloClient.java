package micronaut.hello;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.Client;

@Client("/hello")
interface HelloClient {
    @Get("/{name}")
    String hello(String name);
}
