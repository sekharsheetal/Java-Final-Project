/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
//import Business.Organization.DoctorOrganization;
import Business.Organization.FoodConsumerOrganization;
//import FoodOrganisation.OrganizationFood;
//import Business.Organization.Organization;
import Business.UserAccount.UserAccount;


// create and paste
import javax.swing.JPanel;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

//import FoodOrganisation.OrganizationFood;

import userinterface.FoodConsumerWorkRole.FoodConsumerWorkAreaJPanel;
//import javax.swing.JPanel

public class FoodConsumerRole extends Role{

    @Override
  public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
         return new FoodConsumerWorkAreaJPanel(userProcessContainer ,account, (FoodConsumerOrganization) organization, enterprise);
      
 }
    
}

