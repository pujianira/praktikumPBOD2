
import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class GuiCollection2 extends javax.swing.JFrame {

    DefaultListModel<String> dlm;
    List<String> items = new ArrayList<>();
    String[] datas = {"buku", "meja", "kursi", "tas", "pintu"};
    /**
     * Creates new form GuiCollection
     */
    public GuiCollection2() {
        initComponents();
        this.dlm = new DefaultListModel<>();
        this.jListItem.setModel(dlm);
        
        for (String data : datas) {
            dlm.addElement(data);
            updateJumlahDataTersimpan();
        }
    }
    
    private void addItem(String namaItem) {
        dlm.addElement(namaItem);
    }
        
    private void updateJumlahDataTersimpan(){
        jLabelJumlah.setText(
            "Data tersimpan = " + items.size());
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList<>();
        jButtonInsertData = new javax.swing.JButton();
        jButtonSaveData = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClearAll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldItemName = new javax.swing.JTextField();
        jLabelJumlah = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListItem);

        jButtonInsertData.setText("insert data");
        jButtonInsertData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataActionPerformed(evt);
            }
        });

        jButtonSaveData.setText("save data");
        jButtonSaveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveDataActionPerformed(evt);
            }
        });

        jButtonAdd.setText("add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonClearAll.setText("clear all");
        jButtonClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearAllActionPerformed(evt);
            }
        });

        jLabel1.setText("Item name:");

        jTextFieldItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldItemNameActionPerformed(evt);
            }
        });

        jLabelJumlah.setText("Data tersimpan =");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonInsertData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSaveData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUpdate)
                            .addComponent(jButtonClearAll)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabelJumlah)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonInsertData)
                            .addComponent(jLabelJumlah))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSaveData)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdd)
                            .addComponent(jButtonUpdate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDelete)
                            .addComponent(jButtonClearAll)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataActionPerformed
        for (String item : items) {
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataActionPerformed

    private void jTextFieldItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldItemNameActionPerformed

    private void jButtonSaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveDataActionPerformed
        if (!items.isEmpty()) {
            items.clear();
        }
        
        for (int i = 0; i < dlm.getSize(); i++) {
            items.add(dlm.getElementAt(i));
        }
        
        updateJumlahDataTersimpan();
    }//GEN-LAST:event_jButtonSaveDataActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        addItem(jTextFieldItemName.getText());
        
        jTextFieldItemName.setText("");
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int index = jListItem.getSelectedIndex();
        String selected = jTextFieldItemName.getText();
        dlm.setElementAt(selected, index);
        
        jTextFieldItemName.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int index = jListItem.getSelectedIndex();
        dlm.removeElementAt(index);
        
        jTextFieldItemName.setText("");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
        dlm.clear();
    }//GEN-LAST:event_jButtonClearAllActionPerformed

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
            java.util.logging.Logger.getLogger(GuiCollection2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCollection2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCollection2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCollection2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiCollection2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertData;
    private javax.swing.JButton jButtonSaveData;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelJumlah;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldItemName;
    // End of variables declaration//GEN-END:variables
}
