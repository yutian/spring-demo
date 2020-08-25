import com.space127.bean.postprocesser.LifecycleConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/4 13:39
 * @desc :
 */
public class LifecycleTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(LifecycleConfig.class);
        System.out.println("容器创建完毕...");
        ac.close();
    }


}
