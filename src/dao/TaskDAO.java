package dao;

import models.Task;

import java.util.List;

public interface TaskDAO {
    void save(Task task);
    List<Task> findAll();
    void updateStatut(int id, boolean statut);
}


