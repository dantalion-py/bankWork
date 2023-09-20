package models.account;

import models.User;

public abstract class Account implements AccountActions{
    protected User user;

    public Account(User user){
        this.user = user;
    }

    public void sigIn(User user,String password){
        if(validate(password)){
            System.out.println("Session started successfully!");
            
        }
    }
    public void createAccount(){
        new User(user.getUserName(), this.user.getUserPassword(), this.user.getAccountTypes(), this.user.getTotalBalance());
    }
    public String getNameAccount(){
        return user.getUserName();
    }
    public String getPasswordAccount(){
        return user.getUserPassword();
    }
    public Boolean validate(String password){
        return user.getUserPassword().equals(password);
    }
}
