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
public class ClothingWorkQueue {
    
    private ArrayList<ClothingWorkRequest> clothingWorkRequestList;

    public ClothingWorkQueue() {
        clothingWorkRequestList = new ArrayList();
    }

    public ArrayList<ClothingWorkRequest> getWorkRequestList() {
        return clothingWorkRequestList;
    }
}