package com.blueprint.demo.lesson.adapter.in.web;

import com.blueprint.demo.lesson.adapter.in.web.request.OpenLessonWebRequest;
import com.blueprint.demo.lesson.adapter.in.web.response.OpenLessonWebResponse;
import com.blueprint.demo.lesson.application.port.in.OpenLessonPort;
import com.blueprint.demo.lesson.application.port.in.request.OpenLessonAppRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/lesson")
@Tag(name = "Lesson", description = "Lesson API Document")
public class LessonController {

    private final OpenLessonPort openLessonPort;

    @PostMapping("/")
    @Operation(summary = "수업 등록", description = "수업을 등록합니다")
    ResponseEntity<OpenLessonWebResponse> openLesson(@RequestBody @Valid OpenLessonWebRequest request) {

        OpenLessonAppRequest appReq = new OpenLessonAppRequest(request);
        OpenLessonWebResponse response = new OpenLessonWebResponse(openLessonPort.openLesson(appReq));

        return ResponseEntity.ok(response);
    }
}
