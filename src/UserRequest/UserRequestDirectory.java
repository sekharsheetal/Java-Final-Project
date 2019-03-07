/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserRequest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sheetal Sekhar
 */
public class UserRequestDirectory {
    private List<UserRequestPage> UserRequestList;

    public List getUserRequestList() {
        return UserRequestList;
    }

    public void setUserRequestList(List UserRequestList) {
        this.UserRequestList = UserRequestList;
    }
    
    public UserRequestDirectory()
    {
        
         UserRequestList= new ArrayList<UserRequestPage>();
    }
    
    public void addUserRequest(UserRequestPage ur)
    {
       
        UserRequestList.add(ur);
    }
    
    
    
}
