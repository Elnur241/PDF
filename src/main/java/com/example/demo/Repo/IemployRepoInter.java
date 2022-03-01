package com.example.demo.Repo;

import com.example.demo.Entity.employ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IemployRepoInter  extends JpaRepository<employ,Integer> {
    List<employ> findByIdGreaterThan(int id);
    List<employ> findByName(String name);
    @Query("from employ where name=?1 order by name")
    List<employ> findByNameSorted(String name);
}
