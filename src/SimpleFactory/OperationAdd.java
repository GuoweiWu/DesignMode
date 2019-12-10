package SimpleFactory;

public class OperationAdd extends Operation {

    @Override
    public double getResult(){
        double result = 0;
        return getNumberA() + getNumberB();
    }
}
