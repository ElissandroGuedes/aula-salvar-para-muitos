package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Category;

public class CategoryDTO {

    private long id;
    private String name;


    public CategoryDTO() {
    }

    public CategoryDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDTO(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
