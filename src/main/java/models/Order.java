
package models;

import java.util.GregorianCalendar;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="order")
public class Order extends Model {
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User user;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tour_id", referencedColumnName = "id")
    private Tour tour;
    
    @Column(name="from")
    private GregorianCalendar from;
    
    @Column(name="countOfDays")
    private int countOfdays;
    
    @Column(name="date")
    private GregorianCalendar gregorianCalendar; // дата заявки

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

    public void setGregorianCalendar(GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }

    public Order() {
    }

    public Order(User user, String codeOfOrder, Tour tour, GregorianCalendar from, int countOfdays, Long idUser, GregorianCalendar gregorianCalendar, Long id) {
        super(id);
        this.user = user;
        this.tour = tour;
        this.from = from;
        this.countOfdays = countOfdays;
        this.user = user;
        this.gregorianCalendar = gregorianCalendar;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tour getIdTour() {
        return tour;
    }

    public void setIdTour(Long idTour) {
        this.tour = tour;
    }

    public GregorianCalendar getFrom() {
        return from;
    }

    public void setFrom(GregorianCalendar from) {
        this.from = from;
    }

    public int getCountOfdays() {
        return countOfdays;
    }

    public void setCountOfdays(int countOfdays) {
        this.countOfdays = countOfdays;
    }

    public User getIdUser() {
        return user;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.user);
        hash = 47 * hash + Objects.hashCode(this.tour);
        hash = 47 * hash + Objects.hashCode(this.from);
        hash = 47 * hash + this.countOfdays;
        hash = 47 * hash + Objects.hashCode(this.user);
        hash = 47 * hash + Objects.hashCode(this.gregorianCalendar);
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
        final Order other = (Order) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        
        if (!Objects.equals(this.tour, other.tour)) {
            return false;
        }
        if (!Objects.equals(this.from, other.from)) {
            return false;
        }
        if (this.countOfdays != other.countOfdays) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.gregorianCalendar, other.gregorianCalendar)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Order{" + "user=" + user + ", codeOfOrder=" + ", idTour=" + tour + ", from=" + from + ", countOfdays=" + countOfdays + ", idUser=" + user + ", gregorianCalendar=" + gregorianCalendar + '}';
    }    
}
