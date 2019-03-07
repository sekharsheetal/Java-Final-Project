/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserRequest;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author Sheetal Sekhar
 */
public class foodRequestDirectory {
       private ArrayList<foodRequest> foodRequestList;
       
       public foodRequestDirectory() {
        foodRequestList = new ArrayList();
    }

    public ArrayList<foodRequest> getFoodRequestList() {
        return foodRequestList;
    }

    public void setFoodRequestList(ArrayList<foodRequest> foodRequestList) {
        this.foodRequestList = foodRequestList;
    }

   
public void addRequest(foodRequest fd)
{
    foodRequestList.add(fd);
}
    public foodRequest createFoodRequest(String message){
        foodRequest fd = new foodRequest(message);
        //fd.setMessage(message);
        foodRequestList.add(fd);
        return fd;
    }
 
    
}
