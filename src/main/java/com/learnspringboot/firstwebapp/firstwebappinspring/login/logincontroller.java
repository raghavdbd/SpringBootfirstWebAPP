package com.learnspringboot.firstwebapp.firstwebappinspring.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class logincontroller {
    public Authenticate authenticate;

    //  we will do constructor injection

    public logincontroller(Authenticate authenticate){
        this.authenticate=authenticate;
    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String loginpage(){
       
        return "Loginpage";
    }

     @RequestMapping(value="login" , method =RequestMethod.POST)
     public String Welcomepage(@RequestParam String Name ,@RequestParam String password , ModelMap model){

        model.put("password", password);
        model.put("Name", Name);
        if(authenticate.isAuthenticate(Name, password)){
            return "Welcome";

        }
         return "Loginpage";


       
        
    }
    
}

