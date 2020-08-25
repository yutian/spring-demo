import com.space127.bean.populate.B;
import com.space127.bean.populate.PopulateConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/24 21:05
 * @desc :
 */
public class PopulateTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PopulateConfig.class);
        System.out.println("容器创建完毕...");
        B b = (B) ac.getBean("b");
        b.test();
        ac.close();
    }
}
