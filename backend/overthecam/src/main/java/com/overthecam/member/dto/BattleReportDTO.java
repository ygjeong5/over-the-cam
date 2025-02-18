package com.overthecam.member.dto;

import lombok.Builder;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
@Builder
public class BattleReportDTO {
    private Long id;
    private String title;
    private LocalDateTime createdAt;
}