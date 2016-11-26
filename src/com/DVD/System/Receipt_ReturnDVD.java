/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.DVD.System;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.MessageFormat;
import java.awt.print.*;
import java.awt.print.PageFormat;
import javax.swing.JOptionPane;

/**
 *Creates a receipt of the selected rental
 * Allows admin to return dvd and make the 
 * dvd available for the next customer.
 * @author Ikwerreninja
 */
public class Receipt_ReturnDVD extends javax.swing.JFrame {

    /**
     * Creates new form Reciept_ReturnDVD
     */
    public Receipt_ReturnDVD() {
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

        cmd_receipt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_dvdRented = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cmd_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reciept_ReturnDVD");

        cmd_receipt.setText("Print Reciept");
        cmd_receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_receiptActionPerformed(evt);
            }
        });

        txtArea_dvdRented.setEditable(false);
        txtArea_dvdRented.setColumns(20);
        txtArea_dvdRented.setFont(new java.awt.Font("Kalinga", 2, 14)); // NOI18N
        txtArea_dvdRented.setRows(5);
        txtArea_dvdRented.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(txtArea_dvdRented);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel4.setText("Customer Receipt");

        cmd_close.setText("Close");
        cmd_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(cmd_receipt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmd_close))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmd_receipt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(cmd_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  public void getReceipt( String customerName, String customerEmail, String dvdid, String dvdTitle, String dvdGenre, double price, String rentedDate, String returnDate ){
        this.dvdid = dvdid;
        this.dvdTitle = dvdTitle;
       this.dvdGenre = dvdGenre;
       this.price = price;
       this.rentedDate = rentedDate;
       this.returnDate = returnDate;
        txtArea_dvdRented.setText("Customer Name : "+customerName+'\n'+"Customer Email : "+customerEmail+'\n'+"DVD Rented : "+this.dvdTitle+'\n'+"DVD ID : "+this.dvdid +'\n'+"DVD Genre : "+this.dvdGenre+'\n'+"DVD Price : "+this.price+
                '\n'+"DVD Rented Date : "+this.rentedDate+'\n'+"DVD Return Date : "+this.returnDate);
    }
  
    private void cmd_receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_receiptActionPerformed
 
      
      try{
      
       boolean complete = txtArea_dvdRented.print();
       if(complete){
           JOptionPane.showMessageDialog(null, "Done Printing", "Information", JOptionPane.INFORMATION_MESSAGE);
       }else{
            JOptionPane.showMessageDialog(null, "Printing....", "Printer", JOptionPane.ERROR_MESSAGE);
       }
      }catch(PrinterException e){
          JOptionPane.showMessageDialog(null, e);
      }
    }//GEN-LAST:event_cmd_receiptActionPerformed

    private void cmd_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_closeActionPerformed
        dispose();
    }//GEN-LAST:event_cmd_closeActionPerformed

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
            java.util.logging.Logger.getLogger(Receipt_ReturnDVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt_ReturnDVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt_ReturnDVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt_ReturnDVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt_ReturnDVD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_close;
    private javax.swing.JButton cmd_receipt;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea_dvdRented;
    // End of variables declaration//GEN-END:variables
String dvdTitle;
String dvdGenre;
double price;
String rentedDate;
String returnDate;
String dvdid;



}
