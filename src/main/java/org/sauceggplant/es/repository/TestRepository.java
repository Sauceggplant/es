package org.sauceggplant.es.repository;

import org.sauceggplant.es.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "test", path = "test")
public interface TestRepository extends JpaRepository<Test, String> {
}
