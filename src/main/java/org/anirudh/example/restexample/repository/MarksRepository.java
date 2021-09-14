package org.anirudh.example.restexample.repository;

import org.anirudh.example.restexample.model.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksRepository extends JpaRepository<Marks, String> {
}
