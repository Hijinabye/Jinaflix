package com.project.Jinaflix.Repository;

import com.project.Jinaflix.Entity.Fanfiction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FanFictionRepository extends JpaRepository<Fanfiction, Long> {
}