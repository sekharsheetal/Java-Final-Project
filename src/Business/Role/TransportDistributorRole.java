/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FoodConsumerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.TransportWorkAreaRole.TransportProcessRequestJPanel;
import userinterface.TransportWorkAreaRole.TransportWorkAreaJPanel;
import Business.Organization.TransportDistributorOrganization;
import javax.swing.JPanel;

/**
 *
 * @author Sheetal Sekhar
 */

public class TransportDistributorRole extends Role{
     @Override
  public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
         return new TransportWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
      
 }}



