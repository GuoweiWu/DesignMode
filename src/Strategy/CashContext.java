package Strategy;

class CashContext {
    CashSuper cashSuper = null;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                CashNormal cs0 = new CashNormal();
                cashSuper = cs0;
                break;
            case "满减":
                CashReturn cr1 = new CashReturn("300", "199");
                cashSuper = cr1;
                break;
            case "8":
                CashRebate cr2 = new CashRebate("0.8");
                cashSuper = cr2;
                break;
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
