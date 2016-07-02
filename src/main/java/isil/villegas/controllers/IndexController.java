package isil.villegas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kento on 7/1/16.
 */
@Controller
public class IndexController {

    @RequestMapping ("/")
    String index() {
        return "index";
    }
}
