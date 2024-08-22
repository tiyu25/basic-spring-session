package org.sparta.basicspringsession.dto;

import lombok.Getter;

@Getter
public class MemberDetailResponseDto {
    private Long id;
    private String name;

    public MemberDetailResponseDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
