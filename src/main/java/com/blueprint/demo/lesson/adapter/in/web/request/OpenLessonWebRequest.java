package com.blueprint.demo.lesson.adapter.in.web.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor // 파라미터 딱 하나 있을 때 필요
public class OpenLessonWebRequest {
    @NotNull(message = "title cannot be null")
    private String title;
}