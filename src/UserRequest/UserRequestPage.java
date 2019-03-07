/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserRequest;

import java.util.Date;

/**
 *
 * @author Sheetal Sekhar
 */
public class UserRequestPage {
    
    private String name;
    private String DOB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
    public UserRequestPage(String name,String DOB)
    {
        this.name=name;
        this.DOB=DOB;
     //   UserRequestPage = new UserRequestPage(name, DOB);
    }
    
    
    
}
