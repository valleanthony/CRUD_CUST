package com.example.customer_sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    CustRepo custRepo;

    @RequestMapping("/")
    public String listcust(Model model){
        model.addAttribute("customers",custRepo.findAll());
        return "list";
    }


    @GetMapping("/add")
    public String custForm(Model model){
        model.addAttribute("customer",new Customer());
        return "form";
    }

    @PostMapping("/process")
    public String processForm(@Valid Customer customer, BindingResult result){
        if (result.hasErrors()){
            return "form";
        }
        custRepo.save(customer);
        return "redirect:/";
    }

    @RequestMapping("/detail/{id}")
    public String showCust(@PathVariable("id") long id, Model model){
        model.addAttribute("tweet",custRepo.findById(id).get());
        return "mytweet";
    }

    @RequestMapping("/update/{id}")
    public String updateTwee(@PathVariable("id") long id, Model model){
        model.addAttribute("tweet",custRepo.findById(id).get());
        return "form";
    }

    @RequestMapping("/delete/{id}")
    public String delTweet(@PathVariable("id") long id){
        custRepo.deleteById(id);
        return "redirect:/";
    }



}
