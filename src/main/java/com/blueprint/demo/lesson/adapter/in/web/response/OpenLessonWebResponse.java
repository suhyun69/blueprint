package com.blueprint.demo.lesson.adapter.in.web.response;

import com.blueprint.demo.lesson.application.port.in.response.OpenLessonAppResponse;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class OpenLessonWebResponse {
    private Long no;
    private String title;

    public OpenLessonWebResponse(OpenLessonAppResponse res) {
        this.no = res.getNo();
        this.title = res.getTitle();
    }
}