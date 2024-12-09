package com.blueprint.demo.lesson.application.port.in;

import com.blueprint.demo.lesson.application.port.in.request.OpenLessonAppRequest;
import com.blueprint.demo.lesson.application.port.in.response.OpenLessonAppResponse;

public interface OpenLessonPort {
    OpenLessonAppResponse openLesson(OpenLessonAppRequest request);
}
