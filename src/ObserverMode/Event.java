package ObserverMode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Event {
    private Object object;

    private String methodName;

    private Object[] params;

    private Class[] paramTypes;

    public Event() {
    }

    public Event(Object object, String methodName, Object... args) {
        this.object = object;
        this.methodName = methodName;
        this.params = args;
        contractParamTypes(this.params);
    }

    private void contractParamTypes(Object[] params) {
        int length = params.length;
        this.paramTypes = new Class[length];
        for (int i = 0; i < length; i++) {
            paramTypes[i] = params[i].getClass();
        }
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(Class[] paramTypes) {
        this.paramTypes = paramTypes;
    }

    public void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = object.getClass().getMethod(this.getMethodName(),this.getParamTypes());

        if (null == method){
            return;
        }
        method.invoke(this.getObject(),this.getParams());
    }
}
