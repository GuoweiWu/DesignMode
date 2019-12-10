package FactoryMethod.Operate;

import SimpleFactory.Operation;

public class Main {
    public static void main(String[] args) throws Exception {
        IFactory operFactory = new AddFactory();
        Operation operAdd = operFactory.CreateOperation();
        operAdd.setNumberA(1);
        operAdd.setNumberB(2);
        double res = operAdd.getResult();
        System.out.println(res);
    }
}
