/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClothesSupplierRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TransportEnterprise;
import Business.Network.Network;
import Business.Organization.ClothingSupplierOrganization;
import Business.Organization.Organization;
import Business.Organization.TransportDistributorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClothingSupplierWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.TransportDistributorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author priya
 */
public class ClothesSupplierWorkAreaJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount account;
    private Organization organization;
   // private LabOrganization labOrganization;
    private ClothingSupplierOrganization clothingSupplierOrganization;
    private WorkRequest request;
    private Enterprise enterprise;
  //  private TransportDistributorOrganization transportDistributorOrganization;
    /**
     * Creates new form ClothesSupplierWorkAreaJPanel
     */
    public ClothesSupplierWorkAreaJPanel( JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business ,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.clothingSupplierOrganization = (ClothingSupplierOrganization)organization;
//       this.transportDistributorOrganization=(TransportDistributorOrganization)organization;
        valueLabel2.setText(enterprise.getName());
      valueLabel5.setText(account.getUsername());
        
        
        populateTable();
        populateTable2();
                
        
       
    }
 public void populateTable() {
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : clothingSupplierOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[9];
            row[0] = request.getCid();
            row[7]=request.getReceiver();
            row[2]=  request;
            
            row[3] = request.getZipcode();
            row[4]= request.getBoy()+request.getGirl()+request.getMen()+request.getWomen();
            row[5]= request.getStatus();
            row[6] = request.getResolveDate();
            row[1]= request.getSender();
            row[8]= request.getSenderEmail();
             //System.out.println(request.getReceiverEmail()+ "Hello"+ request.getSenderEmail());
            model.addRow(row);
           
        }    
    }
 
 public void populateTable2()
 {
 
 DefaultTableModel model = (DefaultTableModel)TrasportDJTable.getModel();
 
 model.setRowCount(0);
 
     for(Network n: business.getNetworkList()){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
               if(e instanceof TransportEnterprise){
                  System.out.println("In transport Enterprise");
                  for (Organization organization1 : e.getOrganizationDirectory().getOrganizationList()){
              for(WorkRequest request :organization1.getWorkQueue().getWorkRequestList()){     
             Object[] row = new Object[4];
             row[0] = request;
             row[1]= request.getAddress();
             row[2]= request.getZipcode();
             row[3] = request.getStatus();
                            
                           model.addRow(row); 
                        }      
 }
                   }}}}
                
   
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        refreshTestJButton2 = new javax.swing.JButton();
        enterpriseLabel2 = new javax.swing.JLabel();
        valueLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        valueLabel5 = new javax.swing.JLabel();
        ViewDetailjButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        boyjTextField2 = new javax.swing.JTextField();
        girljTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        menjTextFiel2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        womenjTextField2 = new javax.swing.JTextField();
        assignJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        processjButton = new javax.swing.JButton();
        transportBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TrasportDJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Manage Clothing Request");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel3)
                .addContainerGap(553, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addContainerGap(480, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(85, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        refreshTestJButton2.setText("Refresh");
        refreshTestJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButton2ActionPerformed(evt);
            }
        });

        enterpriseLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel2.setText("EnterPrise :");

        valueLabel2.setText("<value>");

        jLabel1.setText("Logged in as:");

        valueLabel5.setText("<value>");

        ViewDetailjButton2.setText("View Details");
        ViewDetailjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailjButton2ActionPerformed(evt);
            }
        });

        jLabel14.setText("values for the selected request");

        jLabel15.setText("Boys:");

        jLabel16.setText("Girls:");

        jLabel17.setText("Men:");

        jLabel18.setText("Women:");

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Requested By", "Date", "Zip Code", "No of People", "Status", "Completion Date", "Assigned To", "Email "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        processjButton.setText("Process");
        processjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processjButtonActionPerformed(evt);
            }
        });

        transportBtn.setText("Request to Deliver");
        transportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportBtnActionPerformed(evt);
            }
        });

        TrasportDJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Address", "ZipCode", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TrasportDJTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Manage Transport Request List");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Manage Clothing Request");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Clothing Supplier Work Area");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(assignJButton)
                        .addGap(39, 39, 39)
                        .addComponent(processjButton)
                        .addGap(27, 27, 27)
                        .addComponent(ViewDetailjButton2)
                        .addGap(68, 68, 68)
                        .addComponent(transportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(refreshTestJButton2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(enterpriseLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valueLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(237, 237, 237)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(9, 9, 9)
                                .addComponent(menjTextFiel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(womenjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boyjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(girljTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel4)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(valueLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton)
                    .addComponent(ViewDetailjButton2)
                    .addComponent(processjButton)
                    .addComponent(transportBtn)
                    .addComponent(refreshTestJButton2))
                .addGap(19, 19, 19)
                .addComponent(jLabel14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(boyjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(girljTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(menjTextFiel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(womenjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 177, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 178, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 147, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 147, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void transportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportBtnActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        ClothingSupplierWorkRequest request = (ClothingSupplierWorkRequest)workRequestJTable.getValueAt(selectedRow, 2);
        assignJButton.setEnabled(false);
        processjButton.setEnabled(false);
        WorkRequest request1 = new TransportDistributorWorkRequest();

        //request.setSender((UserAccount)"s1");
        request1.setAddress(request.getAddress());
        request1.setSenderEmail(request.getSenderEmail());
        System.out.println(request.getSenderEmail());
        request1.setAddress(request.getZipcode());

        request1.setStatus("Sent");

        Organization org = null;
        for(Network n: business.getNetworkList()){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof TransportEnterprise){
                    System.out.println("In trasport Enterprise");
                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
                        if (organization instanceof TransportDistributorOrganization){
                            org = organization;
                            System.out.println(org);
                            break;
                        }
                    }
                }

            }

        }

        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println(org);
            System.out.println(request.toString());
            account.getWorkQueue().getWorkRequestList().add(request);
            populateTable2();
        }
    }//GEN-LAST:event_transportBtnActionPerformed

    private void processjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processjButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        //request.setStatus("Processing");
        ClothingSupplierWorkRequest request = (ClothingSupplierWorkRequest)workRequestJTable.getValueAt(selectedRow, 2);
        System.out.println(request);
        //request.setStatus("Processing");

        ClothesSupplierProcessRequest clothesSupplierProcessRequest = new ClothesSupplierProcessRequest(userProcessContainer,request);
        userProcessContainer.add("clothesSupplierProcessRequest", clothesSupplierProcessRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processjButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 2);
        request.setReceiver(account);
        request.setReceiverEmail(account.getEmail());
        request.setStatus("Pending");
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void ViewDetailjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailjButton2ActionPerformed
        // TODO add your handling code here:
        int selectedrow = workRequestJTable.getSelectedRow();
        if (selectedrow >= 0)
        {
            WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedrow, 2);
            //WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
            boyjTextField2.setText( String.valueOf(request.getBoy()));
            menjTextFiel2.setText( String.valueOf(request.getMen()));
            girljTextField2.setText( String.valueOf(request.getGirl()));
            womenjTextField2.setText( String.valueOf(request.getWomen()));
            // TODO add your handling code here:
        }

        else
        {
            JOptionPane.showMessageDialog(null, "Select any row to view");
        }
    }//GEN-LAST:event_ViewDetailjButton2ActionPerformed

    private void refreshTestJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButton2ActionPerformed

        populateTable();
    }//GEN-LAST:event_refreshTestJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TrasportDJTable;
    private javax.swing.JButton ViewDetailjButton2;
    private javax.swing.JButton assignJButton;
    private javax.swing.JTextField boyjTextField2;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JTextField girljTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField menjTextFiel2;
    private javax.swing.JButton processjButton;
    private javax.swing.JButton refreshTestJButton2;
    private javax.swing.JButton transportBtn;
    private javax.swing.JLabel valueLabel2;
    private javax.swing.JLabel valueLabel5;
    private javax.swing.JTextField womenjTextField2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
