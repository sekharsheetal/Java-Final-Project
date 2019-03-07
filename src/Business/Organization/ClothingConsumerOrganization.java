/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClothingConsumerRole;
import Business.Role.Role;
//import ClothingOrganization.OrganizationClothing;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ClothingConsumerOrganization extends Organization{

    public ClothingConsumerOrganization() {
        super(ClothingConsumerOrganization.Type.ClothingConsumer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClothingConsumerRole());
        return roles;
    }
     
}