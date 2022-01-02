package account.application.port.out;

import account.domain.Account.AccountId;

public interface AccountLock {

	void lockAccount(AccountId accountId);

	void releaseAccount(AccountId accountId);

}
