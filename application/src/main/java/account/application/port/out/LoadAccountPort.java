package account.application.port.out;

import account.domain.Account;
import account.domain.Account.AccountId;

import java.time.LocalDateTime;

public interface LoadAccountPort {

	Account loadAccount(AccountId accountId, LocalDateTime baselineDate);
}
