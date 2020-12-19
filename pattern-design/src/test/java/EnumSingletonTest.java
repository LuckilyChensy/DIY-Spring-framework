import com.exp.singleton.EnumSingleton;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    @Test
    public void testMethod01() throws Exception {

        EnumSingleton instance1 = null;
        EnumSingleton instance2 = EnumSingleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);

        instance2.setData(new Object());

        FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance2);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("EnumSingleton.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        instance1 = (EnumSingleton) ois.readObject();
        ois.close();

        System.out.println(instance1.getData());
        System.out.println(instance2.getData());
        System.out.println(instance1.getData() == instance2.getData());
    }

    @Test
    public void testMethod02() throws Exception{
        Class clazz = EnumSingleton.class;
        Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
        c.setAccessible(true);
        EnumSingleton enumSingleton = (EnumSingleton)c.newInstance("Chensy",123);
    }
}
