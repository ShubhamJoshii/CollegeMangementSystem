package college;

import java.awt.CardLayout;

public class Home extends javax.swing.JPanel {

    MainFrame main;
    public Home(MainFrame main) {
        initComponents();
        this.main = main;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentBtn = new javax.swing.JButton();
        facultyBtn = new javax.swing.JButton();
        adminBtn = new javax.swing.JButton();
        courses = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fees = new javax.swing.JLabel();
        announcements = new javax.swing.JLabel();
        timetable = new javax.swing.JLabel();
        attendence = new javax.swing.JLabel();
        LeaveRequest = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        timetable1 = new javax.swing.JLabel();

        studentBtn.setText("Student");
        studentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtnActionPerformed(evt);
            }
        });

        facultyBtn.setText("Faculty");
        facultyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyBtnActionPerformed(evt);
            }
        });

        adminBtn.setText("Admin");
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        courses.setBackground(new java.awt.Color(0, 153, 204));
        courses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        courses.setForeground(new java.awt.Color(255, 255, 255));
        courses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        courses.setText("COURSES");
        courses.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        courses.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo35.png"))); // NOI18N
        jLabel11.setText("COLLEGE MANAGEMENT SYSTEM");

        fees.setBackground(new java.awt.Color(0, 153, 204));
        fees.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fees.setForeground(new java.awt.Color(255, 255, 255));
        fees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fees.setText("FEES");
        fees.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        fees.setOpaque(true);

        announcements.setBackground(new java.awt.Color(0, 153, 204));
        announcements.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        announcements.setForeground(new java.awt.Color(255, 255, 255));
        announcements.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        announcements.setText("ANNOUNCEMENTS");
        announcements.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        announcements.setOpaque(true);

        timetable.setBackground(new java.awt.Color(0, 153, 204));
        timetable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timetable.setForeground(new java.awt.Color(255, 255, 255));
        timetable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timetable.setText("TIMETABLE");
        timetable.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        timetable.setOpaque(true);

        attendence.setBackground(new java.awt.Color(0, 153, 204));
        attendence.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        attendence.setForeground(new java.awt.Color(255, 255, 255));
        attendence.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attendence.setText("ATTENDENCE");
        attendence.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        attendence.setOpaque(true);

        LeaveRequest.setBackground(new java.awt.Color(0, 153, 204));
        LeaveRequest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LeaveRequest.setForeground(new java.awt.Color(255, 255, 255));
        LeaveRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LeaveRequest.setText("LEAVE REQUEST");
        LeaveRequest.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LeaveRequest.setOpaque(true);

        settings.setBackground(new java.awt.Color(0, 153, 204));
        settings.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        settings.setForeground(new java.awt.Color(255, 255, 255));
        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setText("SETTINGS");
        settings.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        settings.setOpaque(true);

        timetable1.setBackground(new java.awt.Color(0, 153, 204));
        timetable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timetable1.setForeground(new java.awt.Color(255, 255, 255));
        timetable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timetable1.setText("-");
        timetable1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        timetable1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fees, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timetable, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courses, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(announcements, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attendence, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(studentBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(facultyBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminBtn)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timetable1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LeaveRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentBtn)
                    .addComponent(facultyBtn)
                    .addComponent(adminBtn)
                    .addComponent(jLabel11))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attendence, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courses, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LeaveRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timetable, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(announcements, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fees, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timetable1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(220, 220, 220))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminBtnActionPerformed

    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentBtnActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) main.mainPanel.getLayout();
        cl.show(main.mainPanel, "students");
    }//GEN-LAST:event_studentBtnActionPerformed

    private void facultyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LeaveRequest;
    private javax.swing.JButton adminBtn;
    private javax.swing.JLabel announcements;
    private javax.swing.JLabel attendence;
    private javax.swing.JLabel courses;
    private javax.swing.JButton facultyBtn;
    private javax.swing.JLabel fees;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel settings;
    private javax.swing.JButton studentBtn;
    private javax.swing.JLabel timetable;
    private javax.swing.JLabel timetable1;
    // End of variables declaration//GEN-END:variables
}
