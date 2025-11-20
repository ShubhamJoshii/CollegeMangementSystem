package college;

public class UserSession{
    private static int userId;
    private static String userName;
    private static String email;
    private static String userRole;
    private static boolean isLoggedIn = false;
    
    public static void setSession(int id, String name, String role) {
        userId = id;
        userName = name;
        userRole = role;
        isLoggedIn = true;
    }
    
    public static void cleanSession() {
        userId = 0;
        userName = null;
        userRole = null;
        isLoggedIn = false;
    }
    
    public static String getUsername() {
        return userName;
    }
    
    public static boolean isLoggedIn() {
        return isLoggedIn;
    }
    
    public static String getUserRole() {
        return userRole;
    }
}
