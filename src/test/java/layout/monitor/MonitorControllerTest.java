package layout.monitor;

import com.amplabs.messagingapi.AmpMessagingApi;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MonitorControllerTest {
    @Test
    void canGetMessages() {
        List<AmpMessagingApi.AmpMessage> ampMessages = AmpMessagingApi.consumeMessages();
    }
//
}