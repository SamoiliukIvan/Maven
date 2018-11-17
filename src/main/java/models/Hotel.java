
package models;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="hotel")
public class Hotel extends Model {
    
    @Column(name="nameRU", length=255)
    private String nameRU;
    
    @Column(name="nameEN", length=255)
    private String nameEN;
    
    @ManyToOne
    @Column(name="region", length=255)
    private Region region;
    
    @Column(name="shortDescriptionRU", length=255)
    private String shortDescriptionRU;
    
    @Column(name="shortDescriptionEN", length=255)
    private String shortDescriptionEN;
    
    @Column(name="fullDescriptionRU", length=1024)
    private String fullDescriptionRU;
    
    @Column(name="fullDescriptionEN", length=1024)
    private String fullDescriptionEN;
   
    @Column(name="stars")
    private int stars;

    public Hotel() {
    }

    public Hotel(String nameRU, String nameEN, Region region, String shortDescriptionRU, String shortDescriptionEN, String fullDescriptionRU, String fullDescriptionEN, int stars, Long id) {
        super(id);
        this.nameRU = nameRU;
        this.nameEN = nameEN;
        this.region = region;
        this.shortDescriptionRU = shortDescriptionRU;
        this.shortDescriptionEN = shortDescriptionEN;
        this.fullDescriptionRU = fullDescriptionRU;
        this.fullDescriptionEN = fullDescriptionEN;
        this.stars = stars;
    }

    public String getNameRU() {
        return nameRU;
    }

    public void setNameRU(String nameRU) {
        this.nameRU = nameRU;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    public Region getIdRegion() {
        return region;
    }

    public void setIdRegion(Region region) {
        this.region = region;
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

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nameRU);
        hash = 79 * hash + Objects.hashCode(this.nameEN);
        hash = 79 * hash + Objects.hashCode(this.region);
        hash = 79 * hash + Objects.hashCode(this.shortDescriptionRU);
        hash = 79 * hash + Objects.hashCode(this.shortDescriptionEN);
        hash = 79 * hash + Objects.hashCode(this.fullDescriptionRU);
        hash = 79 * hash + Objects.hashCode(this.fullDescriptionEN);
        hash = 79 * hash + this.stars;
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
        final Hotel other = (Hotel) obj;
        if (!Objects.equals(this.nameRU, other.nameRU)) {
            return false;
        }
        if (!Objects.equals(this.nameEN, other.nameEN)) {
            return false;
        }
        if (!Objects.equals(this.region, other.region)) {
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
        if (this.stars != other.stars) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hotel{" + "nameRU=" + nameRU + ", nameEN=" + nameEN + ", idRegion=" + region + ", shortDescriptionRU=" + shortDescriptionRU + ", shortDescriptionEN=" + shortDescriptionEN + ", fullDescriptionRU=" + fullDescriptionRU + ", fullDescriptionEN=" + fullDescriptionEN + ", stars=" + stars + '}';
    }

   
}
