import models.Bank;


/**
 * * requeriments:
 * ? 1.-create account bank (checking account, savings account, c2000 account) 
 * :
 *      ? checking account:
 *        * withdrawal
 *        * deposit
 * 
 *      ? savings account:
 *        * withdrawal
 *        * deposit
 *        * interest( 4% )
 * 
 *      ? 2000 account:
 *        * withdrawal
 *        * deposit
 *        * interest( 8% )
 *        ! Penalty for withdrawal of l 2% of the withdrawal
 * 
 *  */ 

public class App {
    public static void main(String[] args) throws Exception {
        Bank sol = new Bank("Banco sol");
        sol.menuBank();

    }
}

