package com.example.task.repository;
import java.util.List;
import java.util.Optional;

import com.example.task.entity.Model;

public interface ModelRepository {

    Model save(Model model);

    List<Model> findAll();

    Optional<Model> findById(Long id);

    void deleteById(Long id);
}

