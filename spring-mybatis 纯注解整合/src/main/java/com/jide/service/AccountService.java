package com.jide.service;

import com.jide.domain.Account;

import java.util.List;

/**
 * @author 晓蝈
 * @version 1.0
 */

public interface AccountService {
    void save(Account account);

    void update(Account account);

    void delete(Integer id);

    Account findById(Integer id);

    List<Account> findAll();
}
