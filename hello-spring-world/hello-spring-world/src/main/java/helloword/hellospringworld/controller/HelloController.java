package helloword.hellospringworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello!!");
                // return : resources/templates folder 밑에 있는 hello 찾아서 렌더링 하는 부분
                return "hello";
                
    }
}
