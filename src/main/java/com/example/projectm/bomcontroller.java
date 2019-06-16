package com.example.projectm;

import java.text.ParseException;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class bomcontroller{

    @Autowired
    bomrepo bomrepo;

    @ResponseBody
    @RequestMapping(value = "/boms", method = RequestMethod.GET)
    public List<bom> getboms(){
         
        return bomrepo.findAll(); 
    }

    @RequestMapping(value = "/bomview", method = RequestMethod.GET)  
    public ModelAndView bomView(ModelAndView model) throws ParseException {

         
        List<bom> list = bomrepo.findAll();

        model.addObject("list", list);
        model.setViewName("billofmaterials");

        return model;
    }


    public void checkStatus () {
        
    String theUrl2 = "ashleyurl";
    
    RestTemplate restTemplates = new RestTemplate();

    try {

      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
     
      HttpEntity<String> entities = new HttpEntity<String>("parameters", headers);

      ResponseEntity<bom[]> respEntity2 = restTemplates.exchange(theUrl2, HttpMethod.GET, entities,
      bom[].class);
        
      bom[] resp = respEntity2.getBody();
      List<bom> bomList = new ArrayList<>();
      

      for (bom b: resp) {
            for(bom newB: bomList) {
                newB.setCreatedDate(b.getCreatedDate());
                newB.setOrderItemid(b.getOrderItemid());
                newB.setUpdatedDate(b.getUpdatedDate());
                newB.setStatus("Delivered");
                bomrepo.save(newB);
            }
      }

        }catch(Exception e) {

        }
    }
}