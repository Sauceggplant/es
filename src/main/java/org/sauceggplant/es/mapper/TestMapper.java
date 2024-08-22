package org.sauceggplant.es.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sauceggplant.es.entity.TestEntity;

import java.util.List;

@Mapper
public interface TestMapper {

    List<TestEntity> getAll();

    int add(TestEntity testEntity);
}
