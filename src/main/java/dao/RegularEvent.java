package dao;


import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;

import javax.persistence.*;

/**
 * Created by Наташа on 20.01.2018.
 */
@Entity
@Table(name="REGULAR_EVENT", schema = "RESOURCE_CIRCLE")
public class RegularEvent {
    private Long id;
    private Contribution contribution;
    private String period;
    private LocalDate finishDate;

    public RegularEvent() {
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRIBUTION_ID", nullable = false)
    public Contribution getContribution() {
        return contribution;
    }

    public void setContribution(Contribution contribution) {
        this.contribution = contribution;
    }

    @Column(name = "PERIOD", nullable = false)
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
    @Column(name = "FINISH_DATE", nullable = false)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegularEvent{");
        sb.append("id=").append(id);
        sb.append(", contributionId=").append(contribution.getId());
        sb.append(", period='").append(period).append('\'');
        sb.append(", finishDate='").append(finishDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
