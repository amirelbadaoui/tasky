package com.soghiar.tasky.services.impl;


import com.soghiar.tasky.domain.entities.TaskList;
import com.soghiar.tasky.repositories.TaskListRepository;
import com.soghiar.tasky.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

    private TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
