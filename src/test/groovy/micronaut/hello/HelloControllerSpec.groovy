package micronaut.hello

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class HelloControllerSpec extends Specification {

    @Shared @AutoCleanup
    EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

    void "test generic hello"() {
        given:
        HelloClient client = embeddedServer.applicationContext.getBean(HelloClient)

        expect:
        client.hello() == "Hello work"
    }

    void "test specific hello"() {
        given:
        HelloClient client = embeddedServer.applicationContext.getBean(HelloClient)

        expect:
        client.hello("guy") == "Hello guy"
    }

}
