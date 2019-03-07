/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FoodSupplierRole;
import Business.Role.Role;
//import FoodOrganisation.OrganizationFood;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class FoodSupplierOrganization extends Organization{

    public FoodSupplierOrganization() {
        super(FoodSupplierOrganization.Type.FoodSupplier.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodSupplierRole());
        return roles;
    }
     
}