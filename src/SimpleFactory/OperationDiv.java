package SimpleFactory;

public class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        double result = 0;
        if (getNumberB() == 0){
            throw new Exception("除数不为0");
        }
        return getNumberA() / getNumberB();
    }
}
