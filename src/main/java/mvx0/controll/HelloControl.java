package mvx0.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by qiaoyang on 2017/2/12.
 */
@Controller
@RequestMapping(value = "test")
public class HelloControl {
    @RequestMapping(value = "/hello")
    public String hello() {
        System.out.println("hello.............");
        return "hello";
    }
}
