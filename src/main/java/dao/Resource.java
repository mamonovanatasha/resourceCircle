package dao;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Наташа on 20.01.2018.
 */
@Entity
@Table(name="RESOURCE", schema = "RESOURCE_CIRCLE")
public class Resource {
    private Long id;
    private String name;
    private Set<Contribution> contributions = new HashSet<Contribution>();

    public Resource() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "NAME", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "resource")
        public Set<Contribution> getContributions() {
        return contributions;
    }

    public void setContributions(Set<Contribution> contributions) {
        this.contributions = contributions;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Resource{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", contributions=").append(contributions);
        sb.append('}');
        return sb.toString();
    }
}
