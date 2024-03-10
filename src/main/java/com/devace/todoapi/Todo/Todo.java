package com.devace.todoapi.Todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    private String todo;

    @NotBlank
    @Pattern(regexp = "^(PENDING|COMPLETED|DELETED)$", message = "Status must be one of: PENDING, COMPLETED, DELETED")
    private String status;
}
