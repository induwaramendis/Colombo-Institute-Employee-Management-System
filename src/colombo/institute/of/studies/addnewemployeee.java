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


public class addnewemployeee extends javax.swing.JFrame {

     private static final String username="root";
    private static final String password="";
    private static final String dataconn="jdbc:mysql://127.0.0.1:3306/colombodb";
    
    
    Connection sqlconn=null;
    PreparedStatement pst=null; 
    ResultSet rs=null;
    
    public addnewemployeee() {
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
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        sadd = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        semail = new javax.swing.JTextField();
        sage = new javax.swing.JTextField();
        sp = new javax.swing.JTextField();
        snic = new javax.swing.JTextField();
        spo = new javax.swing.JTextField();
        sepf = new javax.swing.JTextField();
        seemp = new javax.swing.JTextField();
        sdep = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Department");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 180, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Name");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 180, 40));

        setable.setBackground(new java.awt.Color(153, 255, 204));
        setable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        setable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee_ID", "Name ", "Email", "Age", "Phone Number", "Address", "NIC", "Position", "Department", "EPF Number"
            }
        ));
        setable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                setableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        setable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(setable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 1120, 190));

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Designations");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 180, 40));

        sedep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sedepKeyReleased(evt);
            }
        });
        jPanel1.add(sedep, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 160, 30));

        sedes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sedesKeyReleased(evt);
            }
        });
        jPanel1.add(sedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 160, 30));

        seepf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seepfKeyReleased(evt);
            }
        });
        jPanel1.add(seepf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 70, 160, 30));

        sename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                senameKeyReleased(evt);
            }
        });
        jPanel1.add(sename, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 160, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Delete");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 360, 120, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Menu");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EPF number");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 180, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Employee");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 380, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images/exit.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 40, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("Name");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 40, 20));

        jLabel9.setBackground(new java.awt.Color(255, 255, 204));
        jLabel9.setText("Phone Number");
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 90, 20));

        jLabel10.setBackground(new java.awt.Color(255, 255, 204));
        jLabel10.setText("Address");
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 50, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 204));
        jLabel11.setText("NIC");
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 30, 20));

        jLabel12.setBackground(new java.awt.Color(255, 255, 204));
        jLabel12.setText("Position");
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 50, 20));

        jLabel13.setBackground(new java.awt.Color(255, 255, 204));
        jLabel13.setText("Department");
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 70, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 204));
        jLabel16.setText("EPF Number");
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 204));
        jLabel17.setText("Email");
        jLabel17.setOpaque(true);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 40, 20));

        jLabel18.setBackground(new java.awt.Color(255, 255, 204));
        jLabel18.setText("Age");
        jLabel18.setOpaque(true);
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 40, 20));

        jLabel19.setBackground(new java.awt.Color(255, 255, 204));
        jLabel19.setText("Employee_ID");
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 80, 20));

        sadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saddActionPerformed(evt);
            }
        });
        jPanel1.add(sadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 120, -1));

        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });
        jPanel1.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 120, -1));
        jPanel1.add(semail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 120, -1));
        jPanel1.add(sage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 120, -1));
        jPanel1.add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 120, -1));

        snic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snicActionPerformed(evt);
            }
        });
        jPanel1.add(snic, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 120, -1));
        jPanel1.add(spo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 120, -1));
        jPanel1.add(sepf, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 120, -1));

        seemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seempActionPerformed(evt);
            }
        });
        jPanel1.add(seemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 120, -1));
        jPanel1.add(sdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 120, -1));

        jButton3.setText("Update Employee");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, -1, -1));

        jLabel3.setBackground(new java.awt.Color(153, 255, 204));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 510, 260));

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
        System.exit(0);
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
        Menu Menu = new Menu();
        Menu.setVisible(true);
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
        
      
    
        
        try{
             pst.executeUpdate("DELETE FROM employees WHERE EmployeeID ='"+seemp.getText()+"'");
             String sql ="delete from employees where EmployeeID = ? ";
            pst= sqlconn.prepareStatement(sql);
            pst.setString(1, seemp.getText());
            /*pst.setString(2, sname.getText());
            pst.setString(3, semail.getText());
            pst.setString(4, sage.getText());
            pst.setString(5, sp.getText());
            pst.setString(6, sadd.getText());
            pst.setString(7, snic.getText());
            pst.setString(8, spo.getText());
            pst.setString(9, sdep.getText());
            pst.setString(10, sepf.getText());*/
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void saddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saddActionPerformed

    private void seempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seempActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void snicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snicActionPerformed

    private void setableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setableMouseClicked
       
        int selectedRow = setable.getSelectedRow();
        DefaultTableModel tbModel = (DefaultTableModel)setable.getModel();
       seemp.setText(tbModel.getValueAt(selectedRow,0).toString());
       sname.setText(tbModel.getValueAt(selectedRow,1).toString());
       semail.setText(tbModel.getValueAt(selectedRow,2).toString());
       sage.setText(tbModel.getValueAt(selectedRow,3).toString());
       sp.setText(tbModel.getValueAt(selectedRow,4).toString());
       sadd.setText(tbModel.getValueAt(selectedRow,5).toString());
       snic.setText(tbModel.getValueAt(selectedRow,6).toString());
       spo.setText(tbModel.getValueAt(selectedRow,7).toString());
       sdep.setText(tbModel.getValueAt(selectedRow,8).toString());
       sepf.setText(tbModel.getValueAt(selectedRow,9).toString());
       
       
       
       
       
       
    }//GEN-LAST:event_setableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        /*try{
        int i = setable.getSelectedRow();
        DefaultTableModel tbModel = (DefaultTableModel)setable.getModel();
        if(i>=0)
        {
            tbModel.setValueAt(seemp.getText(), i, 0);
            tbModel.setValueAt(sname.getText(), i, 1);
            tbModel.setValueAt(semail.getText(), i, 2);
            tbModel.setValueAt(sage.getText(), i, 3);
            tbModel.setValueAt(sp.getText(), i, 4);
            tbModel.setValueAt(sadd.getText(), i, 5);
            tbModel.setValueAt(snic.getText(), i, 6);
            tbModel.setValueAt(spo.getText(), i, 7);                  
            tbModel.setValueAt(sdep.getText(), i, 8);
            tbModel.setValueAt(sepf.getText(), i, 9);
             Class.forName("com.mysql.jdbc.Driver");
              sqlconn=DriverManager.getConnection(dataconn, username, password );
              pst=sqlconn.prepareStatement("UPDATE employees SET EmployeeID=?,Name=?, Email=?, Age=?, PhoneNumber=?, Address=?,NIC=?,Position=?, Department=?, EPF_Number=?  WHERE EmployeeID=?");
              pst.executeUpdate();
        }else{
            JOptionPane.showMessageDialog(null, "Error");
        }
        }catch(Exception e){
            
        }*/
        
        try{
            String value1 = seemp.getText();
            String value2 = sname.getText();
            String value3 = semail.getText();
            String value4 = sage.getText();
            String value5 = sp.getText();
            String value6 = sadd.getText();
            String value7 = snic.getText();
            String value8 = spo.getText();
            String value9 = sdep.getText();
            String value10 = sepf.getText();
            
            
            String sql = "update employees set  EmployeeID='"+value1+"', Name='"+value2+"',Email='"+value3+"',Age='"+value4+"', PhoneNumber = '"+value5+"',Address='"+value6+"',NIC='"+value7+"',Position='"+value8+"',Department='"+value9+"',EPF_Number='"+value10+"' where EmployeeID='"+value1+"'"; 
            pst=sqlconn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated");
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(addnewemployeee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnewemployeee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnewemployeee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnewemployeee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addnewemployeee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sadd;
    private javax.swing.JTextField sage;
    private javax.swing.JTextField sdep;
    private javax.swing.JTextField sedep;
    private javax.swing.JTextField sedes;
    private javax.swing.JTextField seemp;
    private javax.swing.JTextField seepf;
    private javax.swing.JTextField semail;
    private javax.swing.JTextField sename;
    private javax.swing.JTextField sepf;
    private javax.swing.JTable setable;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField snic;
    private javax.swing.JTextField sp;
    private javax.swing.JTextField spo;
    // End of variables declaration//GEN-END:variables
}
