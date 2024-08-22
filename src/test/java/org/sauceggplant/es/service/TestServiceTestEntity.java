package org.sauceggplant.es.service;

import org.junit.jupiter.api.Test;
import org.sauceggplant.es.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class TestServiceTestEntity {

    @Autowired
    private TestService testService;

    @Test
    public void getAll() {
        testService.getAll();
    }

    @Test
    public void add() {
        TestEntity testEntity = new TestEntity();
        testEntity.setId("1");
        testEntity.setTitle("猫与老鼠");
        testEntity.setCategory("谜题");
        testEntity.setContent("一只猫一分钟抓一只老鼠，五只猫五分钟抓多少只老鼠？");
        testEntity.setAnswer("25");
        Date now = new Date();
        String user = "jacob";
        testEntity.setCreateTime(now);
        testEntity.setCreateAccount(user);
        testEntity.setUpdateTime(now);
        testEntity.setUpdateAccount(user);
        testEntity.setVersion(1);
        testService.add(testEntity);
    }
}
