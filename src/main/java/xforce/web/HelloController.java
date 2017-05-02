package xforce.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liushuwei on 2017/5/1.
 */
//表明这是一个 Controller
@Controller
//RestController是一种Rest风格的Controller，可以直接返回对象而不返回视图，返回的对象可以使JSON，XML等
//@SimpleRestController
//使用自动配置，主动添加并解析bean，配置文件等信息
@EnableAutoConfiguration

public class HelloController {
    //设置访问的url
    @RequestMapping("/")
    //表示返回JSON格式的结果，如果前面使用的是@RestController可以不用写
    @ResponseBody
    String home() {
        return "Hello World!";//返回结果为字符串
    }
}