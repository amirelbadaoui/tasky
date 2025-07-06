package com.soghiar.tasky.services;

import com.soghiar.tasky.domain.dto.TaskListDto;
import com.soghiar.tasky.domain.entities.TaskList;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskListService {
    List<TaskList> listTaskLists();
    TaskList createTaskList(TaskList taskList);
    Optional<TaskList> getTaskList(UUID id);
}
