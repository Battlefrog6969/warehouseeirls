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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class masterStockControlller{

    @Autowired
    masterStockRepo masterrepo;
    
    @Autowired
    return_productsRepo returnProductsrepo;



    @RequestMapping(value = "/supplierform", method = RequestMethod.GET)
    public ModelAndView supplierform() {
        return new ModelAndView("supplierform", "mastermodel", new masterstock_model());


    }


    @ResponseBody
    @RequestMapping(value = "/addItem", method = RequestMethod.POST)
    public void addItem(masterstock newRecord){
        
        masterrepo.save(newRecord);
    


    }    
    
    @ResponseBody
    @RequestMapping(value = "/updateItem", method = RequestMethod.PUT)
    public  String updateItem(@Valid @ModelAttribute("mastermodel") masterstock_model msmd, 
    BindingResult result, ModelMap model){

        String prodname= msmd.getProductName();
        int quantity = msmd.getQuantity();

        masterstock m= masterrepo.findByProductName(prodname);
        int newQuantity = quantity + m.getQuantity();

        masterrepo.updateQuantity(prodname, newQuantity);
        return "index";
      
    }

    @ModelAttribute("productList")
    public Map<String, String> getProductList() {
    
      
      Map<String, String> productList = new HashMap<String, String>();
     
     List<return_products> ilist = returnProductsrepo.findAll();
    
     for (return_products var : ilist) {
    
        productList.put(var.getProduct_name(), var.getProduct_name());
       
     }
     return productList;
    }

}