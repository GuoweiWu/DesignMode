package ObserverMode;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();

        Secretary secretary = new Secretary();

        Observer tongshi1 = new StockObserver("111");
        Observer tongshi2 = new NBAObserver("222");

        secretary.addListener(tongshi1,"CloseStockMarket");
        secretary.addListener(tongshi2,"CloseNBA");

        secretary.notifyAllObserver();
    }
}
