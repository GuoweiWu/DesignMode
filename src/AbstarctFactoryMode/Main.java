package AbstarctFactoryMode;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        IFactory factory = new SqlServerFactory();

        ITest<User> iu = DataAccess.createUser();

        assert iu != null;
        iu.insert(user);
        iu.getObject("1");

    }
}
