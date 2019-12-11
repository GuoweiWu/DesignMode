package ObserverMode;

public class NBAObserver extends Observer {
    public NBAObserver(String name) {
        super(name);
    }

    public void CloseNBA() {
        System.out.println("nba" + name);
    }
}
