package college.Admin;

import collegemanagement.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;
import java.sql.Statement;

public final class GenerateTimeTable extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GenerateTimeTable.class.getName());

    /**
     * Creates new form AddStudentThroughAdmin
     *
     * @param parent
     * @param modal
     */
    public GenerateTimeTable(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        selectCourse = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        selectSemster = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        saveBtn1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GENERATE NEW TABLE");
        setModal(true);
        setResizable(false);

        saveBtn.setBackground(new java.awt.Color(0, 102, 102));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("SAVE");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(204, 0, 51));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("CLOSE/CANCEL");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAddUser(evt);
            }
        });

        selectCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCourseActionPerformed(evt);
            }
        });
        selectCourse.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                selectCoursePropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Select Cource");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Select Semster");

        selectSemster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSemsterActionPerformed(evt);
            }
        });
        selectSemster.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                selectSemsterPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Generate Time Table");

        saveBtn1.setBackground(new java.awt.Color(0, 153, 255));
        saveBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveBtn1.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn1.setText("VIEW");
        saveBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtn1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("CONDITIONS:");

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setText("LAB SHOULD ASSIGN AFTER LUNCH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(64, 64, 64)
                        .addComponent(jCheckBox1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectSemster, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(saveBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(selectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(selectSemster, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fetchCourses() {
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "SELECT * FROM courses";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            selectCourse.removeAllItems();

            while (rs.next()) {
                String courseName = rs.getString("description");
                String courseCode = rs.getString("courseCode");
                selectCourse.addItem(courseCode + " - " + courseName);
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    public void fetchSemsters(String courseCode) {
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "SELECT c.semesters FROM courses c where courseCode = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, courseCode);
            ResultSet rs = ps.executeQuery();

            selectSemster.removeAllItems();

            while (rs.next()) {
                int semesters = rs.getInt("semesters");
                for (int i = 1; i <= semesters; i++) {
                    selectSemster.addItem("" + i);
                }
//                String courseCode = rs.getString("courseCode");
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
    
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

    }//GEN-LAST:event_saveBtnActionPerformed

    private void closeAddUser(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAddUser
        this.dispose();
    }//GEN-LAST:event_closeAddUser

    private void selectCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCourseActionPerformed
        Object selected = selectCourse.getSelectedItem();
        if (selected != null) {
            String courseCode = selected.toString().split("-")[0].trim();
            fetchSemsters(courseCode);
        }
    }//GEN-LAST:event_selectCourseActionPerformed

    private void selectCoursePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_selectCoursePropertyChange

    }//GEN-LAST:event_selectCoursePropertyChange

    private void selectSemsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSemsterActionPerformed
        Object selected = selectSemster.getSelectedItem();
        if (selected != null) {
            String courseCode = selectCourse.getSelectedItem().toString().split("-")[0].trim();
            int courseSemester = Integer.parseInt(selected.toString().split("-")[0].trim());
//            fetchSubjectCourse(courseCode, courseSemester);
        }
    }//GEN-LAST:event_selectSemsterActionPerformed

    private void selectSemsterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_selectSemsterPropertyChange

    }//GEN-LAST:event_selectSemsterPropertyChange

    private void saveBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GenerateTimeTable dialog = new GenerateTimeTable(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton saveBtn1;
    private javax.swing.JComboBox<String> selectCourse;
    private javax.swing.JComboBox<String> selectSemster;
    // End of variables declaration//GEN-END:variables
}
