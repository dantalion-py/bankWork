package models.account;

import models.Invoice;
import models.User;

public class CheckingAccount extends Account {
    public CheckingAccount(User user){
        super(user);
    }
    @Override
    public void withdrawalWithInvoice(double withdrawal) {
        if(user.getTotalBalance()>=withdrawal){
            user.setTotalBalance(user.getTotalBalance()-withdrawal);
            var invoice = new Invoice(user, withdrawal,0);
            invoice.getInvoice();
        }
    }
    @Override
    public void withdrawalWithoutInvoice(double withdrawal) {
        if(user.getTotalBalance()>=withdrawal){
            user.setTotalBalance(user.getTotalBalance()-withdrawal);
        }
    }
    @Override
    public void depositWithInvoice(double deposit) {

        user.setTotalBalance(user.getTotalBalance()+deposit);
        var invoice = new Invoice(user, 0,deposit);
        invoice.getInvoice();
        
    }
    @Override
    public void depositWithoutInvoice(double deposit) {
        user.setTotalBalance(user.getTotalBalance()+deposit);
    }
    
}
