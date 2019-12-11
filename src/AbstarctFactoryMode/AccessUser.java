package AbstarctFactoryMode;

public class AccessUser implements ITest<User> {

    @Override
    public void insert(User user) {
        System.out.println("using Access to User add a new record");
    }

    @Override
    public User getObject(String id) {
        System.out.println("using Access to User get a record");
        return null;
    }
}
