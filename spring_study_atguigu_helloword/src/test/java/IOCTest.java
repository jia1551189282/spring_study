import com.jiajia.study.bean.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zjiajia
 * @Date 2020/8/18 20:56
 */


public class IOCTest {


    @Test
    public void testIoc(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ioc.xml");
        Person person = (Person)classPathXmlApplicationContext.getBean("person");
        System.out.println(person);
    }
}
