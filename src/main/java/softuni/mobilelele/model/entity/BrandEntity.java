package softuni.mobilelele.model.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "brands")
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(nullable = false)
    private Instant created;

    private Instant modified;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Instant getCreated() {
        return created;
    }

    public Instant getModified() {
        return modified;
    }

}
