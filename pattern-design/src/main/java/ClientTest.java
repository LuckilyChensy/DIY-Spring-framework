import com.exp.proxy.jdk.Foo;
import com.exp.proxy.jdk.FooImpl;
import com.exp.proxy.jdk.FooProxy;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
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
        // 与被代理类相同的类加载器, Class类元数据,
        Foo foo = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),new Class<?>[] { Foo.class },new FooProxy());

        foo.testFoo();
    }

    @Test
    public void testMethod03() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //设置saveGeneratedFiles值为true生成class字节码到文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Class<?> proxyClass = Proxy.getProxyClass(Foo.class.getClassLoader(), new Class[]{Foo.class});

        Foo f = (Foo) proxyClass.getConstructor(InvocationHandler.class).newInstance(new FooProxy());

        f.testFoo();

    }

}
