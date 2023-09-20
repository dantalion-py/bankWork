package models.account;

import models.Invoice;
import models.User;

public class C2000Account extends Account {
    private double interes = 0.08;
    private double penaly = 0.02;
    private double totalmoney;
    public C2000Account(User user){
        super(user);
        this.totalmoney = (user.getTotalBalance()*interes)+user.getTotalBalance();
    }
    @Override
    public void withdrawalWithInvoice(double withdrawal) {
        if(totalmoney>=withdrawal){
            user.setTotalBalance((totalmoney-withdrawal)-(withdrawal*penaly));
            var invoice = new Invoice(user, withdrawal,0);
            invoice.getInvoice();
        }else{
            System.out.println("does not have sufficient funds");
        }
    }
    @Override
    public void withdrawalWithoutInvoice(double withdrawal) {
        if(totalmoney>=withdrawal){
            user.setTotalBalance((totalmoney-withdrawal)-(withdrawal*penaly));
        }else{
            System.out.println("does not have sufficient funds");
        }    
    }
    @Override
    public void depositWithInvoice(double deposit) {
        try{

            user.setTotalBalance(totalmoney+deposit);
            var invoice = new Invoice(user, 0,deposit);
            invoice.getInvoice();
        }catch(Exception e){
            System.out.println(" could not be deposited");
        }
        
    }
    @Override
    public void depositWithoutInvoice(double deposit) {
        try{            
            user.setTotalBalance(totalmoney+deposit);
        }catch(Exception e){
            System.out.println(" could not be deposited");
        }
    }
    
}
