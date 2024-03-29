/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package colombo.institute.of.studies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.DriverManager;


public class addnewemployeeeHRM extends javax.swing.JFrame {

     private static final String username="root";
    private static final String password="";
    private static final String dataconn="jdbc:mysql://127.0.0.1:3306/colombodb";
    
    
    Connection sqlconn=null;
    PreparedStatement pst=null; 
    ResultSet rs=null;
    
    public addnewemployeeeHRM() {
        initComponents();
        showall();
    }

    public void showall(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
                      sqlconn=DriverManager.getConnection(dataconn, username, password );                  
                      pst=sqlconn.prepareStatement("select * from employees");
                      rs = pst.executeQuery();
                    DefaultTableModel tbModel = (DefaultTableModel)setable.getModel();
                    tbModel.setRowCount(0);
                    while(rs.next()){
                    String EMPID = String.valueOf(rs.getString("EmployeeID"));
                    String EMPNAME = rs.getString("Name");
                     String EMPEMAIL = rs.getString("Email");
                     String EMPAGE = rs.getString("Age");
                     String EMPPNO = rs.getString("PhoneNumber");
                     String EMPADD = rs.getString("Address");
                     String EMPNIC = rs.getString("NIC");
                     String EMPPO = rs.getString("Position");
                     String EMPDE=rs.getString("Department");
                     String EMPEP=rs.getString("EPF_Number");
                     
                     String tbData[] = {EMPID,EMPNAME,EMPEMAIL,EMPAGE,EMPPNO,EMPADD,EMPNIC,EMPPO,EMPDE,EMPEP};
                     tbModel.addRow(tbData);
                     }
                       
    
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Database connection issue", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Searchemp(String str){
      DefaultTableModel tblModel =(DefaultTableModel)setable.getModel();
      TableRowSorter<DefaultTableModel> TRS = new TableRowSorter<>(tblModel);
      setable.setRowSorter(TRS);
      TRS.setRowFilter(RowFilter.regexFilter(str));
      
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        setable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        sedep = new javax.swing.JTextField();
        sedes = new javax.swing.JTextField();
        seepf = new javax.swing.JTextField();
        sename = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Department");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 180, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Name");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 180, 40));

        setable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        setable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee_ID", "Name ", "Email", "Age", "Phone Number", "Address", "NIC", "Position", "Department", "EPF Number"
            }
        ));
        setable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                setableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(setable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 1090, 260));

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Designations");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 180, 40));

        sedep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sedepKeyReleased(evt);
            }
        });
        jPanel1.add(sedep, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 160, 30));

        sedes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sedesKeyReleased(evt);
            }
        });
        jPanel1.add(sedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 160, 30));

        seepf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seepfKeyReleased(evt);
            }
        });
        jPanel1.add(seepf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 200, 160, 30));

        sename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                senameKeyReleased(evt);
            }
        });
        jPanel1.add(sename, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 160, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 110, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Delete");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 580, 120, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EPF number");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 150, 180, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Employee");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 380, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images/exit.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images/pexels-vlada-karpovich-4050405.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 740));

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

        setSize(new java.awt.Dimension(1379, 743));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
       int a= JOptionPane.showConfirmDialog(null,"Do you really want to Close Application ","Select",JOptionPane.YES_NO_OPTION);
       if(a==0)
       {
           System.exit(0);
       }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void setableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_setableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_setableAncestorAdded

    private void senameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senameKeyReleased
      Searchemp(sename.getText());
    }//GEN-LAST:event_senameKeyReleased

    private void sedepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sedepKeyReleased
       Searchemp(sedep.getText());
    }//GEN-LAST:event_sedepKeyReleased

    private void sedesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sedesKeyReleased
        Searchemp(sedes.getText());
    }//GEN-LAST:event_sedesKeyReleased

    private void seepfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seepfKeyReleased
       Searchemp(seepf.getText());
    }//GEN-LAST:event_seepfKeyReleased

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        HRManager hrmanager = new HRManager();
       hrmanager.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tbModel = (DefaultTableModel)setable.getModel();

        if(setable.getSelectedRowCount()==1){
            tbModel.removeRow(setable.getSelectedRow());

        }else{
            if(setable.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty!!");

            }else{
                JOptionPane.showMessageDialog(this,"Please select Single Row For Delete..");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(addnewemployeeeHRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnewemployeeeHRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnewemployeeeHRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnewemployeeeHRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addnewemployeeeHRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sedep;
    private javax.swing.JTextField sedes;
    private javax.swing.JTextField seepf;
    private javax.swing.JTextField sename;
    private javax.swing.JTable setable;
    // End of variables declaration//GEN-END:variables
}
