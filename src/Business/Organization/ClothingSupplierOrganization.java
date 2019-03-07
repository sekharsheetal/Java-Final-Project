/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Role.ClothingSupplierRole;
import Business.Role.ClothingSupplierRole;
import Business.Role.Role;
//import ClothingOrganization.OrganizationClothing;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ClothingSupplierOrganization extends Organization{

    public ClothingSupplierOrganization() {
        super(ClothingSupplierOrganization.Type.ClothingSupplier.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClothingSupplierRole());
        return roles;
    }
     
}