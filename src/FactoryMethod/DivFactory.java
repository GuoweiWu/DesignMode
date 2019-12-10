package FactoryMethod;

import SimpleFactory.Operation;
import SimpleFactory.OperationDiv;
import SimpleFactory.OperationSub;

public class DivFactory implements IFactory{
    @Override
    public Operation CreateOperation() {
        return new OperationDiv();
    }
}
