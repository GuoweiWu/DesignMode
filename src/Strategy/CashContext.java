package Strategy;

class CashContext {
    private CashSuper cashSuper = null;

    CashContext(String type) {
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满减":
                cashSuper = new CashReturn("300", "199");
                break;
            case "8":
                cashSuper = new CashRebate("0.8");
                break;
        }
    }

    double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
