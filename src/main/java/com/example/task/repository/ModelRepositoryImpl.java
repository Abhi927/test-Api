package com.example.task.repository;
import org.springframework.stereotype.Repository;

import com.example.task.Inmemorydatabase.InMemoryDatabase;
import com.example.task.entity.Model;

import java.util.*;

@Repository
public class ModelRepositoryImpl implements ModelRepository {

    @Override
    public Model save(Model model) {

        // Auto ID Generate
        model.setId(InMemoryDatabase.currentId++);

        // Store in Map
        InMemoryDatabase.modelTable.put(model.getId(), model);

        return model;
    }

    @Override
    public List<Model> findAll() {
        return new ArrayList<>(InMemoryDatabase.modelTable.values());
    }

    @Override
    public Optional<Model> findById(Long id) {
        return Optional.ofNullable(InMemoryDatabase.modelTable.get(id));
    }

    @Override
    public void deleteById(Long id) {
        InMemoryDatabase.modelTable.remove(id);
    }
}
