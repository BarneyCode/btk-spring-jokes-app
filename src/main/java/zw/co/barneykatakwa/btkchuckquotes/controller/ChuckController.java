package zw.co.barneykatakwa.btkchuckquotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zw.co.barneykatakwa.btkchuckquotes.service.ChuckNorrisServiceImpl;

/**
 * Project Name btk-chuck-quotes
 * Developed by bkatakwa
 * Date         24/7/2020
 */
@Controller
public class ChuckController {
    private ChuckNorrisServiceImpl chuckNorrisServiceImpl;

    @Autowired
    public ChuckController(ChuckNorrisServiceImpl chuckNorrisServiceImpl) {
        this.chuckNorrisServiceImpl = chuckNorrisServiceImpl;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){
        model.addAttribute("joke", chuckNorrisServiceImpl.getRandomQuote());
        return "chucknorris";
    }
}
