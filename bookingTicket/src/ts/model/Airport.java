package ts.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by wr on 2017/6/14.
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name = "airport", schema = "ticketorder", catalog = "")
@XmlRootElement(name = "airport")
public class Airport implements Serializable{
    private Integer id;
    private String name;
    private static final long serialVersionUID = -3267943602377867497L;
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator="MODEL_airport")
    @org.hibernate.annotations.GenericGenerator(name="MODEL_airport", strategy="native")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 254)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport that = (Airport) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
