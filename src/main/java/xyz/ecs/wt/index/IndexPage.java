package xyz.ecs.wt.index;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController()
public class IndexPage {
    @RequestMapping("/index")
    public ModelAndView indexPage(ModelAndView mav){
        mav.setViewName("/index");
        return mav;
    }
}
