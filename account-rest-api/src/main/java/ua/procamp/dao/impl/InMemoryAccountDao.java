package ua.procamp.dao.impl;

import org.springframework.stereotype.Component;
import ua.procamp.dao.AccountDao;
import ua.procamp.exception.EntityNotFountException;
import ua.procamp.model.Account;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * {@link AccountDao} implementation that is based on {@link java.util.HashMap}.
 * <p>
 * todo: 1. Configure a component with name "accountDao"
 */
@Component("accountDao")
public class InMemoryAccountDao implements AccountDao {
    private Map<Long, Account> accountMap = new HashMap<>();
    private long idCount;
    @Override
    public List<Account> findAll() {
        return new ArrayList<>(accountMap.values());
    }

    @Override
    public Account findById(long id) {
        return accountMap.get(id);
    }

    @Override
    public Account save(Account account) {
        Long id;
        if(isValideNewId(account.getId())){
            id = account.getId();
        }else{
            id = generateNewId();
            account.setId(id);
        }
        accountMap.put(id, account);
        return account;
    }

    private boolean isValideNewId(Long id){
        return id != null && !accountMap.containsKey(id);
    }

    private Long generateNewId(){
        return ++idCount;
    }

    @Override
    public void remove(Account account) {
        accountMap.remove(account.getId());
    }

    public void clear() {
        accountMap.clear();
    }
}
