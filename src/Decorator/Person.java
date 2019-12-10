package Decorator;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

//    public void wearTShirts() {
//        System.out.println("大T恤");
//    }
//
//    public void wearBigTrouser() {
//        System.out.println("垮裤");
//    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}
