package com.example.demo.Repo;

import com.example.demo.Entity.employ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "employ", path = "employ")
public interface NewRepo extends JpaRepository<employ,Integer> {
}
