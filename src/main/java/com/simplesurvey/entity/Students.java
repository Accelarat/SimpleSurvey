package com.simplesurvey.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Students {

    @Id
    private Long id;
    private String name;
}
