package models;

public class Account {
    private User user;
    public Account(User user){
        this.user = user;
    }

    public void sigIn(String password){
        if(this.user.validate(password)){
            System.out.println("Session started successfully!");
            
        }
    }
    public void createAccount(){
        new User(user.getUserName(), this.user.getUserPassword(), this.user.getAccountTypes(), this.user.getTotalBalance());
    }
}
