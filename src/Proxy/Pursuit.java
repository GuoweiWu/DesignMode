package Proxy;

public class Pursuit implements GiveGift{
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    public void giveDolls() {
        System.out.println(mm.getName() + "洋娃娃");
    }

    public void giveFlowers() {
        System.out.println(mm.getName() + "鲜花");
    }

    public void giveChocolate(){
        System.out.println(mm.getName() + "巧克力");
    }
}
