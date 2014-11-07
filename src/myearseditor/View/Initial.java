/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myearseditor.View;

/**
 *
 * @author Krish
 */
public class Initial extends javax.swing.JFrame {

    /**
     * Creates new form Initial
     */
    public Initial() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        _basePanel = new javax.swing.JPanel();
        _comboBoxPanel = new javax.swing.JPanel();
        _reqTypeList = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        _FileMenu = new javax.swing.JMenu();
        _newFileItem = new javax.swing.JMenuItem();
        _openFileItem = new javax.swing.JMenuItem();
        _saveFileItem = new javax.swing.JMenuItem();
        _saveAsFileItem = new javax.swing.JMenuItem();
        _exitFileItem = new javax.swing.JMenuItem();
        _ToolsMenu = new javax.swing.JMenu();
        _NavigationMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        _reqTypeList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select Requirement Type>", "Generic", "Ubiquitous", "Event Driven", "Unwanted Behaviour","State Driven" }));
        _reqTypeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _reqTypeListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout _comboBoxPanelLayout = new javax.swing.GroupLayout(_comboBoxPanel);
        _comboBoxPanel.setLayout(_comboBoxPanelLayout);
        _comboBoxPanelLayout.setHorizontalGroup(
            _comboBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_comboBoxPanelLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(_reqTypeList, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        _comboBoxPanelLayout.setVerticalGroup(
            _comboBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_comboBoxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_reqTypeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout _basePanelLayout = new javax.swing.GroupLayout(_basePanel);
        _basePanel.setLayout(_basePanelLayout);
        _basePanelLayout.setHorizontalGroup(
            _basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_comboBoxPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        _basePanelLayout.setVerticalGroup(
            _basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_comboBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("untitled", _basePanel);

        jScrollPane1.setViewportView(jTabbedPane1);

        _FileMenu.setText("File");

        _newFileItem.setText("New");
        _newFileItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _newFileItemActionPerformed(evt);
            }
        });
        _FileMenu.add(_newFileItem);

        _openFileItem.setText("Open");
        _FileMenu.add(_openFileItem);

        _saveFileItem.setText("Save");
        _FileMenu.add(_saveFileItem);

        _saveAsFileItem.setText("Save As..");
        _FileMenu.add(_saveAsFileItem);

        _exitFileItem.setText("Exit");
        _FileMenu.add(_exitFileItem);

        jMenuBar1.add(_FileMenu);

        _ToolsMenu.setText("Tools");
        jMenuBar1.add(_ToolsMenu);

        _NavigationMenu.setText("Navigation");
        jMenuBar1.add(_NavigationMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _reqTypeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__reqTypeListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__reqTypeListActionPerformed

    private void _newFileItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__newFileItemActionPerformed
        // TODO add your handling code here:
        new BasePanel;
    }//GEN-LAST:event__newFileItemActionPerformed

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
            java.util.logging.Logger.getLogger(Initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Initial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu _FileMenu;
    private javax.swing.JMenu _NavigationMenu;
    private javax.swing.JMenu _ToolsMenu;
    private javax.swing.JPanel _basePanel;
    private javax.swing.JPanel _comboBoxPanel;
    private javax.swing.JMenuItem _exitFileItem;
    private javax.swing.JMenuItem _newFileItem;
    private javax.swing.JMenuItem _openFileItem;
    private javax.swing.JComboBox _reqTypeList;
    private javax.swing.JMenuItem _saveAsFileItem;
    private javax.swing.JMenuItem _saveFileItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
