import dao.InMemoryTaskDAO;
import dao.TaskDAO;
import services.TaskManagementService;
import services.TaskReportService;

public class Main {
    public static void main(String[] args) {
//        TaskManager taskManager = new TaskManager();
//        taskManager.addTask("Tache 1", "Description de la tache 1");
//        taskManager.addTask("Tache 2", "Description de la tache 2");
//        taskManager.addTask("Tache 3", "Description de la tache 3");
//
//        taskManager.markTaskAsComplete(1);
//
//        taskManager.printCompletedTasks();
//        taskManager.printPendingTasks();

        TaskDAO taskDAO = new InMemoryTaskDAO();
        TaskManagementService taskManagementService = new TaskManagementService(taskDAO);
        taskManagementService.addTask("Tache 1", "Description de la tache 1");
        taskManagementService.addTask("Tache 2", "Description de la tache 2");
        taskManagementService.addTask("Tache 3", "Description de la tache 3");

        taskManagementService.markTaskAsComplete(1);

        TaskReportService taskReportService = new TaskReportService(taskDAO);
        taskReportService.printCompletedTasks();
        taskReportService.printPendingTasks();
    }
}
