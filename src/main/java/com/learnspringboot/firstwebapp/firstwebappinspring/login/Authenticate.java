package com.learnspringboot.firstwebapp.firstwebappinspring.login;

import org.springframework.stereotype.Service;

@Service
public class Authenticate {

    public boolean isAuthenticate(String Name,String Password){
        boolean name=Name.equalsIgnoreCase("Raghav");
        boolean pass=Password.equalsIgnoreCase("Raghav");

        return name&& pass;
    }
    
}
