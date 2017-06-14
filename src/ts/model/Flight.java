package ts.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by wr on 2017/6/13.
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name = "flight", schema = "ticketorder", catalog = "")
@XmlRootElement(name = "flight")
public class Flight implements Serializable {
    private Integer id;
    private Timestamp startTime;
    private Timestamp arriveTime;
    private Double businessPrice;
    private Double economyPrice;
    private static final long serialVersionUID = -3267943602377867497L;
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator="MODEL_FLIGHT")
    @org.hibernate.annotations.GenericGenerator(name="MODEL_FLIGHT", strategy="native")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "startTime", nullable = true)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "arriveTime", nullable = true)
    public Timestamp getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Timestamp arriveTime) {
        this.arriveTime = arriveTime;
    }

    @Basic
    @Column(name = "businessPrice", nullable = true, precision = 0)
    public Double getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(Double businessPrice) {
        this.businessPrice = businessPrice;
    }

    @Basic
    @Column(name = "economyPrice", nullable = true, precision = 0)
    public Double getEconomyPrice() {
        return economyPrice;
    }

    public void setEconomyPrice(Double economyPrice) {
        this.economyPrice = economyPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight that = (Flight) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (arriveTime != null ? !arriveTime.equals(that.arriveTime) : that.arriveTime != null) return false;
        if (businessPrice != null ? !businessPrice.equals(that.businessPrice) : that.businessPrice != null)
            return false;
        if (economyPrice != null ? !economyPrice.equals(that.economyPrice) : that.economyPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (arriveTime != null ? arriveTime.hashCode() : 0);
        result = 31 * result + (businessPrice != null ? businessPrice.hashCode() : 0);
        result = 31 * result + (economyPrice != null ? economyPrice.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", arriveTime=" + arriveTime +
                ", businessPrice=" + businessPrice +
                ", economyPrice=" + economyPrice +
                '}';
    }
}
