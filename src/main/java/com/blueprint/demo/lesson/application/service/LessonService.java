package com.blueprint.demo.lesson.application.service;

import com.blueprint.demo.lesson.application.domain.Lesson;
import com.blueprint.demo.lesson.application.port.in.OpenLessonPort;
import com.blueprint.demo.lesson.application.port.in.request.OpenLessonAppRequest;
import com.blueprint.demo.lesson.application.port.in.response.OpenLessonAppResponse;
import com.blueprint.demo.lesson.application.port.out.CreateLessonPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class LessonService implements
        OpenLessonPort
{

    private final CreateLessonPort createLessonPort;

    @Override
    public OpenLessonAppResponse openLesson(OpenLessonAppRequest appReq) {

        Lesson lesson = createLessonPort.addLesson(appReq);
        return new OpenLessonAppResponse(lesson);
    }
}
