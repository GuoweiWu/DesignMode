package FactoryMethod;

import SimpleFactory.Operation;
import SimpleFactory.OperationAdd;
import SimpleFactory.OperationSub;

public class SubFactory implements IFactory{
    @Override
    public Operation CreateOperation() {
        return new OperationSub();
    }
}
