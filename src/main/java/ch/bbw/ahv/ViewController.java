package ch.bbw.ahv;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ViewController
 * 
 * @author Peter Rutschmann
 * @date 23.09.2022
 */
@Controller
public class ViewController {

    @GetMapping("/")
    public String redirect() {
        return "redirect:/ahv";
    }

    @GetMapping("/ahv")
    public String showView(Model model) {
        model.addAttribute("eckstein", "--");
        return "infoView";
    }

    @PostMapping(value = "/ahv", params = { "numberbutton=one" })
    public String showViewOne(Model model) {
        model.addAttribute("eckstein", "Verfassungsgrundlage 1925");
        return "infoView";
    }

    @PostMapping(value = "/ahv", params = { "numberbutton=two" })
    public String showViewTwo(Model model) {
        model.addAttribute("eckstein", "Einführung 1. Januar 1948");
        return "infoView";
    }

    @PostMapping(value = "/ahv", params = { "numberbutton=three" })
    public String showViewThree(Model model) {
        model.addAttribute("eckstein", "10. AHV-Revision war 1995");
        return "infoView";
    }

    @PostMapping(value = "/ahv", params = { "numberbutton=four" })
    public String showViewFour(Model model) {
        model.addAttribute("eckstein", "Neuste AHV-Revision war 2022");
        return "infoView";
    }

}
