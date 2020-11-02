package helloworld.extensions;

import com.plentymarkets.tool.core.event.BaseEventListener;
import com.plentymarkets.tool.core.event.EventBean;
import com.plentymarkets.tool.plugins.api.extensions.EventExtension;
import org.pf4j.Extension;

import java.util.HashMap;
import java.util.Map;

@Extension
public class EventListenerExtension implements EventExtension {
    @Override
    public Map<String, BaseEventListener> getEventListeners() {
        Map<String, BaseEventListener> eventListenerMap = new HashMap<>();
        eventListenerMap.put("helloworld", new BaseEventListener() {
            @Override
            public void fireEvent(EventBean eventBean) {
                System.out.println("Hello world!");
            }
        });

        return eventListenerMap;
    }
}
