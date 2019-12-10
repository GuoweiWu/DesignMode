package SimpleFactory;

public class OperationSub extends Operation {
    @Override
    public double getResult(){
        double result = 0;
        return getNumberA() - getNumberB();
    }
}
