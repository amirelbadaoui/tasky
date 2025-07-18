package com.soghiar.tasky.repositories;

import com.soghiar.tasky.domain.entities.Task;
import com.soghiar.tasky.domain.entities.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {
    List<Task> findByTaskListId(UUID taskListId);

    Optional<Task> findByTaskListIdAndId(UUID taskListId, UUID id);
}
