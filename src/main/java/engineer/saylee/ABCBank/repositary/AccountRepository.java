package engineer.saylee.ABCBank.repositary;


import engineer.saylee.ABCBank.entities.Account;
import engineer.saylee.ABCBank.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account, Long> {


    @Query("Select account from Account account where account.customer=:customer")
    Account findAccountByCustomerId(@Param("customer") Customer customer);
    @Query("Select account from Account account where account.accountId=:accountId")
    Account findAccountByAccountId(@Param("accountId") Long accountId);
}
