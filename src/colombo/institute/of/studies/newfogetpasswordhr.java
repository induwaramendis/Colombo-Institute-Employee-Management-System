/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package colombo.institute.of.studies;


import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import static java.util.Objects.hash;
import javax.swing.JOptionPane;

public class newfogetpasswordhr extends javax.swing.JFrame {

    private static final String username="root";
    private static final String password="";
    private static final String dataconn="jdbc:mysql://127.0.0.1:3306/colombodb";
    
    
    Connection sqlconn=null;
    PreparedStatement pst=null; 
    ResultSet rs=null;
    
    public newfogetpasswordhr() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username11 = new javax.swing.JTextField();
        password12 = new javax.swing.JTextField();
        confirmpassword13 = new javax.swing.JTextField();
        email10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FORGET PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 370, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Username");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 240, 80, 20));
        getContentPane().add(username11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 270, 260, 40));

        password12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password12ActionPerformed(evt);
            }
        });
        getContentPane().add(password12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 350, 260, 40));
        getContentPane().add(confirmpassword13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 440, 260, 40));

        email10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email10ActionPerformed(evt);
            }
        });
        getContentPane().add(email10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 260, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 520, 80, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Back to Login");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, 140, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images/exit.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 40, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, 80, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Confirm Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, 150, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, 50, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pexels-pixabay-39584 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 650));

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 460, 650));

        setSize(new java.awt.Dimension(1300, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int a= JOptionPane.showConfirmDialog(null,"Do you really want to Close Application ","Select",JOptionPane.YES_NO_OPTION);
       if(a==0)
       {
           System.exit(0);
       }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void email10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email10ActionPerformed

    private void password12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(email10.getText().isEmpty()||username11.getText().isEmpty()||password12.getText().isEmpty()||confirmpassword13.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Fill up the form properly","Error",JOptionPane.ERROR_MESSAGE );
      }else{
          
         
          try{
              Class.forName("com.mysql.jdbc.Driver");
              sqlconn=DriverManager.getConnection(dataconn, username, password );
              pst=sqlconn.prepareStatement("SELECT Username,Password,Email FROM hr_manager WHERE Username=?");
              pst.setString(1, username11.getText());
              pst.executeQuery();
              rs=pst.executeQuery();
              
              if(rs.next()==false){
                  JOptionPane.showMessageDialog(null, "username not Found");
              }else{
                 if(rs.getString("email").equals(email10.getText())){
                     sqlconn.close();
               Class.forName("com.mysql.jdbc.Driver");
              sqlconn=DriverManager.getConnection(dataconn, username, password );
              pst=sqlconn.prepareStatement("UPDATE hr_manager SET Password=?  WHERE Username=?");
              pst.setString(2, username11.getText());
              pst.setString(1, password12.getText());
              pst.executeUpdate();
              JOptionPane.showMessageDialog(null, "Password Changed Successfully......");
             login lo = new login();
                 lo.setVisible(true);
                 this.hide();
              
                 }
                  
                  else{
                       JOptionPane.showMessageDialog(null,"Username and Email doesn't match!!!" );
                  }
              }
                     
          }catch(Exception e)
              {JOptionPane.showMessageDialog(null,"Error in connection");
          }
      } 
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
     login lo = new login();
     lo.setVisible(true);
     this.hide();
     
    }//GEN-LAST:event_jButton2MouseClicked
      
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
            java.util.logging.Logger.getLogger(newfogetpasswordhr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newfogetpasswordhr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newfogetpasswordhr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newfogetpasswordhr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newfogetpasswordhr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirmpassword13;
    private javax.swing.JTextField email10;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField password12;
    private javax.swing.JTextField username11;
    // End of variables declaration//GEN-END:variables
}
