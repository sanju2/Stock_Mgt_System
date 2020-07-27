/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock_management;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Supplier_payments extends javax.swing.JFrame {

    /**
     * Creates new form invoice
     */
    public Supplier_payments() {
        initComponents();
     
        getdatafromsup_pay();
        load();
    }

      void load(){
        try {
            Connection con = DB.connect();
            ResultSet e = con.createStatement().executeQuery("select * from supplier");
            while(e.next()){
                 String a = e.getString("supfname");
                 jComboBox1.addItem(a);
                 
                
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //text box wala data table walata set karnna
    void getdatafromsup_pay() {
        try {
            Connection con = DB.connect();
            ResultSet r = con.createStatement().executeQuery("select * from sup_payment_summery");
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            
            while (r.next()) {
                Vector v = new Vector();
                v.add(r.getString("grnno"));
                v.add(r.getString("total"));
                v.add(r.getString("cash"));
                v.add(r.getString("cheque"));
                v.add(r.getString("balance"));
                v.add(r.getString("last_payble_data"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
        }

    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cheque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Supplier payments");

        jLabel2.setText("supplier");

        jLabel3.setText("Date");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GrnNo", "Grn Total", "Cash", "Cheque", "Balance", "Last Payble datel"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jButton1.setText("pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("total");

        jLabel4.setText("cheque");

        jLabel5.setText("cash");

        jLabel6.setText("balance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(237, 237, 237)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(balance))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            Object grnNo = dtm.getValueAt(jTable2.getSelectedRow(),0);
            total.setText(grnNo.toString());
            cash.setText(grnNo.toString());
            cheque.setText(grnNo.toString());
            balance.setText(grnNo.toString());
            
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection con = DB.connect();
            ResultSet r = con.createStatement().executeQuery("select * from supplier where supfname ='"+jComboBox1.getSelectedItem()+"'");
              
              String id= null; //local veriable ekak nisa
              while(r.next()){
                id = r.getString("supid");
                
                
           }
           DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel(); 
           int rowCount = dtm.getRowCount();
           Object ob[] = new Object[7];
           for(int a=0;a<rowCount;a++){
               for(int b=0;b<=6;b++){
                   ob[b]=dtm.getValueAt(a,b);
               }
               PreparedStatement p = con.prepareStatement("insert into grn values('"+date.getText()+"','"+grnno.getText()+"','"+id+"','"+ob[0]+"','"+ob[1]+"','"+ob[2]+"','"+ob[3]+"','"+ob[4]+"','"+ob[5]+"','"+ob[6]+"')");
               p.executeUpdate();
               p.close();
               JOptionPane.showMessageDialog(rootPane,"succesfully saved");
               //grn eka stock eken update krnna
               ResultSet ra = con.createStatement().executeQuery("select * from stock where itemid ='"+ob[0]+"'");
               boolean b = false;
               double qty = 0.0;
               while(ra.next()){
                   b=true;
                   qty = Double.parseDouble(ra.getString("qty"));
               }
               double newqty = qty+ Double.parseDouble(ob[5].toString());
               
               if(b){
               PreparedStatement pl = con.prepareStatement("update stock set qty='"+newqty+"' where itemid='"+ob[0]+"'");
               pl.executeUpdate();
               pl.close();
               
                    
                    
               }
               else{
               PreparedStatement pa = con.prepareStatement("insert into stock values('"+ob[0]+"','"+ob[1]+"','"+ob[2]+"','"+ob[4]+"','"+ob[3]+"','"+ob[5]+"','"+ob[3]+"')");
               pa.executeUpdate();
               pa.close();
               }
               
            }
            //table 2kata data dnna nisa for loop deken eliye
            PreparedStatement pay = con.prepareStatement("insert into sup_payment values('"+id+"','"+grnno.getText()+"','"+total.getText()+"','"+cash.getText()+"','"+cheque.getText()+"','"+balance.getText()+"','"+date.getText()+"')");
               pay.executeUpdate();
               pay.close();
               
            PreparedStatement paysumery = con.prepareStatement("insert into sup_payment_summery values('"+id+"','"+grnno.getText()+"','"+total.getText()+"','"+cash.getText()+"','"+cheque.getText()+"','"+balance.getText()+"','"+date.getText()+"')");
               paysumery.executeUpdate();
               paysumery.close();
           
            JOptionPane.showMessageDialog(rootPane,"succesfully saved");
         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Supplier_payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier_payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier_payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier_payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier_payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balance;
    private javax.swing.JTextField cash;
    private javax.swing.JTextField cheque;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
