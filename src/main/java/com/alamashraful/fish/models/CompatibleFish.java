package com.alamashraful.fish.models;

import com.alamashraful.fish.enums.FishCompatibility;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table( name ="compatible_fish" )
public class CompatibleFish {

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "compatible_fish_sequence")
    @SequenceGenerator( name="compatible_fish_sequence", sequenceName = "compatible_fish_sequence" )
    private Long id;

    @Column( name = "compatibility" )
    private FishCompatibility fishCompatibility;

    @ManyToOne( targetEntity = Fish.class )
    private Fish destinationFish;

    @ManyToOne( targetEntity = Fish.class )
    private Fish sourceFish;
}
