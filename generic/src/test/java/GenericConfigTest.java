import com.space127.generic.spring.GenericConfig;
import com.space127.generic.spring.service.TestService;
import com.space127.generic.spring.service.TestService2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/4 13:39
 * @desc :
 */
public class GenericConfigTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(GenericConfig.class);
        System.out.println("容器创建完毕...");
        TestService testService = (TestService) ac.getBean("testService");
        TestService2 testService2 = (TestService2) ac.getBean("testService2");

        testService.test();

        testService2.test();
        ac.close();
    }


}
