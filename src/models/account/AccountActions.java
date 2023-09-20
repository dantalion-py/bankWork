package models.account;

public interface AccountActions {
    public abstract void withdrawalWithInvoice(double withdrawal);
    public abstract void withdrawalWithoutInvoice(double withdrawal);
    public abstract void depositWithInvoice(double deposit);
    public abstract void depositWithoutInvoice(double deposit);
    
}
