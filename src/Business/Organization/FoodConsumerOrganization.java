/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FoodConsumerRole;
import Business.Role.Role;
//import FoodOrganisation.OrganizationFood;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class FoodConsumerOrganization extends Organization{

    public FoodConsumerOrganization() {
        super(FoodConsumerOrganization.Type.FoodConsumer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodConsumerRole());
        return roles;
    }
     
}