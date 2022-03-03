package com.crud.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "COPIES")
public class Copy {
    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "COPY_ID", unique = true)
    private Long id;

    @NotNull
    @Column(name = "STATUS")
    private String status;

    @ManyToOne
    @JoinColumn(name = "TITLE_ID")
    public Title title;

    @OneToMany(
            targetEntity = Borrow.class,
            mappedBy = "copy",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private List<Borrow> borrows;
}