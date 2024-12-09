package com.blueprint.demo.lesson.adapter.out.persistence.repository;

import com.blueprint.demo.lesson.adapter.out.persistence.entity.jpa.LessonJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<LessonJpaEntity, Long> {
}
