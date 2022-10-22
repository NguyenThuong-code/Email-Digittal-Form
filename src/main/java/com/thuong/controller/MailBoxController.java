package com.thuong.controller;

import com.thuong.model.MailBox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MailBoxController {
    @GetMapping("")
    public String getMailBox(Model model){
        model.addAttribute("mailbox", new MailBox());
        List<String> listLanguages=new ArrayList<>();
        listLanguages.add("English");
        listLanguages.add("Vietnamese");
        listLanguages.add("Japanese");
        listLanguages.add("Chinese");
        model.addAttribute("listLanguages", listLanguages);
        List<Integer> listSize= new ArrayList<>();
        listSize.add(5);
        listSize.add(10);
        listSize.add(15);
        listSize.add(25);
        listSize.add(50);
        listSize.add(100);
        model.addAttribute("listLanguages", listLanguages);
        model.addAttribute("listSize", listSize);
        return "/home";
    }
    @PostMapping("/addMailBox")
    public String addMailBox(@ModelAttribute("mailbox") MailBox mailBox, Model model) {
        model.addAttribute("mailbox", mailBox);
        return "/view";
    }
}
