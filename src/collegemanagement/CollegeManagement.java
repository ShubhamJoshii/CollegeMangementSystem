package collegemanagement;

import college.*;
//import java.sql.*;

public class CollegeManagement {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
//        try {
//            Connection conn = DBConnection.getConnection();
//
//            String sql = "INSERT INTO SampleTable VALUES (?, ?)";
//            PreparedStatement pst = conn.prepareStatement(sql);
//
//            pst.setInt(1, 2443);
//            pst.setString(2, "SHUBHAM!");
//
//            int status = pst.executeUpdate();
//
//            if (status > 0) {
//                System.out.println("Success");
//            } else {
//                System.out.println("Un-Success");
//            }
//
//            pst.close();
//            conn.close();
//
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println("Error in register: " + e.getMessage());
//        }
    }
}
