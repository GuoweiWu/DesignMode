package FactoryMethod.Operate;

import SimpleFactory.Operation;
import SimpleFactory.OperationDiv;

public class DivFactory implements IFactory{
    @Override
    public Operation CreateOperation() {
        return new OperationDiv();
    }
}
