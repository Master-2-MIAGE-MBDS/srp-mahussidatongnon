package dao;

import models.Task;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskDAO implements TaskDAO {
    private final List<Task> tasks;

    public InMemoryTaskDAO() {
        tasks = new ArrayList<>();
    }

    @Override
    public void save(Task task) {
        tasks.add(task);
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(tasks);
    }

    @Override
    public void updateStatut(int id, boolean statut) {
        if (id >= 0 && id < tasks.size()) {
            tasks.get(id).setCompleted(statut);
        }
    }
}
