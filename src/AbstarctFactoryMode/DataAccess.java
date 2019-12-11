package AbstarctFactoryMode;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DataAccess {
    private static String db = "SqlServer";

    public static ITest<User> createUser() {
//        IUser result = null;
//        switch (db){
//            case "SqlServer":
//                result = new SqlServerUser();
//                break;
//            case "Access":
//                result = new AccessUser();
//                break;
//        }
//        return result;

        String className = "AbstarctFactoryMode." + db + "User";
        System.out.println(className);
        Class<ITest<User>> clazz;
        Constructor<ITest<User>> constructor = null;
        try {
            clazz = (Class<ITest<User>>) Class.forName(className);
            constructor = clazz.getConstructor(null);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }finally {
            try {
                assert constructor != null;
                return (ITest<User>) constructor.newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static IDepartment createDepartment() {
        IDepartment result = null;
        switch (db) {
            case "SqlServer":
                result = new SqlServerDepartment();
                break;
            case "Access":
                result = new AccessDepartment();
                break;
        }
        return result;
    }
}
