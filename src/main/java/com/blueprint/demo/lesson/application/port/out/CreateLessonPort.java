package com.blueprint.demo.lesson.application.port.out;

import com.blueprint.demo.lesson.application.domain.Lesson;
import com.blueprint.demo.lesson.application.port.in.request.OpenLessonAppRequest;

public interface CreateLessonPort {
    Lesson addLesson(OpenLessonAppRequest request);
}
