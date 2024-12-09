package com.blueprint.demo.lesson.application.domain;

import lombok.Builder;
import lombok.Value;

@Value // 객체 불변(Immutable) => @Setter 생성되지 않음
@Builder // mapToDomainEntity
public class Lesson {
    Long no;
    String title;
}
