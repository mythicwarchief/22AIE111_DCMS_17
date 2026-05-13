package dcms.core;

public class Admin extends User {
    private int adminId; 
    public Admin(int userId, String name, String email) {
        super(userId, name, email); 
    }
    @Override
    public void displayDashboard() {
        System.out.println("Admin Dashboard for: " + u_name + " (Admin ID: " + adminId + ")"); 
    }
    public void assignComplaint() {
        System.out.println("Admin #" + adminId + " is assigning a complaint...");
    }

    public void monitorStatus() {
        System.out.println("Monitoring system status..."); 
    }
}