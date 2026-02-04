package com.example.task.controller;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.task.DTO.ModelDTO;
import com.example.task.entity.Model;
import com.example.task.service.ModelService;

import java.util.List;

@RestController
@RequestMapping("/api/models")
public class ModelController {
     @Autowired
    private  ModelService service;
    //  Create Model
    @PostMapping
    public ResponseEntity<Model> create(@Valid @RequestBody ModelDTO dto) {

        Model savedModel = service.createModel(dto);

        return ResponseEntity.status(201).body(savedModel);
    }

    //  Get All Models
    @GetMapping
    public ResponseEntity<List<Model>> getAll() {

        return ResponseEntity.ok(service.getAllModels());
    }

    //  Get Model By ID
    @GetMapping("/{id}")
    public ResponseEntity<Model> getById(@PathVariable Long id) {

        return ResponseEntity.ok(service.getModelById(id));
    }

    //  Delete Model
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {

        service.deleteModel(id);

        return ResponseEntity.ok("Model deleted successfully!");
    }
}

