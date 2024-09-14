package com.maverickstube.maverickshub.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Setter
@Getter
@Entity
@ToString
@Table(name = "bookMarks")
public class BookMark {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @OneToMany
    private List<Media> mediaList = new ArrayList<>();
    private Long userId;

}
