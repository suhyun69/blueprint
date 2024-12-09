package com.blueprint.demo.lesson.application.port.in.response;

import com.blueprint.demo.lesson.application.domain.Lesson;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor // test
public class OpenLessonAppResponse {
    private Long no;
    private String title;

    public OpenLessonAppResponse(Lesson lesson) {
        this.no = lesson.getNo();
        this.title = lesson.getTitle();
    }
}