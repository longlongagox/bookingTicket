package ts.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by wr on 2017/6/13.
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name = "seat", schema = "ticketorder", catalog = "")
@XmlRootElement(name = "seat")
public class Seat implements Serializable {
    private Integer id;
    private String seatNum;
    private Integer type;
    private static final long serialVersionUID = -3267943602377867497L;
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator="MODEL_SEAT")
    @org.hibernate.annotations.GenericGenerator(name="MODEL_SEAT", strategy="native")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "seatNum", nullable = true, length = 254)
    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    @Basic
    @Column(name = "type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seat that = (Seat) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (seatNum != null ? !seatNum.equals(that.seatNum) : that.seatNum != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (seatNum != null ? seatNum.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", seatNum='" + seatNum + '\'' +
                ", type=" + type +
                '}';
    }
}
