package services;

import dao.TaskDAO;
import models.Task;
import java.util.List;

public class TaskReportService {
    private final TaskDAO taskDAO;

    public TaskReportService(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    public void printCompletedTasks() {
        System.out.println("Taches terminees :");
        List<Task> tasks = taskDAO.findAll();
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    public void printPendingTasks() {
        System.out.println("Taches non terminees :");
        List<Task> tasks = taskDAO.findAll();
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}
