package FactoryMethod.LeiFeng;

public class SimpleFactory {
    public static LeiFeng CreateLeiFeng(String type){
        LeiFeng result = null;
        switch (type){
            case "学雷锋的大学生":
                result = new Undergraduate();
                break;
            case "社区志愿者":
                result = new Volunteer();
                break;
        }
        return result;
    }
}
