package dcms.core;

public class Complaint {
    private int complaintId; 
    private String description; 
    private String status;
    private String assignedOfficer; 

    public Complaint(int id, String desc) {
        this.complaintId = id;
        this.description = desc;
        this.status = "Pending";
        this.assignedOfficer = "Unassigned"; 
    }

    public int getComplaintId() { return complaintId; }
    public String getStatus() { return status; }
    public void updateStatus(String status) { this.status = status; }
    
    public void setAssignedOfficer(String officer) { this.assignedOfficer = officer; }
    public String getAssignedOfficer() { return assignedOfficer; }
    
    @Override
    public String toString() {
        return "ID: " + complaintId + " | Status: " + status + 
               " | Officer: " + assignedOfficer + " | Issue: " + description;
    }
}