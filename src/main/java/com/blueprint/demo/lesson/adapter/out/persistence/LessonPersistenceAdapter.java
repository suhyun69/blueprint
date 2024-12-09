package com.blueprint.demo.lesson.adapter.out.persistence;

import com.blueprint.demo.lesson.adapter.out.persistence.entity.jpa.LessonJpaEntity;
import com.blueprint.demo.lesson.adapter.out.persistence.mapper.LessonMapper;
import com.blueprint.demo.lesson.adapter.out.persistence.repository.LessonRepository;
import com.blueprint.demo.lesson.application.domain.Lesson;
import com.blueprint.demo.lesson.application.port.in.request.OpenLessonAppRequest;
import com.blueprint.demo.lesson.application.port.out.CreateLessonPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LessonPersistenceAdapter implements
        CreateLessonPort
{

    private final LessonRepository lessonRepository;
    private final LessonMapper lessonMapper;

    @Override
    public Lesson addLesson(OpenLessonAppRequest req) {

        LessonJpaEntity lessonT = lessonRepository.save(lessonMapper.mapToJpaEntity(req));

        return lessonMapper.mapToDomainEntity(lessonT);
    }
}
