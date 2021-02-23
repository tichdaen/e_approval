package com.tichdaen.approval.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/document")
    public String approval(Model model) {

        String js = "/js/a.js";
        String docs = "<a>aaaa</a>";

        model.addAttribute("docs", docs);
        model.addAttribute("js", js);

        return "approval";
    }
}
