package FactoryMethod.Operate;

import SimpleFactory.Operation;
import SimpleFactory.OperationSub;

public class SubFactory implements IFactory{
    @Override
    public Operation CreateOperation() {
        return new OperationSub();
    }
}
