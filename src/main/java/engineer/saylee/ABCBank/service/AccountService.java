package engineer.saylee.ABCBank.service;

import engineer.saylee.ABCBank.entities.Account;
import engineer.saylee.ABCBank.entities.Customer;
import engineer.saylee.ABCBank.repositary.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
    public Account getAccountByCustomerId(Customer customer) {
        return accountRepository.findAccountByCustomerId(customer);
    }
    public Account getAccountByAccountId(Long accountId) {
        return accountRepository.findAccountByAccountId(accountId);
    }
}