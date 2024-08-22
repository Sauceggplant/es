package org.sauceggplant.es.service;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import org.sauceggplant.es.entity.TestEntity;
import org.sauceggplant.es.mapper.TestMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private static final Logger logger = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private TestMapper testMapper;

    public List<TestEntity> getAll() {
        List<TestEntity> testEntityList = testMapper.getAll();
        logger.info(JSONArray.toJSONString(testEntityList));
        return testEntityList;
    }

    public int add(TestEntity testEntity) {
        logger.info(JSONObject.toJSONString(testEntity));
        int result = testMapper.add(testEntity);
        logger.info("{}",result);
        return result;
    }
}
