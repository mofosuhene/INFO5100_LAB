/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import utility.DatabaseConnector;

/**
 *
 * @author yiado
 */
public class ViewJPanel extends javax.swing.JPanel {
    ArrayList <Patient> patients;
    ImageIcon profilePicture;
    Patient p1;
    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel() {
        initComponents();
        disableAll();
    }
    
    
    public ViewJPanel(Patient p1){
        this.p1= p1;
        initComponents();
        populateData();
        disableAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelFName = new javax.swing.JLabel();
        jTextFieldFName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonOthers = new javax.swing.JRadioButton();
        jButtonSubmit = new javax.swing.JButton();
        PatienttypeJlable = new javax.swing.JLabel();
        patienttypejComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabelFName.setText("Name");

        jTextFieldFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Gender");

        buttonGroupGender.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");
        jRadioButtonMale.setActionCommand("MALE");

        buttonGroupGender.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.setActionCommand("FEMALE");

        buttonGroupGender.add(jRadioButtonOthers);
        jRadioButtonOthers.setText("Prefer Not To Say");
        jRadioButtonOthers.setActionCommand("OTHERS");
        jRadioButtonOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOthersActionPerformed(evt);
            }
        });

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        PatienttypeJlable.setText("Patient Type");

        patienttypejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appointment", "Walk-in" }));
        patienttypejComboBox.setSelectedIndex(-1);
        patienttypejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patienttypejComboBoxActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "PatientType"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSubmit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonFemale)
                            .addComponent(jRadioButtonMale)
                            .addComponent(jRadioButtonOthers))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFName)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldFName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(PatienttypeJlable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patienttypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))))
                .addGap(688, 688, 688))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFName))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jRadioButtonMale))
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButtonFemale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonOthers)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patienttypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatienttypeJlable))
                        .addGap(98, 98, 98)
                        .addComponent(jButtonSubmit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFNameActionPerformed

    private void jRadioButtonOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOthersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonOthersActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:

        //try and catch
        try{
            String Firstname = this.jTextFieldFName.getText();
            String Lastname = this.jTextFieldLName.getText();
            String Email = this.jTextFieldEmail.getText();
            String Age = this.jTextFieldAge.getText();
            String gender = this.buttonGroupGender.getSelection().getActionCommand();
            String displayMessage = "Firstname: "+Firstname+"\n"+"Lastname: "+Lastname+"Email: "+Email+"Age: "+Age+"Gender: "+gender;
            String patienttypeJlable = this.patienttypejComboBox.getSelectedItem().toString();
            //String displayMessage = name + gender;

            //Submit button
            System.out.println(this.jTextFieldFName.getText());
            System.out.println(this.buttonGroupGender.getSelection().getActionCommand());
            System.out.println(this.jTextFieldAge.getText());
            System.out.println(this.patienttypejComboBox.getSelectedItem().toString());
            System.out.println(this.jTextFieldEmail.getText());
            JOptionPane.showMessageDialog(this, displayMessage, "Success", HEIGHT, profilePicture);
            //JOptionPane.showMessageDialog(this, displayMessage);
            //JOptionPane.showMessageDialog(this,displayMessage, "Success","profilepicture");
        }
        catch(NullPointerException ne){
            String errorMessage = ("You must enter values in Name & Gender");

        }
        catch(Exception e){
            System.out.println("Exception has occured");
        }

        String name = this.jTextFieldFName.getText();
        String gender = this.buttonGroupGender.getSelection().getActionCommand();
        String displayMessage = "Name: "+name+" Gender: "+gender;//
        //String displayMessage = name + gender;

        //Submit button
        System.out.println(this.jTextFieldFName.getText());
        System.out.println(this.buttonGroupGender.getSelection().getActionCommand());
        //JOptionPane.showMessageDialog(this, displayMessage);

        //Exception Handling
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void patienttypejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patienttypejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patienttypejComboBoxActionPerformed

    public void populateTable(){
       this.patients = DatabaseConnector.getPatients(); 
    DefaultTableModel model= (DefaultTableModel)this.jTable.getModel();
    model.setRowCount(0);
    for (Patient p1: patients){
    Object[] patientRow = new Object[4];
    patientRow[0] = p1.getId();
    patientRow[1] = p1.getName();
    patientRow[2] = p1.getGender();
    patientRow[3] = p1.getPatientType();
    model.addRow(patientRow);
    
    
    }
    }
    
    public void populateData(){
    this.jTextFieldFName.setText(p1.getName());
    String gender = p1.getGender();
    if(gender.equals("MALE")){
    this .buttonGroupGender.setSelected(this.jRadioButtonMale.getModel(), true);
    
    }else if(gender.equals("FEMALE")){
    this .buttonGroupGender.setSelected(this.jRadioButtonFemale.getModel(), true);
    
    }else{
    this .buttonGroupGender.setSelected(this.jRadioButtonOthers.getModel(), true);
    }
    
    this.pat
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PatienttypeJlable;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonOthers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldFName;
    private javax.swing.JComboBox<String> patienttypejComboBox;
    // End of variables declaration//GEN-END:variables
}
