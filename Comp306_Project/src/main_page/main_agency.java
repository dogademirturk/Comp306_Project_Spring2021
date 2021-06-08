/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_page;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import login_page.login_page;
import util.connectionUtil;


/**
 *
 * @author Murat Kaya
 */
public class main_agency extends javax.swing.JFrame {

    /**
     * Creates new form main_agency
     */
    
    static String username;
    String title;
    
    public main_agency(String uname) {
        username = uname;
        title = "Welcome " + username + "!";
        initComponents();
    }

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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_remProperty = new javax.swing.JLabel();
        jLabel_addProperty = new javax.swing.JLabel();
        jLabel_logout = new javax.swing.JLabel();
        jLabel_listRates = new javax.swing.JLabel();
        jLabel_listEarning = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_month = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(title);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_page/branch.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setForeground(new java.awt.Color(204, 204, 255));

        jLabel_remProperty.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel_remProperty.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_remProperty.setText("REMOVE PROPERTY");
        jLabel_remProperty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_remPropertyMouseClicked(evt);
            }
        });

        jLabel_addProperty.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel_addProperty.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_addProperty.setText("ADD NEW PROPERTY");
        jLabel_addProperty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_addPropertyMouseClicked(evt);
            }
        });

        jLabel_logout.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel_logout.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_logout.setText("LOG OUT");
        jLabel_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_logoutMouseClicked(evt);
            }
        });

        jLabel_listRates.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel_listRates.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_listRates.setText("LIST RATES ");
        jLabel_listRates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_listRatesMouseClicked(evt);
            }
        });

        jLabel_listEarning.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel_listEarning.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_listEarning.setText("LIST TOTAL EARNINGS ");
        jLabel_listEarning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_listEarningMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_addProperty)
                .addGap(48, 48, 48)
                .addComponent(jLabel_remProperty)
                .addGap(67, 67, 67)
                .addComponent(jLabel_listRates)
                .addGap(50, 50, 50)
                .addComponent(jLabel_listEarning)
                .addGap(59, 59, 59)
                .addComponent(jLabel_logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_addProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_remProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_listRates, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_listEarning, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "House ID", "Agency Name", "Address", "Suburb"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        try{
            String query;
            query = "SELECT houses.House_ID,houses.Seller_Agency, houses.Address,house_locations.Suburb"
            + " FROM houses JOIN house_locations ON house_locations.Location_ID=houses.Location_ID"
            + " WHERE houses.User_ID=0 AND houses.Seller_Agency IN (SELECT Agency_ID FROM AGENCIES WHERE Username='" + username + "')";

            PreparedStatement ps=connectionUtil.getTheConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                String id=String.valueOf(rs.getInt("houses.House_ID"));
                String name=rs.getString("houses.Seller_Agency");
                String address=rs.getString("houses.Address");
                String suburb=rs.getString("house_locations.Suburb");

                String tbData[]={id,name,address,suburb};
                DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tbData);
            }

        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STATISTICS");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TOP SELLING MONTH:");

        String monthQuery="SELECT MAX(subquery.count)as number,subquery.bestMonth as month FROM(SELECT COUNT(*)as count,month(serves.Date) as bestMonth"
        + " FROM serves,agencies WHERE serves.Agency_ID=agencies.Agency_ID AND agencies.Username= '"+username+"' GROUP by month(serves.date))as subquery";
        PreparedStatement ps;
        ResultSet rs;
        System.out.println("buraya geldi\n");
        try {
            ps = connectionUtil.getTheConnection().prepareStatement(monthQuery);
            //ps.setString(1, username);
            rs = ps.executeQuery();
            if(rs.next()){
                System.out.println("buraya geldi\n");
                String count=rs.getString("number");
                int monthNumber=rs.getInt("month");
                String monthName;
                switch(monthNumber){
                    case 1:
                    monthName = "January";
                    break;

                    case 2:
                    monthName = "February";
                    break;
                    case 3:
                    monthName = "March";
                    break;
                    case 4:
                    monthName = "April";
                    break;
                    case 5:
                    monthName = "May";
                    break;
                    case 6:
                    monthName = "June";
                    break;
                    case 7:
                    monthName = "July";
                    break;
                    case 8:
                    monthName = "August";
                    break;
                    case 9:
                    monthName = "September";
                    break;
                    case 10:
                    monthName = "October";
                    break;
                    case 11:
                    monthName = "November";
                    break;
                    case 12:
                    monthName = "December";
                    break;
                    default:
                    monthName = "Invalid month";
                    break;
                }
                jLabel_month.setText("Month:"+monthName+" House sales: "+count);
            }
        } catch (SQLException ex) {
            Logger.getLogger(main_agency.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel_month.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabel_month.setForeground(new java.awt.Color(255, 255, 255));

        String queryAv="SELECT T.average FROM (SELECT A1.Username, AVG(H1.Price * A1.Commision_fee / 100) AS average FROM houses AS H1 JOIN agencies AS A1 ON A1.Agency_ID=H1.Seller_Agency WHERE H1.User_ID NOT IN (SELECT H2.House_ID FROM houses AS H2 WHERE H2.User_ID=0) GROUP BY A1.Username HAVING A1.Username='"+ username + "') AS T WHERE T.average > (SELECT AVG(H3.Price * A3.Commision_fee / 100) FROM houses AS H3 JOIN agencies as A3 ON A3.Agency_ID=H3.Seller_Agency Where H3.User_ID NOT IN (SELECT H4.User_ID FROM houses AS H4 WHERE H4.User_ID=0))";

        try{

            PreparedStatement psav=connectionUtil.getTheConnection().prepareStatement(queryAv);
            ResultSet rsav = psav.executeQuery();
            if(rsav.next()){
                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_page/stonks.jpg"))); // NOI18N
            }else{
                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_page/nostonks.jpg"))); // NOI18N

            }

        } catch(SQLException e){
            System.out.println(e.getMessage());
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_month, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel_month, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    private void jLabel_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        login_page login= new login_page();
        login.setVisible(true);
        login.setExtendedState(NORMAL);
    }//GEN-LAST:event_jLabel_logoutMouseClicked

    private void jLabel_addPropertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_addPropertyMouseClicked
        // TODO add your handling code here:
          //create add house form
          main_agency_addHouse houseForm= new main_agency_addHouse(username);        
          houseForm.pack(); 
          houseForm.setLocationRelativeTo(null);        
          houseForm.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_jLabel_addPropertyMouseClicked

    private void jLabel_remPropertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_remPropertyMouseClicked
        // TODO add your handling code here:
        main_agency_remove removeform= new main_agency_remove(username);
        removeform.pack(); 
        removeform.setLocationRelativeTo(null);        
        removeform.setVisible(true);
       
        this.dispose();
    }//GEN-LAST:event_jLabel_remPropertyMouseClicked

    private void jLabel_listRatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_listRatesMouseClicked
        // TODO add your handling code here:
        main_agency_rates rates= new main_agency_rates(username);        
        rates.pack(); 
        rates.setLocationRelativeTo(null);        
        rates.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel_listRatesMouseClicked

    private void jLabel_listEarningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_listEarningMouseClicked
        // TODO add your handling code here:
        main_agency_gains earnings= new main_agency_gains(username);        
        earnings.pack(); 
        earnings.setLocationRelativeTo(null);        
        earnings.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_listEarningMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main_agency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_agency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_agency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_agency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_agency(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_addProperty;
    private javax.swing.JLabel jLabel_listEarning;
    private javax.swing.JLabel jLabel_listRates;
    private javax.swing.JLabel jLabel_logout;
    private javax.swing.JLabel jLabel_month;
    private javax.swing.JLabel jLabel_remProperty;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
