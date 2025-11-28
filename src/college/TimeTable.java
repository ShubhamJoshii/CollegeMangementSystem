package college;

import college.Admin.GenerateTimeTable;
import college.Admin.TimetableCellRenderer;
import java.util.*;
import java.util.stream.Collectors;

import collegemanagement.DBConnection;
import collegemanagement.Subject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

class TimeSlots {

    String timing;
    String type;

    TimeSlots(String timing, String type) {
        this.timing = timing;
        this.type = type;
    }
}

public final class TimeTable extends javax.swing.JPanel {

    MainFrame main;
    DefaultTableModel model;

    public TimeTable(MainFrame main) {
        initComponents();
        this.main = main;
        this.model = (DefaultTableModel) timeTable.getModel();

        TimetableCellRenderer renderer = new TimetableCellRenderer();

        for (int i = 0; i < timeTable.getColumnCount(); i++) {
            timeTable.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        javax.swing.table.JTableHeader header = timeTable.getTableHeader();
        header.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
        header.setBackground(new java.awt.Color(252, 233, 218));
        header.setReorderingAllowed(false);
        header.setPreferredSize(new java.awt.Dimension(header.getWidth(), 60));
        timeTable.setRowHeight(50);

        fetchCourses();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        selectCourse = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        selectSemster = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        timeTable = new javax.swing.JTable();
        generateNewTimeTable = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        coursesPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(248, 251, 255));
        setPreferredSize(new java.awt.Dimension(1300, 800));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Time Table");

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Select Semster");

        jScrollPane2.setBackground(new java.awt.Color(248, 251, 255));

        timeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day/Time", "9:00 AM to 10:00 AM", "10:00 AM to 11:00 AM", "15 Min.", "11:15 AM to 12:15 PM", "12:15 PM to 01:15 PM", "45 Min.", "02:00 PM to 03:00 PM", "03:00 PM to 04:00 PM", "04:00 PM to 05:00 PM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        timeTable.setRowHeight(27);
        jScrollPane2.setViewportView(timeTable);

        generateNewTimeTable.setBackground(new java.awt.Color(0, 102, 102));
        generateNewTimeTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        generateNewTimeTable.setForeground(new java.awt.Color(255, 255, 255));
        generateNewTimeTable.setText("GENERATE TIME TABLE");
        generateNewTimeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateNewTimeTableActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Teachers");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Courses");

