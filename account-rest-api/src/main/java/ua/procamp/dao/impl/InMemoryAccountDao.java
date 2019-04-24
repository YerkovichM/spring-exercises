package ua.procamp.dao.impl;

import ua.procamp.dao.AccountDao;
import ua.procamp.exception.EntityNotFountException;
import ua.procamp.model.Account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * {@link AccountDao} implementation that is based on {@link java.util.HashMap}.
 * <p>
 * todo: 1. Configure a component with name "accountDao"
 */
public class InMemoryAccountDao implements AccountDao {
    private Map<Long, Account> accountMap = new HashMap<>();

    @Override
    public List<Account> findAll() {
        throw new UnsupportedOperationException("Keep calm and implement the method");
    }

    @Override
    public Account findById(long id) {
        throw new UnsupportedOperationException("Keep calm and implement the method");
    }

    @Override
    public Account save(Account account) {
        throw new UnsupportedOperationException("Keep calm and implement the method");
    }

    @Override
    public void remove(Account account) {
        throw new UnsupportedOperationException("Keep calm and implement the method");
    }

    public void clear() {
        accountMap.clear();
    }
}
