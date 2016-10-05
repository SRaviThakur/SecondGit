package com.galaxe.rst;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/hello")
	
	public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res) {  
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        if(name.equals("")||password.equals(""))
        {
        	return new ModelAndView("errorpage", "message","Please enter all the details");
        }
        else if(!password.equals("galaxe")){  
        	return new ModelAndView("errorpage", "message","Sorry, password is incorrect");
          
        }  
        else{  
        	String message = "Hi, "+name;  
            return new ModelAndView("profilepage", "message", message);
        }  
    }  
	@RequestMapping("/")
	  public String homepage2(){
	    return "login";
	  }
	@RequestMapping("/logout")
	  public String homepage(){
	    return "login";
	  }
	
}
