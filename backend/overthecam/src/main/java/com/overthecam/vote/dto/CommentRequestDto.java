package com.overthecam.vote.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentRequestDto {
    @NotBlank(message = "댓글 내용을 입력해주세요")
    private String content;
}