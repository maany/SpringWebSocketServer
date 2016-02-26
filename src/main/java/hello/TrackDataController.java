package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by devmaany on 26/2/16.
 */
@Controller
public class TrackDataController {

    @MessageMapping("/track")
    @SendTo("/topic/trackdata")
    public Greeting greetingop(HelloMessage message) throws Exception {
        System.out.println("**** Greeting aaya*****");
        Thread.sleep(3000); // simulated delay
        return new Greeting("Hello from controller, " + message.getName() + "!");
    }
}
