package AbstarctFactoryMode;

public class SqlServerUser implements ITest<User> {

    @Override
    public void insert(User user) {
        System.out.println("add a record in sqlserver");
    }

    @Override
    public User getObject(String id) {
        System.out.println("get a record fron sqlserver");
        return null;
    }
}
