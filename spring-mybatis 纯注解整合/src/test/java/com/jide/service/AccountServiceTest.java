package com.jide.service;

import com.jide.config.SpringConfig;
import com.jide.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 晓蝈
 * @version 1.0
 */
//使Junit以Spring的形式运行，使得可以自动创建Spring容器
@RunWith(SpringJUnit4ClassRunner.class)
//加载配置文件或者配置类
@ContextConfiguration(classes = {SpringConfig.class})
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void testFindAll() {
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }
}
