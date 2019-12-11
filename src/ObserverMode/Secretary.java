package ObserverMode;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Secretary extends Notifier{

    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("有新的员工");
        this.getEventHandler().addEvent(object,methodName,args);
    }

    @Override
    public void notifyAllObserver() {
        System.out.println("老板回来了");
        try {
            this.getEventHandler().notifyAllObserver();
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
