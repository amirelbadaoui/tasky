package com.soghiar.tasky.domain.dto;

import com.soghiar.tasky.domain.entities.TaskPriority;
import com.soghiar.tasky.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {

}
