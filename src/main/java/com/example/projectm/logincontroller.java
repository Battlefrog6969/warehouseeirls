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
public class logincontroller{

    @Autowired
    userrepo urepo;

    // @RequestMapping("/home")
    // public String index(){
    //     return "index";
    // }

    
    
//     @RequestMapping(value = "/addlogin", method = RequestMethod.GET)
//     public ModelAndView showForm3() {
//     return new ModelAndView("addlogin", "loginmodel", new loginmodel());
// }

//     @RequestMapping(value = "/placelogin", method = RequestMethod.POST)
//     public String submitdetails(@Valid @ModelAttribute("loginmodel") loginmodel loginmodel, 
//     BindingResult result, ModelMap model) {
    


//     login login = new login();

//     login.setU_id(loginmodel.getUId());
//     login.setPasswd(loginmodel.getPword());


//     urepo.save(login);
    
//     return "index";
// }
}