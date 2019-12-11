package AbstarctFactoryMode;

public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("in sqlserver to add a dep record");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("in sql server get a dep record");
        return null;
    }
}
