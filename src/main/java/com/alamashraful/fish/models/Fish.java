package com.alamashraful.fish.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table( name ="fish" )
public class Fish {

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "fish_sequence")
    @SequenceGenerator( name="fish_sequence", sequenceName = "fish_sequence" )
    private Long id;

    @Column( name = "name" )
    private String name;
}
