package com.example.task.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task.DTO.ModelDTO;
import com.example.task.entity.Model;
import com.example.task.exception.ResourceNotFoundException;
import com.example.task.repository.ModelRepository;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService {
   @Autowired
    private ModelRepository repository;

    @Override
    public Model createModel(ModelDTO dto) {

        Model model = new Model();
        model.setName(dto.getName());
        model.setDescription(dto.getDescription());
        model.setPrice(dto.getPrice());
        model.setCategory(dto.getCategory());

        return repository.save(model);
    }

    @Override
    public List<Model> getAllModels() {
        return repository.findAll();
    }

    @Override
    public Model getModelById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Model not found with id: " + id)
                );
    }

    @Override
    public void deleteModel(Long id) {

        if (repository.findById(id).isEmpty()) {
            throw new ResourceNotFoundException("Cannot delete. Model not found with id: " + id);
        }

        repository.deleteById(id);
    }
}
