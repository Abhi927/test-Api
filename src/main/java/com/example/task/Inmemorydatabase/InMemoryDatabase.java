package com.example.task.Inmemorydatabase;
import java.util.HashMap;
import java.util.Map;

import com.example.task.entity.Model;

public class InMemoryDatabase {

    // Static Map (Database)
    public static final Map<Long, Model> modelTable = new HashMap<>();

    // Static ID Generator
    public static Long currentId = 1L;

    // Static Block → Preload Data
    static {
        modelTable.put(currentId, new Model(currentId++, "Laptop", "Gaming Laptop", 60000, "Electronics"));
        modelTable.put(currentId, new Model(currentId++, "Mobile", "Smartphone Device", 20000, "Electronics"));
        modelTable.put(currentId, new Model(currentId++, "Book", "Java Programming Book", 500, "Education"));
    }
}

