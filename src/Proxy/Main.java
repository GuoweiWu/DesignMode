package Proxy;

public class Main {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("娇娇");

        Proxy daili = new Proxy(jiaojiao);

        daili.giveChocolate();
        daili.giveDolls();
        daili.giveFlowers();
    }
}
