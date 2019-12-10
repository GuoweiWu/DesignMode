package Decorator;

public class Main {
    public static void main(String[] args) {
        Person xc = new Person("小菜");
        System.out.println("第一种装扮");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        tShirts.Decorate(xc);
        bigTrouser.Decorate(tShirts);
        bigTrouser.show();
    }


}
