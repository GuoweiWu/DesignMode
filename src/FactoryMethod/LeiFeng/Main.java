package FactoryMethod.LeiFeng;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.CreateLeiFeng();

        student.buyRice();
    }
}
