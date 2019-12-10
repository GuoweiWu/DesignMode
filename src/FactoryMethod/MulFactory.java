package FactoryMethod;

import SimpleFactory.Operation;
import SimpleFactory.OperationMul;
import SimpleFactory.OperationSub;

public class MulFactory implements IFactory{
    @Override
    public Operation CreateOperation() {
        return new OperationMul();
    }
}
