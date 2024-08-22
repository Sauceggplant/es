package org.sauceggplant.es.repository;

import org.sauceggplant.es.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "t_test", path = "t_test")
public interface TestRepository extends JpaRepository<TestEntity, String> {
}
