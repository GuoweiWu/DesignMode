package AbstarctFactoryMode;

public class AccessFactory implements IFactory {
    @Override
    public ITest<User> CreateUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment CreateDepartment() {
        return new AccessDepartment();
    }
}
