package com.example.demo.model;

import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Table(name="Books")
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;

    private String author;
    
}