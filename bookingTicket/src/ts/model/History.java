package ts.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by wr on 2017/6/14.
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name = "history", schema = "ticketorder", catalog = "")
@XmlRootElement(name = "history")
public class History {
    private Integer id;
    private Date departureDate;
    private Time delayTime;
    private Integer status;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator="MODEL_history")
    @org.hibernate.annotations.GenericGenerator(name="MODEL_history", strategy="native")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "departureDate", nullable = false)
    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    @Basic
    @Column(name = "delayTime", nullable = false)
    public Time getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Time delayTime) {
        this.delayTime = delayTime;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        History that = (History) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (departureDate != null ? !departureDate.equals(that.departureDate) : that.departureDate != null)
            return false;
        if (delayTime != null ? !delayTime.equals(that.delayTime) : that.delayTime != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (departureDate != null ? departureDate.hashCode() : 0);
        result = 31 * result + (delayTime != null ? delayTime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", departureDate=" + departureDate +
                ", delayTime=" + delayTime +
                ", status=" + status +
                '}';
    }
}
