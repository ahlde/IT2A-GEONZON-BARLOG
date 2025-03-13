package config;

/**
 *
 * @author Asus
 */
public class User {
    private static User instance;
    private String ID;
    private String fname;
    private String lname;
    private String contact_number;
    private String email;
    private String username;
    private String password;
    private String role;
    private String status;
    
    private User(){
        //Private constructor prevents instance
    }

    public static synchronized User getInstance() {
        if(instance==null){
           instance = new User();
        
      }
      return instance;
    }
    public static boolean isinstanceEmpty(){
        return instance == null;
    }
    
    public String getID(){
        return ID;
    }
    public void setID(String id){
        this.ID= id;
      
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}