package com.sammidev.demo.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
@Entity
public class Batch {

    @Setter(AccessLevel.NONE)
    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startBatch;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date FinishBatch;

    @ManyToOne
    @JoinColumn(name = "id_course", nullable = false)
    private Course course;

    @ManyToMany
    private List<Student> students = new ArrayList<>();

}
