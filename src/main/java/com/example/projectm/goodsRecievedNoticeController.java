package com.example.projectm;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class goodsRecievedNoticeController{


    @Autowired
    goodsRecievedRepo goodsRecievedrepo;

    @ResponseBody
    @RequestMapping(value = "/goodsrecieved", method = RequestMethod.GET)
    public List<goodsRecieved> getboms(){
         
        return goodsRecievedrepo.findAll(); 
    }



  

    @RequestMapping(value = "/goodsreceieved", method = RequestMethod.GET)
    public ModelAndView showExchange(ModelAndView model) throws ParseException {

       
        List<goodsRecieved> list = goodsRecievedrepo.findAll();

        model.addObject("list", list);
        model.setViewName("exchange");

        return model;
    }

    
}