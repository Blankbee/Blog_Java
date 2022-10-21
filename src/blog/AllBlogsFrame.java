/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blog;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Esadc
 */
public class AllBlogsFrame extends javax.swing.JFrame {

    /**
     * Creates new form AllBlogsFrame
     */
        PreparedStatement st = null; 
        Connection con = null;
        ResultSet rs = null;
        DefaultTableModel dt;
    public AllBlogsFrame() {
        initComponents();
        tablo1();
    }
    public void tablo1(){
        String tb="SELECT topic, author, key FROM blogs";
        dt = (DefaultTableModel)t_tablo.getModel();
    try{
        con=connect.connection();
        st=con.prepareStatement(tb);      
        rs=st.executeQuery();        
        while(rs.next()){
            String[] a={rs.getString("author"),rs.getString("topic"),rs.getString("key")};
            dt.addRow(a);    
        }
        
        con.close();
}
    catch(Exception e){
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null,"Başarısız");
}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        t_konu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_icerik = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_tablo = new javax.swing.JTable();
        b_goruntule = new javax.swing.JButton();
        b_geri = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        t_key = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Konu");

        jLabel2.setText("İçerik");

        t_icerik.setColumns(20);
        t_icerik.setRows(5);
        jScrollPane1.setViewportView(t_icerik);

        t_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Yazar", "Konu", "Key"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(t_tablo);

        b_goruntule.setText("Görüntüle");
        b_goruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_goruntuleActionPerformed(evt);
            }
        });

        b_geri.setText("Geri");
        b_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_geriActionPerformed(evt);
            }
        });

        jLabel3.setText("Key:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_goruntule)
                            .addComponent(t_konu, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_key, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_geri))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_konu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_goruntule)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(t_key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b_geri)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_geriActionPerformed
        dispose();
        MenuFrame m =new MenuFrame();
        m.setVisible(true);
    }//GEN-LAST:event_b_geriActionPerformed

    private void b_goruntuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_goruntuleActionPerformed
        // TODO add your handling code here:
        String show1="select content, topic from blogs where key=?";
        try{
            con = connect.connection();
            st=con.prepareStatement(show1);
            int h=Integer.parseInt(t_key.getText());
            st.setInt(1, h);
            rs=st.executeQuery();
            t_icerik.setText(rs.getString("content"));
            t_konu.setText(rs.getString("topic"));
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_b_goruntuleActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_geri;
    private javax.swing.JButton b_goruntule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea t_icerik;
    private javax.swing.JTextField t_key;
    private javax.swing.JTextField t_konu;
    private javax.swing.JTable t_tablo;
    // End of variables declaration//GEN-END:variables
}