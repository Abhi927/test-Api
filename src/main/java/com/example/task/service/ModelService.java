package com.example.task.service;
import java.util.List;

import com.example.task.DTO.ModelDTO;
import com.example.task.entity.Model;

public interface ModelService {

    Model createModel(ModelDTO dto);

    List<Model> getAllModels();

    Model getModelById(Long id);

    void deleteModel(Long id);
}

