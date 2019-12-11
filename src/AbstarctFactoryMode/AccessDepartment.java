package AbstarctFactoryMode;

public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("Access add a dep record");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("Access get a dep record");
        return null;
    }
}
