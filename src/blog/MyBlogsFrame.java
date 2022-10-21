/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Esadc
 */
public class MyBlogsFrame extends javax.swing.JFrame {

    /**
     * Creates new form MyBlogsFrame
     */
    PreparedStatement st,st1,st2,st3 = null; 
    Connection con = null;
    ResultSet rs = null;
    DefaultTableModel dt;
    public MyBlogsFrame() {
        initComponents();
        tablo();
    }
    public void get_key(){
        try {
                FileWriter wrt = new FileWriter("D:/OneDrive/Masaüstü/java/Blog/key.txt");
                wrt.write(t_key.getText());
                wrt.close();

                System.out.println("Successfully wrote to the file.");
        }
                catch (IOException e) {
                System.out.println("An error occurred." + e.getMessage());
        }
    }
    
    public void tablo(){
        String tb="SELECT topic, key FROM blogs WHERE author=?";
        dt = (DefaultTableModel)m_table.getModel();
    try{
        con=connect.connection();
        st=con.prepareStatement(tb);
        try {
            File m = new File("D:/OneDrive/Masaüstü/java/Blog/log.txt");
            Scanner myReader = new Scanner(m);
            String data = myReader.nextLine();
            st.setString(1,data);    
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred." + e.getMessage());
           // e.printStackTrace();
        }
        rs=st.executeQuery();        
        while(rs.next()){
            String[] a={rs.getString("topic"),rs.getString("key")};
            dt.addRow(a);    
        }
        
        con.close();
}
    catch(Exception e){
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null,"Başarısız");
}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_g1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        m_table = new javax.swing.JTable();
        b_show = new javax.swing.JButton();
        b_change = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        t_key = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t_konu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_icerik = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_g1.setText("Geri");
        b_g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_g1ActionPerformed(evt);
            }
        });

        m_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Konu", "Key"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        m_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(m_table);
        if (m_table.getColumnModel().getColumnCount() > 0) {
            m_table.getColumnModel().getColumn(0).setResizable(false);
            m_table.getColumnModel().getColumn(1).setResizable(false);
        }

        b_show.setText("Görüntüle");
        b_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_showActionPerformed(evt);
            }
        });

        b_change.setText("Düzenle");
        b_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_changeActionPerformed(evt);
            }
        });

        b_delete.setText("Sil");
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });

        jLabel1.setText("Key :");

        t_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_keyActionPerformed(evt);
            }
        });

        jLabel2.setText("Konu");

        jLabel3.setText("İçerik");

        t_icerik.setColumns(20);
        t_icerik.setRows(5);
        jScrollPane2.setViewportView(t_icerik);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t_konu, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_show)
                        .addGap(18, 18, 18)
                        .addComponent(b_change)
                        .addGap(18, 18, 18)
                        .addComponent(b_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_key, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(b_g1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_konu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_g1)
                    .addComponent(b_show)
                    .addComponent(b_change)
                    .addComponent(b_delete)
                    .addComponent(jLabel1)
                    .addComponent(t_key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_g1ActionPerformed
        // TODO add your handling code here:
        dispose();
        MenuFrame m=new MenuFrame();
        m.setVisible(true);
    }//GEN-LAST:event_b_g1ActionPerformed

    private void t_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_keyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_keyActionPerformed

    private void b_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_showActionPerformed
        String show1="select content, topic from blogs where key=?";
        try{
            con = connect.connection();
            st1=con.prepareStatement(show1);
            int h=Integer.parseInt(t_key.getText());
            st1.setInt(1, h);
            rs=st1.executeQuery();
            t_icerik.setText(rs.getString("content"));
            t_konu.setText(rs.getString("topic"));
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_b_showActionPerformed

    private void b_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_changeActionPerformed
        // TODO add your handling code here:
        String show="update blogs set content=? ,topic=? where key=?";
        try{
            con = connect.connection();
            st2=con.prepareStatement(show);
            int h=Integer.parseInt(t_key.getText());
            st2.setString(1, t_icerik.getText());
            st2.setString(2, t_konu.getText());
            st2.setInt(3, h);
            st2.execute();
            con.close();
            JOptionPane.showMessageDialog(null,"Blog Düzenlendi");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_b_changeActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        // TODO add your handling code here:
        String show="delete from blogs where key=?";
        try{
            con = connect.connection();
            st3=con.prepareStatement(show);
            int h=Integer.parseInt(t_key.getText());           
            st3.setInt(1, h);
            st3.execute();
            con.close();
            JOptionPane.showMessageDialog(null,"Blog Silindi");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_b_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_change;
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_g1;
    private javax.swing.JButton b_show;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable m_table;
    private javax.swing.JTextArea t_icerik;
    private javax.swing.JTextField t_key;
    private javax.swing.JTextField t_konu;
    // End of variables declaration//GEN-END:variables
}
