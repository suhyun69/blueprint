package com.blueprint.demo.lesson.adapter.out.persistence.mapper;

import com.blueprint.demo.lesson.adapter.out.persistence.entity.jpa.LessonJpaEntity;
import com.blueprint.demo.lesson.application.domain.Lesson;
import com.blueprint.demo.lesson.application.port.in.request.OpenLessonAppRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LessonMapper {

    public LessonJpaEntity mapToJpaEntity(OpenLessonAppRequest req) {
        return LessonJpaEntity.builder()
                .title(req.getTitle())
                .build();
    }

    public Lesson mapToDomainEntity(LessonJpaEntity lessonT) {
        return Lesson.builder()
                .no(lessonT.getNo())
                .title(lessonT.getTitle())
                .build();
    }
}
