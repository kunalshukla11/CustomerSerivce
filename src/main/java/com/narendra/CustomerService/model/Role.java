package com.narendra.CustomerService.model;

import java.util.Arrays;
import java.util.Optional;

public enum Role {
    ADMIN(new String[]{"read","right","delete"}),
    DEVELOPER(new String[]{"read","right","maintain"});


   private String[] accesses;

       Role(String[] accesses){
        this.accesses=accesses;
    }

}
