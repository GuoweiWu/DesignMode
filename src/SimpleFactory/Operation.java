package SimpleFactory;

public class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult() throws Exception {
        double result = 0;
        return result;
    }

}

class OperationAdd extends Operation {
    @Override
    public double getResult(){
        double result = 0;
        return getNumberA() + getNumberB();
    }
}

class OperationSub extends Operation {
    @Override
    public double getResult(){
        double result = 0;
        return getNumberA() - getNumberB();
    }
}
class OperationMul extends Operation {
    @Override
    public double getResult(){
        double result = 0;
        return getNumberA() * getNumberB();
    }
}
class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        double result = 0;
        if (getNumberB() == 0){
            throw new Exception("除数不为0");
        }
        return getNumberA() / getNumberB();
    }
}