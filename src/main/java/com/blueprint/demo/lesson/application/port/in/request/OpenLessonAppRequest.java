package com.blueprint.demo.lesson.application.port.in.request;

import com.blueprint.demo.common.SelfValidating;
import com.blueprint.demo.lesson.adapter.in.web.request.OpenLessonWebRequest;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class OpenLessonAppRequest extends SelfValidating<OpenLessonAppRequest> {

    @NotNull(message = "title cannot be null.")
    private String title;

    public OpenLessonAppRequest(OpenLessonWebRequest request) {
        this.title = request.getTitle();
        this.validateSelf();
    }
}
