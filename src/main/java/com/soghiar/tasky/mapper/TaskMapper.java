package com.soghiar.tasky.mapper;

import com.soghiar.tasky.domain.dto.TaskDto;
import com.soghiar.tasky.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
