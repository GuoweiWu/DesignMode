package Strategy;

public class Main {
    double total = 0;
    double price = 0;
    int num = 0;

    private void okClick(Object sender) {
        CashContext csuper = new CashContext("8zhe ");
        double totalPrices = 0;
        totalPrices = csuper.getResult(num * price);

    }
}
