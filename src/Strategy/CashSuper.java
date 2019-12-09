package Strategy;

abstract class CashSuper {
    public abstract double acceptCash(double money);
}

class CashRebate extends CashSuper {
    private double moneyRebate = 1;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return moneyRebate * money;
    }
}

class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}

class CashReturn extends CashSuper {

    private double moneyCondition = 0;
    private double moneyReturn = 0;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}

//class CashFactory {
//    public static CashSuper createrCashAccept(String type) {
//        CashSuper cs = null;
//        switch (type){
//            case "正常收费":
//                cs = new CashNormal();
//                break;
//            case "满300反100":
//                CashReturn cr1 = new CashReturn("300","100");
//                cs = cr1;
//                break;
//            case "8折":
//                CashRebate cr2 = new CashRebate("0.8");
//                cs = cr2;
//                break;
//        }
//        return cs;
//    }
//}