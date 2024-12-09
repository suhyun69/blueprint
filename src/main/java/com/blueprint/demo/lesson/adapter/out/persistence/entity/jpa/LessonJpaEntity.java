package com.blueprint.demo.lesson.adapter.out.persistence.entity.jpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lesson")
@Data
@Builder // mapToJpaEntity
@NoArgsConstructor
@AllArgsConstructor
public class LessonJpaEntity {

    @Id
    @Column(name = "LESSON_NO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long no;
    private String title;
}
