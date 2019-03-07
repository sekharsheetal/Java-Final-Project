/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Role.TransportDistributorRole;
import Business.Role.Role;
import static Business.Role.Role.RoleType.TransportDistributorRole;
import Business.Role.TransportDistributorRole;
//import TransportOrganization.OrganizationTransport;
//import TransportOrganization.OrganizationTransport;
import java.util.ArrayList;

/**
 *
 * @author Sheetal Sekhar
 */
public class TransportDistributorOrganization  extends Organization{
    
    
    public TransportDistributorOrganization() {
        super(TransportDistributorOrganization.Type.TransportDistributor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
       roles.add(new TransportDistributorRole());
        return roles;
    }
     
}

