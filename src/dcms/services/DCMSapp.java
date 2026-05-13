package dcms.services;

import dcms.core.*;
import java.util.Scanner;

public class DCMSapp {
    public static void main(String[] args) {
        SystemManager system = new SystemManager();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("--- Digital Complaint Management System ---");

        while (running) {
            System.out.println("\n1. Submit Complaint (User)");
            System.out.println("2. View All Complaints (Admin/Officer)");
            System.out.println("3. Update Status (System)");
            System.out.println("4. Assign Officer & Update (Admin Only)"); 
            System.out.println("5. Exit");
            System.out.print("Select Option: ");
            
            String choice = sc.nextLine();

            try {
                switch (choice) {
                    case "1":
                        System.out.print("Enter your complaint: ");
                        String desc = sc.nextLine();
                        system.addComplaint(desc); 
                        break;

                    case "2":
                        System.out.println("\n--- Current Complaint Records ---");
                        if (system.trackComplaints().isEmpty()) {
                            System.out.println("No complaints registered yet.");
                        } else {
                            for (Complaint c : system.trackComplaints()) { 
                                System.out.println(c);
                            }
                        }
                        break;

                    case "3":
                        System.out.print("Enter Complaint ID to update: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter New Status (Resolved/In-Progress): ");
                        String status = sc.nextLine();
                        system.updateStatus(id, status); 
                        break;

                    case "4": 
                        System.out.print("Enter Admin Password to proceed: ");
                        if (sc.nextLine().equals("123")) {
                            System.out.print("Enter Complaint ID: ");
                            int assignId = Integer.parseInt(sc.nextLine());
                            System.out.print("Enter Officer Name to Assign: ");
                            String officer = sc.nextLine();
                            System.out.print("Enter Status Update: ");
                            String newStat = sc.nextLine();
                            system.assignAndProcess(assignId, officer, newStat);
                            System.out.println("Success: Officer assigned and status updated.");
                        } else {
                            System.out.println("Access Denied: Incorrect Password.");
                        }
                        break;

                    case "5":
                        running = false;
                        System.out.println("Exiting System...");
                        break;

                    default:
                        System.out.println("Invalid Selection.");
                }
            } catch (InvalidComplaintException e) {
                System.out.println("Submission Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a numeric ID.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
        sc.close();
    }
}