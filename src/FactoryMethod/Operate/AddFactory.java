package FactoryMethod.Operate;

import SimpleFactory.Operation;
import SimpleFactory.OperationAdd;

public class AddFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationAdd();
    }
}
