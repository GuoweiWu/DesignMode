package ObserverMode;

public class StockObserver extends Observer{

    public StockObserver(String name) {
        super(name);
    }

    public void CloseStockMarket(){
        System.out.println(name + "继续工作");
    }

}
