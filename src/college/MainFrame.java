package college;

public class MainFrame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());

    public MainFrame() {
        initComponents();
        setIconImage(
                new javax.swing.ImageIcon(
                        getClass().getResource("/images/Logo.png")
                ).getImage()
        );
        Login loginPanel = new Login(this);
        Register registerPanel = new Register(this);
        Home homePanel = new Home(this);
        Students studentPanel = new Students(this);
        TimeTable timeTablePanel = new TimeTable(this);
        StudentEntryForm studentEntryForm = new StudentEntryForm(this);
        LeaveRequest leaverequestPanel = new LeaveRequest(this);
        Fees feesPanel = new Fees(this);
        Course coursePanel = new Course(this);
        Attendence attendencePanel = new Attendence(this);
        Announcement announcementPanel = new Announcement(this);
      
        
        mainPanel.add(homePanel, "home");
        mainPanel.add(studentEntryForm, "studentForm");
        mainPanel.add(loginPanel, "login");
        mainPanel.add(registerPanel, "register");
        mainPanel.add(studentPanel, "students");
        mainPanel.add(timeTablePanel,"timetable");
        mainPanel.add(leaverequestPanel,"leaverequest");
        mainPanel.add(feesPanel,"fees");
        mainPanel.add(announcementPanel,"announcement");
        mainPanel.add(coursePanel,"course");
        mainPanel.add(attendencePanel,"attendence");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COLLEGE MANAGEMENT SYSTEM");
        setIconImages(null);
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1170, 800));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainPanel.setMinimumSize(new java.awt.Dimension(1920, 1080));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
