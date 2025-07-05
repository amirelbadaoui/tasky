package com.soghiar.tasky.mapper;

import com.soghiar.tasky.domain.dto.TaskListDto;
import com.soghiar.tasky.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
