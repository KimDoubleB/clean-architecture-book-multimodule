package account.application.port.in;

import account.domain.Account.AccountId;
import account.domain.Money;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(AccountId accountId);

}
