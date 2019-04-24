package ua.procamp.dao;

import ua.procamp.model.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAll();

    Account findById(long id);

    Account save(Account account);

    void remove(Account account);
}
