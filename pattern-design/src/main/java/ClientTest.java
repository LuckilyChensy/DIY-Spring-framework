import com.exp.proxy.jdk.Foo;
import com.exp.proxy.jdk.FooImpl;
import com.exp.proxy.jdk.FooProxy;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;


public class ClientTest {

    /**
     * 调用对象方式
     */
    @Test
    public void testMethod01(){
        new FooImpl().testFoo();
    }

    @Test
    public void testMethod02(){
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        Foo foo = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),new Class<?>[] { Foo.class },new FooProxy());
       foo.testFoo();
    }

}
