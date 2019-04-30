package ua.procamp.dao;

import org.springframework.stereotype.Component;
import ua.procamp.model.Account;

import java.util.List;
@Component("accountDao")
public interface AccountDao {
    List<Account> findAll();

    Account findById(long id);

    Account save(Account account);

    void remove(Account account);
}
