package xforce.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        return "index";//返回结果为字符串
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}