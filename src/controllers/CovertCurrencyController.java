package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.security.mscapi.CPublicKey;

@Controller
public class CovertCurrencyController {
    @GetMapping("/converter")
    public String converter() {
        return "interface";
    }

//@GetMapping("/result")
//public String result(@RequestParam String usd, Model model) {
//    float result = Float.parseFloat(usd) * 20000;
//    model.addAttribute("result", result);
//    model.addAttribute("input", usd);
//    return "interface";
//}

    @PostMapping("/result")
    public String result(@RequestParam String usd, Model model) {
        float result = Float.parseFloat(usd) * 20000;
        model.addAttribute("result", result);
        model.addAttribute("input", usd);
        return "interface";
    }

}
