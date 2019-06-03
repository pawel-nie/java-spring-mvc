package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    // need a controler method to show the initial form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    // need a controler method to process the form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    // need a controller method to read data and uppercase them
    // add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShout(HttpServletRequest request, Model model){

        //read the request parameter
        String theName = request.getParameter("studentName");

        //convert to alluppercase
        theName = theName.toUpperCase();

        //create the message
        String result = "Yo! " + theName;

        //add the message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
