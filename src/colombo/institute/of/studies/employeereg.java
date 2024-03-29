/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package colombo.institute.of.studies;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class employeereg extends javax.swing.JFrame {

    private static final String username="root";
    private static final String password="";
    private static final String dataconn="jdbc:mysql://127.0.0.1:3306/colombodb";
    
    
    Connection sqlconn=null;
    PreparedStatement pst=null; 
    ResultSet rs=null;
    
    public employeereg() {
        initComponents();
        background();
    }

    public void background(){
          ImageIcon icon3=new ImageIcon("icon/save.png");
        Image img3=icon3.getImage();
        Image imgscale3=img3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon scaleicon3=new ImageIcon(imgscale3);
        jLabel12.setIcon(scaleicon3);
        
        
        ImageIcon icon4=new ImageIcon("icon/goback.png");
        Image img4=icon4.getImage();
        Image imgscale4=img4.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon scaleicon4=new ImageIcon(imgscale4);
        jLabel22.setIcon(scaleicon4);
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel20 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Eaddress = new javax.swing.JTextField();
        Eage = new javax.swing.JTextField();
        Epo = new javax.swing.JTextField();
        Eeid = new javax.swing.JTextField();
        Ename = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        gobackbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Epn = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Eemail = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        epf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel20.setBackground(new java.awt.Color(255, 102, 102));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.jpg"))); // NOI18N
        jPanel20.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 190));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/to-write-6621.gif"))); // NOI18N
        jPanel20.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 530, 510));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 30, 30));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 20, 20));

        jLabel45.setBackground(new java.awt.Color(255, 255, 204));
        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Position");
        jLabel45.setOpaque(true);
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 90, 20));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("ADD EMPLOYEE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 340, 60));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 50, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images/exit.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 40, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EPF NO:");
        jLabel4.setInheritsPopupMenu(false);
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 80, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Email");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 60, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Age");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 60, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 204));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Phone Number");
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 100, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Address");
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 110, 20));
        jPanel2.add(Eaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 300, 30));
        jPanel2.add(Eage, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 110, 30));
        jPanel2.add(Epo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 300, 30));
        jPanel2.add(Eeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 300, 30));
        jPanel2.add(Ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 300, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Clear");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 90, 30));

        gobackbtn.setBackground(new java.awt.Color(255, 255, 204));
        gobackbtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        gobackbtn.setText("Go Back");
        gobackbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gobackbtn.setOpaque(true);
        gobackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackbtnActionPerformed(evt);
            }
        });
        jPanel2.add(gobackbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 690, 130, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Add Employee");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setOpaque(true);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, 190, -1));

        Epn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(Epn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 160, 30));

        jLabel46.setBackground(new java.awt.Color(255, 255, 204));
        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Department");
        jLabel46.setOpaque(true);
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 120, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 204));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("NIC");
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 110, 20));
        jPanel2.add(Eemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 300, 30));

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 300, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 204));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Name");
        jLabel13.setInheritsPopupMenu(false);
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 60, -1));

        epf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epfActionPerformed(evt);
            }
        });
        jPanel2.add(epf, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 70, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1379, 743));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void gobackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackbtnActionPerformed
HRManager hr= new HRManager();
       hr.setVisible(true);
       this.hide();      
    }//GEN-LAST:event_gobackbtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        epf.setText("");
        Ename.setText("");
        Eemail.setText("");    
        Eage.setText("");
        Epn.setText("");
        Eaddress.setText("");
        Epo.setText("");
        Eeid.setText("");
        jComboBox1.setSelectedItem("");
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
         if(epf.getText().isEmpty()|| Ename.getText().isEmpty()||Eemail.getText().isEmpty()||Eage.getText().isEmpty()||Epn.getText().isEmpty()||Eaddress.getText().isEmpty()||Epo.getText().isEmpty()||Eeid.getText().isEmpty()||jComboBox1.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(this,"Fill up the form properly","Error",JOptionPane.ERROR_MESSAGE );
            
        }else 
            
            
        try{
            
                      Class.forName("com.mysql.jdbc.Driver");
                      sqlconn=DriverManager.getConnection(dataconn, username, password );
                      pst=sqlconn.prepareStatement("insert into employees(Name,Email,Age,PhoneNumber,Address,NIC,Position,Department,EPF_Number) value(?,?,?,?,?,?,?,?,?)");
                      pst.setString(1,Ename.getText());
                      pst.setString(2,Eemail.getText());
                      pst.setString (3,Eage.getText());
                      pst.setString(4,Epn.getText());
                      pst.setString(5,Eaddress.getText());
                      pst.setString(6,Epo.getText());
                      pst.setString(7,Eeid.getText());
                      pst.setString(8,jComboBox1.getSelectedItem().toString());
                      pst.setString(9, epf.getText());
                      pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record added successfully");  
   
            
        }catch(Exception ex){
                       JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           sqlconn=DriverManager.getConnection(dataconn, username, password );
           Statement st = sqlconn.createStatement();
           ResultSet rs = st.executeQuery("Select Name from department");
           //Vector vector = new Vector();
           while(rs.next()){
               
              // vector.addElement(new Item(rs.getString("Name")));
           
             // jComboBox1.setModel(new DefaultComboBoxModel(vector)); 
               String Name = rs.getString("Name");
               jComboBox1.addItem(Name);
           }
         sqlconn.close();
       }catch(Exception e){
         // e.printStackTrace();
       }
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void epfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epfActionPerformed

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
            java.util.logging.Logger.getLogger(employeereg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeereg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeereg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeereg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeereg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Eaddress;
    private javax.swing.JTextField Eage;
    private javax.swing.JTextField Eeid;
    private javax.swing.JTextField Eemail;
    private javax.swing.JTextField Ename;
    private javax.swing.JTextField Epn;
    private javax.swing.JTextField Epo;
    private javax.swing.JTextField epf;
    private javax.swing.JButton gobackbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel45;
    public javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    // End of variables declaration//GEN-END:variables
}


class Item{
    String Name;
    public Item(String Name){
        this.Name=Name;
        
    }
    @Override
    public String toString(){
       return Name; 
    }
    
}