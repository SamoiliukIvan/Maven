
package models;

import java.util.GregorianCalendar;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="tour")
public class Tour extends Model{
    
    @Column(name="name", length=255)
    private String name;
    
    @Column(name="shortDescriptionRU", length=255)
    private String shortDescriptionRU;
    
    @Column(name="shortDescriptionEN", length=255)
    private String shortDescriptionEN;
    
    @Column(name="fullDescriptionRU", length=1024)
    private String fullDescriptionRU;
    
    @Column(name="fullDescriptionEN", length=1024)
    private String fullDescriptionEN;
    
    @Column(name="dateOfStart")
    private GregorianCalendar dateOfStart;
    
    @Column(name="dateOfEnd")
    private GregorianCalendar dateOfEnd;
    
    @Column(name="hotel")
    private Hotel hotel; // спросить у Андрея

    public Tour() {
    }

    public Tour(String name, String shortDescriptionRU, String shortDescriptionEN, String fullDescriptionRU, String fullDescriptionEN, GregorianCalendar dateOfStart, GregorianCalendar dateOfEnd, Hotel hotel) {
        super();
        this.name = name;
        this.shortDescriptionRU = shortDescriptionRU;
        this.shortDescriptionEN = shortDescriptionEN;
        this.fullDescriptionRU = fullDescriptionRU;
        this.fullDescriptionEN = fullDescriptionEN;
        this.dateOfStart = dateOfStart;
        this.dateOfEnd = dateOfEnd;
        this.hotel = hotel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescriptionRU() {
        return shortDescriptionRU;
    }

    public void setShortDescriptionRU(String shortDescriptionRU) {
        this.shortDescriptionRU = shortDescriptionRU;
    }

    public String getShortDescriptionEN() {
        return shortDescriptionEN;
    }

    public void setShortDescriptionEN(String shortDescriptionEN) {
        this.shortDescriptionEN = shortDescriptionEN;
    }

    public String getFullDescriptionRU() {
        return fullDescriptionRU;
    }

    public void setFullDescriptionRU(String fullDescriptionRU) {
        this.fullDescriptionRU = fullDescriptionRU;
    }

    public String getFullDescriptionEN() {
        return fullDescriptionEN;
    }

    public void setFullDescriptionEN(String fullDescriptionEN) {
        this.fullDescriptionEN = fullDescriptionEN;
    }

    public GregorianCalendar getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(GregorianCalendar dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public GregorianCalendar getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(GregorianCalendar dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public Hotel getIdRegion() {
        return hotel;
    }

    public void setIdRegion(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.shortDescriptionRU);
        hash = 89 * hash + Objects.hashCode(this.shortDescriptionEN);
        hash = 89 * hash + Objects.hashCode(this.fullDescriptionRU);
        hash = 89 * hash + Objects.hashCode(this.fullDescriptionEN);
        hash = 89 * hash + Objects.hashCode(this.dateOfStart);
        hash = 89 * hash + Objects.hashCode(this.dateOfEnd);
        hash = 89 * hash + Objects.hashCode(this.hotel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tour other = (Tour) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.shortDescriptionRU, other.shortDescriptionRU)) {
            return false;
        }
        if (!Objects.equals(this.shortDescriptionEN, other.shortDescriptionEN)) {
            return false;
        }
        if (!Objects.equals(this.fullDescriptionRU, other.fullDescriptionRU)) {
            return false;
        }
        if (!Objects.equals(this.fullDescriptionEN, other.fullDescriptionEN)) {
            return false;
        }
        if (!Objects.equals(this.dateOfStart, other.dateOfStart)) {
            return false;
        }
        if (!Objects.equals(this.dateOfEnd, other.dateOfEnd)) {
            return false;
        }
        if (!Objects.equals(this.hotel, other.hotel)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tour{" + "name=" + name + ", shortDescriptionRU=" + shortDescriptionRU + ", shortDescriptionEN=" + shortDescriptionEN + ", fullDescriptionRU=" + fullDescriptionRU + ", fullDescriptionEN=" + fullDescriptionEN + ", dateOfStart=" + dateOfStart + ", dateOfEnd=" + dateOfEnd + ", idRegion=" + hotel + '}';
    }

   
}
