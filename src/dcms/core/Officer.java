package dcms.core;
public class Officer extends User {
    private int officerId;

    public Officer(int userId, String u_name, String u_email) { 
        super(userId, u_name, u_email);
        this.officerId = userId;
    }
    @Override
    public void displayDashboard() {
        System.out.println("\n--- Officer Dashboard ---");
        System.out.println("Officer Name: " + u_name);
        System.out.println("Officer ID  : " + officerId);
        System.out.println("Email       : " + u_email);
    }
    public void resolveComplaint(int complaintId) {
        System.out.println("Officer " + u_name + " is processing resolution for Complaint #" + complaintId);
    }
    public void viewAssignedComplaints() {
        System.out.println("Fetching all complaints assigned to Officer: " + u_name);
    }
}