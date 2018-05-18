package layout.monitor;

import com.amplabs.messagingapi.AmpMessagingApi;
import javafx.fxml.FXML;

import java.util.List;

public class MonitorController {

    @FXML
    private void refresh() {
        List<AmpMessagingApi.AmpMessage> ampMessages = AmpMessagingApi.consumeMessages();

    }
}
