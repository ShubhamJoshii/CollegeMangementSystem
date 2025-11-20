package college;
import java.awt.BorderLayout;

public class StudentEntryForm extends javax.swing.JPanel {

    MainFrame main;
    public StudentEntryForm(MainFrame main) {
        initComponents();
        this.main = main;
        headerContainer.setLayout(new BorderLayout());
        headerContainer.add(new Header(main));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        applicationNumber = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        panel1 = new java.awt.Panel();
        headerContainer = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        applicationNumber1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        applicationNumber2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        applicationNumber3 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        applicationNumber4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("© 2025 EduManage. All rights reserved.");

        setBackground(new java.awt.Color(248, 251, 255));
        setPreferredSize(new java.awt.Dimension(1170, 800));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Application Number");
        add(jLabel1);
        jLabel1.setBounds(40, 170, 151, 20);

        jLabel5.setText("Address");
        add(jLabel5);
        jLabel5.setBounds(93, 483, 42, 16);

        jLabel6.setText("Course");
        add(jLabel6);
        jLabel6.setBounds(93, 523, 37, 16);

        jLabel7.setText("Semester");
        add(jLabel7);
        jLabel7.setBounds(93, 563, 48, 16);

        jLabel8.setText("Batch");
        add(jLabel8);
        jLabel8.setBounds(279, 591, 30, 16);

        jLabel9.setText("Date");
        add(jLabel9);
        jLabel9.setBounds(279, 634, 24, 16);

        jLabel10.setText("Qualification");
        add(jLabel10);
        jLabel10.setBounds(279, 674, 68, 16);

        jLabel12.setText("University");
        add(jLabel12);
        jLabel12.setBounds(279, 714, 52, 16);

        applicationNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationNumberActionPerformed(evt);
            }
        });
        add(applicationNumber);
        applicationNumber.setBounds(190, 250, 249, 31);

        jTextField5.setText("jTextField5");
        add(jTextField5);
        jTextField5.setBounds(208, 483, 71, 22);

        jTextField6.setText("jTextField6");
        add(jTextField6);
        jTextField6.setBounds(208, 523, 71, 22);

        jTextField7.setText("jTextField7");
        add(jTextField7);
        jTextField7.setBounds(208, 563, 71, 22);

        jTextField8.setText("jTextField8");
        add(jTextField8);
        jTextField8.setBounds(374, 591, 71, 22);

        jTextField9.setText("jTextField9");
        add(jTextField9);
        jTextField9.setBounds(374, 631, 71, 22);

        jTextField10.setText("jTextField10");
        add(jTextField10);
        jTextField10.setBounds(374, 671, 77, 22);

        jTextField11.setText("jTextField11");
        add(jTextField11);
        jTextField11.setBounds(374, 711, 77, 22);

        jLabel15.setText("Sex");
        add(jLabel15);
        jLabel15.setBounds(279, 446, 17, 16);

        jLabel16.setText("D.O.B");
        add(jLabel16);
        jLabel16.setBounds(60, 630, 42, 16);

        jTextField15.setText("jTextField15");
        add(jTextField15);
        jTextField15.setBounds(413, 443, 77, 22);

        jLabel17.setText("Occupation");
        add(jLabel17);
        jLabel17.setBounds(279, 486, 62, 16);

        jTextField16.setText("jTextField16");
        add(jTextField16);
        jTextField16.setBounds(414, 483, 77, 22);

        jLabel18.setText("Phone");
        add(jLabel18);
        jLabel18.setBounds(279, 526, 62, 16);

        jTextField17.setText("jTextField17");
        add(jTextField17);
        jTextField17.setBounds(414, 523, 77, 22);

        jLabel19.setText("Email ID:");
        add(jLabel19);
        jLabel19.setBounds(279, 566, 46, 16);

        jTextField18.setText("jTextField18");
        add(jTextField18);
        jTextField18.setBounds(414, 563, 77, 22);

        jLabel20.setText("Status");
        add(jLabel20);
        jLabel20.setBounds(595, 591, 47, 16);

        jTextField19.setText("jTextField19");
        add(jTextField19);
        jTextField19.setBounds(730, 591, 77, 22);

        panel1.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        add(panel1);
        panel1.setBounds(910, 160, 150, 176);

        headerContainer.setBackground(new java.awt.Color(248, 251, 255));
        add(headerContainer);
        headerContainer.setBounds(0, 0, 1110, 100);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("MCA0445488");
        add(jLabel11);
        jLabel11.setBounds(190, 170, 87, 20);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("FULL NAME");
        add(jLabel27);
        jLabel27.setBounds(40, 250, 76, 20);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Father's Name");
        add(jLabel28);
        jLabel28.setBounds(40, 300, 96, 20);

        applicationNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationNumber1ActionPerformed(evt);
            }
        });
        add(applicationNumber1);
        applicationNumber1.setBounds(190, 290, 249, 31);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(640, 750, 88, 36);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(750, 750, 88, 36);

        jButton3.setBackground(new java.awt.Color(204, 0, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(850, 750, 88, 36);

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(960, 750, 88, 36);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Mother's Name");
        add(jLabel29);
        jLabel29.setBounds(40, 350, 120, 20);

        applicationNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationNumber2ActionPerformed(evt);
            }
        });
        add(applicationNumber2);
        applicationNumber2.setBounds(190, 340, 249, 31);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Registration Number");
        add(jLabel2);
        jLabel2.setBounds(330, 170, 151, 20);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("MCA0445488");
        add(jLabel22);
        jLabel22.setBounds(480, 170, 87, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Roll Number");
        add(jLabel3);
        jLabel3.setBounds(610, 170, 100, 20);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("MCA0445488");
        add(jLabel23);
        jLabel23.setBounds(710, 170, 87, 20);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Occupation");
        add(jLabel30);
        jLabel30.setBounds(480, 300, 76, 20);

        applicationNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationNumber3ActionPerformed(evt);
            }
        });
        add(applicationNumber3);
        applicationNumber3.setBounds(570, 290, 249, 31);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Occupation");
        add(jLabel31);
        jLabel31.setBounds(480, 350, 76, 20);

        applicationNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationNumber4ActionPerformed(evt);
            }
        });
        add(applicationNumber4);
        applicationNumber4.setBounds(570, 340, 249, 31);

        jButton5.setText("Select Photo");
        add(jButton5);
        jButton5.setBounds(930, 350, 110, 23);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Student Detail Registration");
        add(jLabel4);
        jLabel4.setBounds(40, 110, 350, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void applicationNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_applicationNumberActionPerformed

    private void applicationNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_applicationNumber1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void applicationNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationNumber2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_applicationNumber2ActionPerformed

    private void applicationNumber3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationNumber3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_applicationNumber3ActionPerformed

    private void applicationNumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationNumber4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_applicationNumber4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField applicationNumber;
    private javax.swing.JTextField applicationNumber1;
    private javax.swing.JTextField applicationNumber2;
    private javax.swing.JTextField applicationNumber3;
    private javax.swing.JTextField applicationNumber4;
    private javax.swing.JPanel headerContainer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
