package dcms.core;

public abstract class User {
    protected int userId;
    protected String u_name;
    protected String u_email;

    public User(int userId, String u_name, String u_email) {
        this.userId = userId;
        this.u_name = u_name;
        this.u_email = u_email;
    }
    public abstract void displayDashboard();
    
    public int getUserId() { return userId; }
    public String getName() { return u_name; }
}