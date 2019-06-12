package com.example.projectm;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class usercontroller{

    @Autowired
    userrepo urepo;



    @ResponseBody
    @RequestMapping(value = "/showUser", method = RequestMethod.GET)
    public List<user> getUser(){
        return urepo.findAll(); 
    }


    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public ModelAndView showForm2() {
        return new ModelAndView("addUser", "usermodel", new usermodel());
    }

    @RequestMapping(value = "/placeUser", method = RequestMethod.POST)
    public String submitdetails(@Valid @ModelAttribute("usermodel") usermodel usermodel, 
      BindingResult result, ModelMap model) {
        
   

        user user = new user();

        user.setUser_name(usermodel.getUsername());
        user.setUser_type(usermodel.getUsertype());
        user.setPassword(usermodel.getPass());
    

        urepo.save(user);
        
        return "index";
    }

  

}

