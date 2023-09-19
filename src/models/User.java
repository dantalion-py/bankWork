package models;

public class User {

    private String userName;
    private String userPassword;
    private AccountTypes accountType;
    private double totalBalance;

    public User(String userName, String userpassword, AccountTypes accountType, double totalBalance ){
        this.userName = userName;
        this.userPassword = userpassword;
        this.accountType = accountType;
        this.totalBalance = totalBalance;
    }

    public Boolean validate(String password){
        return this.userPassword.equals(password);
    }

    public String getUserName() {
        return userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public AccountTypes getAccountTypes() {
        return accountType;
    }
    
    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    @Override
    public String toString(){
        return "user "+ this.userName + " successfully created";
    }
}
