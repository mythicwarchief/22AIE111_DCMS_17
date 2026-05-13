package dcms.services;

import dcms.core.*;
import java.util.ArrayList;
import java.util.List;

public class SystemManager {
    private List<Complaint> complaintList;
    private int idCounter = 100;
    private Admin systemAdmin;

    public SystemManager() {
        this.complaintList = new ArrayList<>(); 
        this.systemAdmin = new Admin(1, "Chief Admin", "admin@dcms.com");
    }
    public synchronized void addComplaint(String description) throws InvalidComplaintException {
        
        if (description == null || description.trim().isEmpty()) {
            throw new InvalidComplaintException("Description cannot be empty!");
        }
        Complaint newComplaint = new Complaint(++idCounter, description);
        complaintList.add(newComplaint);
        System.out.println("System: Complaint #" + idCounter + " stored and Admin notified.");
    }
    public List<Complaint> trackComplaints() {
        return complaintList;
    }
    public synchronized void updateStatus(int id, String newStatus) {
        for (Complaint c : complaintList) {
           
            if (c.getComplaintId() == id) {
                c.updateStatus(newStatus); 
                System.out.println("System: Status updated for Complaint #" + id);
                return;
            }
        }
        System.out.println("System: Complaint ID " + id + " not found.");
    }
    public synchronized void assignAndProcess(int id, String officer, String newStatus) {
    	systemAdmin.assignComplaint();
        for (Complaint c : complaintList) {
            if (c.getComplaintId() == id) {
                c.setAssignedOfficer(officer);
                c.updateStatus(newStatus);
                return;
            }
        }
    }
}