package cn.sanii.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shouliang.wang
 * @date 2020/8/12 0012 16:13
 * @des
 */
@Controller
public class HelloController {


    @ResponseBody
    @GetMapping("/hi")
    public String hi(){
        return "hi jenkins update";
    }


}
