package AbstarctFactoryMode;

public interface IFactory {
    ITest<User> CreateUser();

    IDepartment CreateDepartment();
}
