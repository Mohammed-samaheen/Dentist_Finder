/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portalform;

import com.form.AddressSection;
import com.form.AreasOfSpecializationSection;
import com.form.BiographySection;
import com.form.Builder;
import com.form.EducationSection;
import com.form.PersonalInformation;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author mohammed
 */
public class PreviewForm extends javax.swing.JFrame {

    /**
     * Creates new form PreviewForm
     */
    private  PersonalInformation personalInformation;
    private  BiographySection biographySection;
    private  ArrayList<EducationSection> educationSectionList=new ArrayList<>();
    private  ArrayList<AddressSection> addressSectionList=new ArrayList<>();
    private  ArrayList<AreasOfSpecializationSection> areaList=new ArrayList<>();
    private  Builder dentistFinder;
    private EducationSection educationSection;
     
    

    
    
    public PreviewForm() {
        initComponents();
    }
    public void setDentistFinder(Builder dentistFinder) {
            this.dentistFinder = dentistFinder;
            resitFormeData();
        }
  
    private void resitFormeData(){
       resitPersonalInformationData();
       resitBiographySectionData();
       resitEducationSectionData();;
       resitAddressSection();
    }
    private void resitPersonalInformationData(){
        personalInformation=dentistFinder.getPersonalInformation();
        firstLastNameLabel.setText(personalInformation.getFirstName()+" "+personalInformation.getLastName());
        emailPhneLinkLabel.setText(personalInformation.getEmailAddress()+" | "+personalInformation.getPhoneNumber()
                                    +" | "+personalInformation.getWebsite());
    }
    private void resitBiographySectionData(){
        biographySection=dentistFinder.getBiographySection();
        biographycountryLabel.setText(biographySection.getLicenseCountryName());
        biographyLicenseLabel.setText(biographySection.getLicenseNumber());
        biographyYearsLabel.setText(biographySection.getYearInPractice()+"");
        biographyGenderLabel.setText(biographySection.getGender());
    }
    private void resitEducationSectionData(){
        educationSectionList =dentistFinder.getEducationSectionList();
        String majorList[]=new String[educationSectionList.size()];
        for(int i=0;i<majorList.length;i++)
            majorList[i]=educationSectionList.get(i).getMajor();
        DefaultComboBoxModel model=new DefaultComboBoxModel(majorList);
        majorComboBox.setModel(model);
        
    }
    private void resitAddressSection(){
        addressSectionList=dentistFinder.getAddressSectionList();
        String code[]=new String[addressSectionList.size()];
        for(int i=0;i<code.length;i++)
            code[i]=addressSectionList.get(i).getPostalCode()+"";
        DefaultComboBoxModel model =new DefaultComboBoxModel(code);
        codeComboBox.setModel(model);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        firstLastNameLabel = new javax.swing.JLabel();
        emailPhneLinkLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        biographycountryLabel = new javax.swing.JLabel();
        biographyYearsLabel = new javax.swing.JLabel();
        biographyLicenseLabel = new javax.swing.JLabel();
        biographyGenderLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        majorComboBox = new javax.swing.JComboBox<>();
        educationDegreeLabel = new javax.swing.JLabel();
        educationMajorLabel = new javax.swing.JLabel();
        educationSchoolLabel = new javax.swing.JLabel();
        educationYearLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        codeComboBox = new javax.swing.JComboBox<>();
        addressCountryLabel = new javax.swing.JLabel();
        addressStateLabel = new javax.swing.JLabel();
        addressCityLabel = new javax.swing.JLabel();
        addressCodeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        jPanel1.setBackground(new java.awt.Color(213, 210, 208));

        firstLastNameLabel.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        firstLastNameLabel.setForeground(new java.awt.Color(101, 101, 101));
        firstLastNameLabel.setText("First Name Last Name");

        emailPhneLinkLabel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        emailPhneLinkLabel.setForeground(new java.awt.Color(101, 101, 101));
        emailPhneLinkLabel.setText("Email | phone | link");

        jPanel6.setBackground(new java.awt.Color(186, 180, 175));
        jPanel6.setPreferredSize(new java.awt.Dimension(35, 35));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emailPhneLinkLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstLastNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(firstLastNameLabel))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailPhneLinkLabel)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));

        jLabel4.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(101, 101, 101));
        jLabel4.setText("Biography");

        biographycountryLabel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        biographycountryLabel.setForeground(new java.awt.Color(101, 101, 101));
        biographycountryLabel.setText("Country Name");

        biographyYearsLabel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        biographyYearsLabel.setForeground(new java.awt.Color(101, 101, 101));
        biographyYearsLabel.setText("Years in Practice");

        biographyLicenseLabel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        biographyLicenseLabel.setForeground(new java.awt.Color(101, 101, 101));
        biographyLicenseLabel.setText("License Number");

        biographyGenderLabel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        biographyGenderLabel.setForeground(new java.awt.Color(101, 101, 101));
        biographyGenderLabel.setText("Gender");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(biographycountryLabel))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(biographyYearsLabel)
                                .addGap(122, 122, 122)
                                .addComponent(biographyGenderLabel))
                            .addComponent(biographyLicenseLabel))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(biographycountryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(biographyLicenseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(biographyYearsLabel)
                    .addComponent(biographyGenderLabel))
                .addContainerGap())
        );

        majorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                majorComboBoxActionPerformed(evt);
            }
        });

        educationDegreeLabel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        educationDegreeLabel.setForeground(new java.awt.Color(101, 101, 101));
        educationDegreeLabel.setText("Degree");

        educationMajorLabel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        educationMajorLabel.setForeground(new java.awt.Color(101, 101, 101));
        educationMajorLabel.setText("Major");

        educationSchoolLabel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        educationSchoolLabel.setForeground(new java.awt.Color(101, 101, 101));
        educationSchoolLabel.setText("School");

        educationYearLabel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        educationYearLabel.setForeground(new java.awt.Color(101, 101, 101));
        educationYearLabel.setText("Year");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(majorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(educationDegreeLabel)
                        .addGap(184, 184, 184)
                        .addComponent(educationYearLabel))
                    .addComponent(educationSchoolLabel)
                    .addComponent(educationMajorLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(majorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(educationDegreeLabel)
                    .addComponent(educationYearLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(educationMajorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(educationSchoolLabel))
        );

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));

        codeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeComboBoxActionPerformed(evt);
            }
        });

        addressCountryLabel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        addressCountryLabel.setForeground(new java.awt.Color(101, 101, 101));
        addressCountryLabel.setText("Country");

        addressStateLabel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        addressStateLabel.setForeground(new java.awt.Color(101, 101, 101));
        addressStateLabel.setText("State");

        addressCityLabel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        addressCityLabel.setForeground(new java.awt.Color(101, 101, 101));
        addressCityLabel.setText("City");

        addressCodeLabel.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        addressCodeLabel.setForeground(new java.awt.Color(101, 101, 101));
        addressCodeLabel.setText("Postal Code");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(codeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressCodeLabel)
                    .addComponent(addressCountryLabel)
                    .addComponent(addressStateLabel)
                    .addComponent(addressCityLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(codeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addressCountryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressStateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addressCityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressCodeLabel))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void majorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_majorComboBoxActionPerformed
        // TODO add your handling code here:
        if(!educationSectionList.isEmpty()){
        educationSection =educationSectionList.get(majorComboBox.getSelectedIndex());
        educationDegreeLabel.setText(educationSection.getDegree());
        educationMajorLabel.setText(educationSection.getMajor());
        educationSchoolLabel.setText(educationSection.getSchool());
        educationYearLabel.setText(educationSection.getYear());
        }
        else
            resitEducationSectionData();
    }//GEN-LAST:event_majorComboBoxActionPerformed

    private void codeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeComboBoxActionPerformed
        // TODO add your handling code here:
        if(!addressSectionList.isEmpty()){
            AddressSection addressSection=addressSectionList.get(codeComboBox.getSelectedIndex());
            addressCountryLabel.setText(addressSection.getCountry());
            addressCityLabel.setText(addressSection.getCity());
            addressStateLabel.setText(addressSection.getState());
            addressStateLabel.setText(addressSection.getStreet());
            addressCodeLabel.setText(addressSection.getPostalCode()+"");
        }
        else
            resitAddressSection();
    }//GEN-LAST:event_codeComboBoxActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(PreviewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreviewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreviewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreviewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         
        
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreviewForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressCityLabel;
    private javax.swing.JLabel addressCodeLabel;
    private javax.swing.JLabel addressCountryLabel;
    private javax.swing.JLabel addressStateLabel;
    private javax.swing.JLabel biographyGenderLabel;
    private javax.swing.JLabel biographyLicenseLabel;
    private javax.swing.JLabel biographyYearsLabel;
    private javax.swing.JLabel biographycountryLabel;
    private javax.swing.JComboBox<String> codeComboBox;
    private javax.swing.JLabel educationDegreeLabel;
    private javax.swing.JLabel educationMajorLabel;
    private javax.swing.JLabel educationSchoolLabel;
    private javax.swing.JLabel educationYearLabel;
    private javax.swing.JLabel emailPhneLinkLabel;
    private javax.swing.JLabel firstLastNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> majorComboBox;
    // End of variables declaration//GEN-END:variables
}
