/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class TransportWorkQueue {
    
    private ArrayList<FoodWorkRequest> foodWorkRequestList;

    public TransportWorkQueue() {
        foodWorkRequestList = new ArrayList();
    }

    public ArrayList<FoodWorkRequest> getWorkRequestList() {
        return foodWorkRequestList;
    }
}