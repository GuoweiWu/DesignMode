package AbstarctFactoryMode;

public class SqlServerFactory implements IFactory {
    @Override
    public ITest<User> CreateUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment CreateDepartment() {
        return new SqlServerDepartment();
    }
}
