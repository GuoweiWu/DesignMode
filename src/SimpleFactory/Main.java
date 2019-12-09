package SimpleFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("输入A");
            String strNumA = sc.next();
            System.out.println("输入运算符");
            String strOperate = sc.next();
            System.out.println("输入B");
            String strNumB = sc.next();


            Operation oper;
            oper = OperationFactory.createOperate(strOperate);
            oper.setNumberA(Double.parseDouble(strNumA));
            oper.setNumberB(Double.parseDouble(strNumB));
            double result = oper.getResult();
            System.out.println("结果是" + result);
        }
        catch (Exception e){
            System.out.println("输入错误");
        }
    }
}