        coursesPanel.setBackground(new java.awt.Color(255, 255, 255));
        coursesPanel.setLayout(new javax.swing.BoxLayout(coursesPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectSemster, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(generateNewTimeTable)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(coursesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(318, 318, 318))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(selectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(selectSemster, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(generateNewTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coursesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
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

    public static String selectSubject(List<Subject> subjectList, int totalHour) {
        if (subjectList.isEmpty()) {
            return "Free";
        }

        Subject best = subjectList.get(0);
        for (Subject sub : subjectList) {
            if (sub.remainingClasses > 0 && sub.takenClasses < best.takenClasses) {
                best = sub;
            }
        }

        boolean wasFull = best.remainingClasses <= 0;
        best.updateRemainingClasses(totalHour);

        return wasFull ? best.shortName + " (Extra)" : best.shortName;
    }

    public String subjectClass(List<Subject> subjectList, String slotType) {
        switch (slotType) {
            case "normal" -> {
                List<Subject> classSubjects = subjectList.stream()
                        .filter(s -> s.classType.equalsIgnoreCase("class") && s.remainingClasses > 0)
                        .collect(Collectors.toList());
                if (classSubjects.isEmpty()) {
                    return "Free";
                }
                Collections.shuffle(classSubjects);
                return selectSubject(classSubjects, 1);
            }
            case "lab" -> {
                List<Subject> labSubjects = subjectList.stream()
                        .filter(s -> s.classType.equalsIgnoreCase("lab") && s.remainingClasses > 0)
                        .collect(Collectors.toList());
                if (labSubjects.isEmpty()) {
                    return "Free";
                }
                Collections.shuffle(labSubjects);
                return selectSubject(labSubjects, 2);
            }
            case "break" -> {
                return slotType;
            }
            default -> {
            }
        }
        return "";
    }

    public void fetchSubjectCourse(String courseCode, int courseSemester) {
        String subjectName, subjectCode, userName, classType, shortName;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        List<Subject> subjectList = new ArrayList<Subject>();
        List<String> condition = new ArrayList<String>();

        Object[][] data = new Object[days.length][10];
        for (int i = 0; i < days.length; i++) {
            data[i][0] = days[i];
            data[i][3] = "T E A   B R E A K";
            data[i][6] = "L U N C H   B R E A K";
        }
        String slotType;

        try {
            model.setRowCount(0);
            Connection conn = DBConnection.getConnection();

            String sql = "SELECT s.subjectName, s.subjectCode, s.type, u.userName, s.shortName "
                    + "FROM course_subjects s "
                    + "JOIN teachers t ON t.employeeId = s.teachesBy "
                    + "JOIN courses c ON c.courseId = s.courseId "
                    + "JOIN users u ON u.userId = t.userId "
                    + "WHERE c.courseCode = ?  AND s.semester = ?;";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, courseCode);
            pst.setInt(2, courseSemester);

            try (ResultSet res = pst.executeQuery()) {
                boolean hasResults = false;
                while (res.next()) {
                    hasResults = true;

                    subjectName = res.getString("subjectName");
                    subjectCode = res.getString("subjectCode");
                    userName = res.getString("userName");
                    classType = res.getString("type");
                    shortName = res.getString("shortName");

                    subjectList.add(new Subject(subjectName, shortName.toUpperCase(), classType.toLowerCase(), 6));
                }

                if (!hasResults) {
                    System.out.println("No subjects found for this course and semester.");
                } else {
                    System.out.println("Subjects loaded successfully.");
                }
            }
            pst.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error in Time Table: " + e.getMessage());
        }

        for (Object[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                if (j == 3 || j == 6 || j == 0 || j == data1.length - 1) {
                    continue;
                }
                slotType = j > 6 && j < 9 ? "lab" : "normal";
                data1[j] = subjectClass(subjectList, slotType);
                if ("lab".equals(slotType)) {
                    j++;
                }
            }
        }

        for (Object[] data1 : data) {
            model.addRow(data1);
        }
        updateCourseLegend(subjectList);
    }
    
    
//        subjectList.add(new Subject("Discrete Structures", "DS", "class", 6));
//        subjectList.add(new Subject("Computer Networks", "CN", "class", 4));
//        subjectList.add(new Subject("Operating Systems with Linux", "OS", "class", 4));
//        subjectList.add(new Subject("Database Management Systems", "DBMS", "class", 6));
//        subjectList.add(new Subject("Object Oriented Programming and Java", "OOPS", "class", 6));
//        subjectList.add(new Subject("Computer Networks", "CN (Lab)", "lab", 2));
//        subjectList.add(new Subject("Operating Systems with Linux", "OS (Lab)", "lab", 2));
//        subjectList.add(new Subject("Database Management Systems (Lab)", "DBMS (Lab)", "lab", 2));
//        subjectList.add(new Subject("Object Oriented Programming and Java (Lab)", "OOPS (Lab)", "lab", 2));

    private void updateCourseLegend(List<Subject> subjects) {
        coursesPanel.removeAll();
        coursesPanel.setLayout(new javax.swing.BoxLayout(coursesPanel, javax.swing.BoxLayout.Y_AXIS));

        for (Subject s : subjects) {
            if (s.classType.equalsIgnoreCase("class")) {
                // Create a row
                javax.swing.JPanel row = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
                row.setBackground(Color.WHITE);
                row.setMaximumSize(new Dimension(1000, 30)); // Max height 30px

                // Generate a consistent color based on the subject name
                Color subjectColor = getSubjectColor(s.shortName);

                // Short Name (e.g., DS)
                javax.swing.JLabel lblAbbr = new javax.swing.JLabel(s.shortName);
                lblAbbr.setFont(new Font("Segoe UI", java.awt.Font.BOLD, 12));
                lblAbbr.setForeground(subjectColor);
                lblAbbr.setPreferredSize(new Dimension(50, 20)); // Fixed width for alignment

                // Separator
                javax.swing.JLabel lblSep = new javax.swing.JLabel(" : ");
                lblSep.setForeground(Color.GRAY);

                // Full Name
                javax.swing.JLabel lblName = new javax.swing.JLabel(s.getS_name());
                lblName.setFont(new Font("Segoe UI", java.awt.Font.BOLD, 12));
                lblName.setForeground(subjectColor);

                row.add(lblAbbr);
                row.add(lblSep);
                row.add(lblName);

                coursesPanel.add(row);
            }
        }
        coursesPanel.revalidate();
        coursesPanel.repaint();
    }

    private java.awt.Color getSubjectColor(String shortName) {
        return switch (shortName.toUpperCase()) {
            case "DS" -> new java.awt.Color(218, 165, 32);
            case "CN" -> java.awt.Color.BLACK;
            case "OS" -> new java.awt.Color(60, 179, 113);
            case "DBMS" -> new java.awt.Color(139, 69, 19);
            case "JAVA", "OOPS" -> new java.awt.Color(0, 0, 139);
            default -> java.awt.Color.DARK_GRAY;
        };
    }

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
            fetchSubjectCourse(courseCode, courseSemester);
        }
    }//GEN-LAST:event_selectSemsterActionPerformed

    private void selectSemsterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_selectSemsterPropertyChange

    }//GEN-LAST:event_selectSemsterPropertyChange

    private void generateNewTimeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateNewTimeTableActionPerformed
        GenerateTimeTable generateTimeTable;
        generateTimeTable = new GenerateTimeTable(null, true);
        generateTimeTable.setVisible(true);
    }//GEN-LAST:event_generateNewTimeTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel coursesPanel;
    private javax.swing.JButton generateNewTimeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> selectCourse;
    private javax.swing.JComboBox<String> selectSemster;
    private javax.swing.JTable timeTable;
    // End of variables declaration//GEN-END:variables
}
