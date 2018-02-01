package dao;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Наташа on 20.01.2018.
 */
@Entity
@Table(name="CONTRIBUTION", schema = "RESOURCE_CIRCLE")
public class Contribution {
    private Long id;
    private String name;
    private Resource resource;
    private Long factor;
    private Set<Event> events = new HashSet<Event>();
    private Set<RegularEvent> regularEvents = new HashSet<RegularEvent>();

    public Contribution() {
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

    @Column(name = "FACTOR", nullable = false)
    public Long getFactor() {
        return factor;
    }

    public void setFactor(Long factor) {
        this.factor = factor;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contribution")
    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contribution")
    public Set<RegularEvent> getRegularEvents() {
        return regularEvents;
    }

    public void setRegularEvents(Set<RegularEvent> regularEvents) {
        this.regularEvents = regularEvents;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESOURCE_ID", nullable = false)
    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contribution{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", factor=").append(factor);
        sb.append(", events=").append(events);
        sb.append(", regularEvents=").append(regularEvents);
        sb.append('}');
        return sb.toString();
    }
}
