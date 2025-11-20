package college;

import java.awt.BorderLayout;
import java.awt.CardLayout;


public class Home extends javax.swing.JPanel {
    
    MainFrame main;
    
    public Home(MainFrame main) {
        
        initComponents();
        this.main = main;
        headerContainer.setLayout(new BorderLayout());
        headerContainer.add(new Header(main));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        announcement = new javax.swing.JButton();
        timetable = new javax.swing.JButton();
        courses = new javax.swing.JButton();
        attendence = new javax.swing.JButton();
        leaveRequest = new javax.swing.JButton();
        feesBtn = new javax.swing.JButton();
        studentBtn = new javax.swing.JButton();
        studentForm = new javax.swing.JButton();
        settings2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 251, 255));
        setPreferredSize(new java.awt.Dimension(1170, 800));
        setLayout(null);

        headerContainer.setBackground(new java.awt.Color(248, 251, 255));
        add(headerContainer);
        headerContainer.setBounds(0, 0, 1110, 100);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 0, 20, 20));

        announcement.setBackground(new java.awt.Color(0, 153, 204));
        announcement.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        announcement.setForeground(new java.awt.Color(255, 255, 255));
        announcement.setText("ANNOUNCEMENT");
        announcement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                announcementActionPerformed(evt);
            }
        });
        jPanel1.add(announcement);

        timetable.setBackground(new java.awt.Color(0, 153, 204));
        timetable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timetable.setForeground(new java.awt.Color(255, 255, 255));
        timetable.setText("TIMETABLE");
        timetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timetableActionPerformed(evt);
            }
        });
        jPanel1.add(timetable);

        courses.setBackground(new java.awt.Color(0, 153, 204));
        courses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        courses.setForeground(new java.awt.Color(255, 255, 255));
        courses.setText("COURSES");
        courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesActionPerformed(evt);
            }
        });
        jPanel1.add(courses);

        attendence.setBackground(new java.awt.Color(0, 153, 204));
        attendence.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        attendence.setForeground(new java.awt.Color(255, 255, 255));
        attendence.setText("ATTENDENCE");
        attendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendenceActionPerformed(evt);
            }
        });
        jPanel1.add(attendence);

        leaveRequest.setBackground(new java.awt.Color(0, 153, 204));
        leaveRequest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        leaveRequest.setForeground(new java.awt.Color(255, 255, 255));
        leaveRequest.setText("LEAVE REQUEST");
        leaveRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveRequestActionPerformed(evt);
            }
        });
        jPanel1.add(leaveRequest);

        feesBtn.setBackground(new java.awt.Color(0, 153, 204));
        feesBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        feesBtn.setForeground(new java.awt.Color(255, 255, 255));
        feesBtn.setText("FEES");
        feesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesBtnActionPerformed(evt);
            }
        });
        jPanel1.add(feesBtn);

        studentBtn.setBackground(new java.awt.Color(0, 153, 204));
        studentBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentBtn.setForeground(new java.awt.Color(255, 255, 255));
        studentBtn.setText("STUDENTS");
        studentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtnActionPerformed(evt);
            }
        });
        jPanel1.add(studentBtn);

        studentForm.setBackground(new java.awt.Color(0, 153, 204));
        studentForm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentForm.setForeground(new java.awt.Color(255, 255, 255));
        studentForm.setText("STUDENT ENTRY FORM");
        studentForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentFormActionPerformed(evt);
            }
        });
        jPanel1.add(studentForm);

        settings2.setBackground(new java.awt.Color(0, 153, 204));
        settings2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        settings2.setForeground(new java.awt.Color(255, 255, 255));
        settings2.setText("SETTINGS");
        settings2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings2ActionPerformed(evt);
            }
        });
        jPanel1.add(settings2);

        add(jPanel1);
        jPanel1.setBounds(30, 230, 1050, 260);
    }// </editor-fold>//GEN-END:initComponents

    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentBtnActionPerformed
        CardLayout cl = (CardLayout) main.mainPanel.getLayout();
        cl.show(main.mainPanel, "students");
    }//GEN-LAST:event_studentBtnActionPerformed

    private void announcementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_announcementActionPerformed
        CardLayout cl = (CardLayout) main.mainPanel.getLayout();
        cl.show(main.mainPanel, "announcement");
    }//GEN-LAST:event_announcementActionPerformed

    private void timetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timetableActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) main.mainPanel.getLayout();
        cl.show(main.mainPanel, "timetable");
    }//GEN-LAST:event_timetableActionPerformed

    private void coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesActionPerformed
        // TODO add your handling code here:
         CardLayout cl = (CardLayout) main.mainPanel.getLayout();
        cl.show(main.mainPanel, "course");
    }//GEN-LAST:event_coursesActionPerformed

    private void attendenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendenceActionPerformed
        CardLayout cl = (CardLayout) main.mainPanel.getLayout();
        cl.show(main.mainPanel, "attendence");
    }//GEN-LAST:event_attendenceActionPerformed

    private void leaveRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveRequestActionPerformed
        // TODO add your handling code here:
         CardLayout cl = (CardLayout) main.mainPanel.getLayout();
        cl.show(main.mainPanel, "leaverequest");
    }//GEN-LAST:event_leaveRequestActionPerformed

    private void feesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feesBtnActionPerformed
        // TODO add your handling code here:
         CardLayout cl = (CardLayout) main.mainPanel.getLayout();
        cl.show(main.mainPanel, "fees");
    }//GEN-LAST:event_feesBtnActionPerformed

    private void studentFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentFormActionPerformed
        CardLayout cl = (CardLayout) main.mainPanel.getLayout();
        cl.show(main.mainPanel, "studentForm");
    }//GEN-LAST:event_studentFormActionPerformed

    private void settings2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settings2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settings2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton announcement;
    private javax.swing.JButton attendence;
    private javax.swing.JButton courses;
    private javax.swing.JButton feesBtn;
    private javax.swing.JPanel headerContainer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton leaveRequest;
    private javax.swing.JButton settings2;
    private javax.swing.JButton studentBtn;
    private javax.swing.JButton studentForm;
    private javax.swing.JButton timetable;
    // End of variables declaration//GEN-END:variables
}
