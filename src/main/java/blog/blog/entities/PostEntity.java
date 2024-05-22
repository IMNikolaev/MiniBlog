package blog.blog.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "title")
    private String title;
    @Column (name = "anons")
    private String anons;
    @Column (name = "fulltext")
    private String fulltext;
    @Column (name = "views")
    private int views;
}
