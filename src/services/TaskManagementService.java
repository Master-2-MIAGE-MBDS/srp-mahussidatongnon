package services;
import dao.TaskDAO;
import models.Task;

import java.util.List;

public class TaskManagementService {
    private final TaskDAO taskDAO;

    public TaskManagementService(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    public void addTask(String title, String description) {
        taskDAO.save(new Task(title, description));
    }

    public void markTaskAsComplete(int taskId) {
        taskDAO.updateStatut(taskId, true);
    }
}
