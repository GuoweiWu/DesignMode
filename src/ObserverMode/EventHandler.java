package ObserverMode;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class EventHandler {
    private List<Event> events;

    public EventHandler() {
        events = new ArrayList<>();
    }

    public void addEvent(Object object,String methodName,Object... args){
        events.add(new Event(object,methodName,args));
    }

    public void notifyAllObserver() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for (Event event : events){
            event.invoke();
        }
    }
}
