package FactoryMethod.Operate;

import SimpleFactory.Operation;
import SimpleFactory.OperationMul;

public class MulFactory implements IFactory{
    @Override
    public Operation CreateOperation() {
        return new OperationMul();
    }
}
