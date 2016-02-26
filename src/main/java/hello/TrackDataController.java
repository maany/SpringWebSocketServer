package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by devmaany on 26/2/16.
 */
@Controller
public class TrackDataController {

    @MessageMapping("/track")
    @SendTo("/topic/trackdata")
    public String trackDataHandler(TrackData data) throws Exception {
        System.out.println("**** Track Data aaya*****");
        System.out.println("POSITIONS : " + data.getPositions());
        // Thread.sleep(3000); // simulated delay
        return "{'positions' : " + data.getPositions() + "}";
    }
}
