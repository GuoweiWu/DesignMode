package SimpleFactory;

public class OperationMul extends Operation {
    @Override
    public double getResult(){
        double result = 0;
        return getNumberA() * getNumberB();
    }
}
