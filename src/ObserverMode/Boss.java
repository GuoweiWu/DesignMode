package ObserverMode;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Boss extends Notifier {
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("有新的员工为老板的到来准备");
        this.getEventHandler().addEvent(object,methodName,args);
    }

    @Override
    public void notifyAllObserver() {
        System.out.println("老板来了");
        try {
            this.getEventHandler().notifyAllObserver();
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}
