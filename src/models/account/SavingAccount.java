package models.account;

import models.Invoice;
import models.User;

public class SavingAccount extends Account{
    private double interes = 0.04;
    private double totalmoney;
    public SavingAccount(User user){
        super(user);
        this.totalmoney = (user.getTotalBalance()*interes)+user.getTotalBalance();
    }
    @Override
    public void withdrawalWithInvoice(double withdrawal) {
        if(totalmoney>=withdrawal){
            user.setTotalBalance(totalmoney-withdrawal);
            var invoice = new Invoice(user, withdrawal,0);
            invoice.getInvoice();
        }
    }
    @Override
    public void withdrawalWithoutInvoice(double withdrawal) {
        if(totalmoney>=withdrawal){
            user.setTotalBalance(totalmoney-withdrawal);
        }
    }
    @Override
    public void depositWithInvoice(double deposit) {

        user.setTotalBalance(totalmoney+deposit);
        var invoice = new Invoice(user, 0,deposit);
        invoice.getInvoice();
        
    }
    @Override
    public void depositWithoutInvoice(double deposit) {
        user.setTotalBalance(totalmoney+deposit);
    }
    
}
