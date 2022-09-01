package backend.Models;

public class Users {
    private String name;
    private String password;
    private int balance;
    private int eId;
    private String role;

    public Users() {

    }

    public Users(String name, String password, int balance, int eId, String role) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.eId = eId;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Users [balance=" + balance + ", eId=" + eId + ", name=" + name
                + ", password=" + password + ", role=" + role + "]";
    }

}
