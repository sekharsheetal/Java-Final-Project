/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.ClothingEnterprise;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;

        
         if (type.getValue().equals(Type.ClothingConsumer.getValue())){
            organization = new ClothingConsumerOrganization();
            organizationList.add(organization);
        }
          if (type.getValue().equals(Type.ClothingSupplier.getValue())){
            organization = new ClothingSupplierOrganization();
            organizationList.add(organization);
        }
           if (type.getValue().equals(Type.FoodConsumer.getValue())){
            organization = new FoodConsumerOrganization();
            organizationList.add(organization);
        }
           if (type.getValue().equals(Type.FoodSupplier.getValue())){
            organization = new FoodSupplierOrganization();
            organizationList.add(organization);
        }
           if (type.getValue().equals(Type.TransportDistributor.getValue())){
            organization = new TransportDistributorOrganization();
            organizationList.add(organization);
        }
        
        
        return organization;
    }
}