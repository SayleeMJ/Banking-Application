package engineer.saylee.ABCBank.repositary;

import engineer.saylee.ABCBank.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("Select customer from Customer customer where customer.email=:email and customer.password=:password")
    Customer findCustomerByEmailAndPassword(@Param("email") String email, @Param("password") String password);
    @Query("Select customer from Customer customer where customer.email=:email")
    Customer findCustomerByEmail(@Param("email") String email);

}
