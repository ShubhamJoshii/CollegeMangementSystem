package college;

import college.Admin.StudentsAdmin;
import college.Admin.TeacherAdmin;

public class MainFrame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());
    public Header header;
    public StudentEntryForm studentForm;
    public Home home;
    public Profile profile;
    public Manage manage;

    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(
                new javax.swing.ImageIcon(
                        getClass().getResource("/images/Logo.png")
                ).getImage()
        );

//        headerContainer.setLayout(new BorderLayout());
        header = new Header(this);
        studentForm = new StudentEntryForm(this);
        home = new Home(this);
        manage = new Manage(this);
        profile = new Profile(this);
        headerContainer.add(header);
        mainPanel.add(home, "home");
        mainPanel.add(manage, "manage");
        mainPanel.add(studentForm, "studentForm");
        mainPanel.add(new Login(this), "login");
        mainPanel.add(profile, "profile");
        mainPanel.add(new Register(this), "register");
        mainPanel.add(new StudentsAdmin(this), "students");
        mainPanel.add(new TeacherAdmin(this), "teachers");
        mainPanel.add(new TimeTable(this), "timetable");
        mainPanel.add(new LeaveRequest(this), "leaverequest");
        mainPanel.add(new Fees(this), "fees");
        mainPanel.add(new Announcement(this), "announcement");
        mainPanel.add(new Course(this), "course");
        mainPanel.add(new Attendence(this), "attendence");

    }

    public void showHeader(boolean visible) {
        headerContainer.setVisible(visible);
        headerContainer.revalidate();
        headerContainer.repaint();
    }

    public final void updateButtonVisibility() {
        home.updateButtonVisibility();
        header.updateButtonVisibility();
        profile.updateButtonVisibility();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        mainPanel = new javax.swing.JPanel();
        headerContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COLLEGE MANAGEMENT SYSTEM");
        setIconImages(null);
        setName("mainFrame"); // NOI18N

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainPanel.setMinimumSize(new java.awt.Dimension(1920, 1080));
        mainPanel.setName(""); // NOI18N
        mainPanel.setPreferredSize(new java.awt.Dimension(1400, 850));
        mainPanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        headerContainer.setBackground(new java.awt.Color(248, 251, 255));
        headerContainer.setPreferredSize(new java.awt.Dimension(10, 100));
        getContentPane().add(headerContainer, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerContainer;
    private java.awt.List list1;
    public javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

}
