package models.account;

import models.User;

public class AccountFactory {
    public static Account createAccount(User user, AccountTypes accountType) {
        switch (accountType) {
            case CHECKING:
                return new CheckingAccount(user);
            case SAVINGS:
                return new SavingAccount(user);
            case C2000:
                return new C2000Account(user);
            default:
                throw new IllegalArgumentException("Invalid account type: " + accountType);
        }
    }
}
