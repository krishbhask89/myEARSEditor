/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myearseditor.View;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Krish
 */
public class BasePanel extends javax.swing.JPanel {

    /**
     * Creates new form BasePanel
     */
    public BasePanel() {
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

        _comboBoxPanel = new javax.swing.JPanel();
        _reqTypeList = new javax.swing.JComboBox();

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
                .addContainerGap(146, Short.MAX_VALUE))
        );
        _comboBoxPanelLayout.setVerticalGroup(
            _comboBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_comboBoxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_reqTypeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_comboBoxPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_comboBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(298, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void _reqTypeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__reqTypeListActionPerformed
        // TODO add your handling code here:
        int _reqSelected = _reqTypeList.getSelectedIndex();
        if(_reqSelected > 0 && _reqSelected < 6)
        {    JPanel _newReq = new JPanel(new BorderLayout());   
             
           switch(_reqSelected)
           { case 1: JPanel _reqProps = new LeftPanel("Generic");
                  JPanel _reqTemp = new GenericTemp();
                  _newReq.add(_reqProps, BorderLayout.WEST);
                  _newReq.add(_reqTemp,BorderLayout.EAST);
                  break;
             case 2: JPanel _reqProps = new LeftPanel("Ubiquitous");
                  JPanel _reqTemp = new UbiTemp();
                  _newReq.add(_reqProps, BorderLayout.WEST);
                  _newReq.add(_reqTemp,BorderLayout.EAST);
                  break;
           }    
        }    
    }//GEN-LAST:event__reqTypeListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel _comboBoxPanel;
    private javax.swing.JComboBox _reqTypeList;
    // End of variables declaration//GEN-END:variables
}
