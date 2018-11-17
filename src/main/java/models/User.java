
package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="user")
public class User extends Model implements UserDetails{
    
    @Size(min=5, max=25)
    @NotNull
    @Column(name="username", length=25)
    private String username;
    
    @NotNull
    @Column(name="password", length=64)
    private String password;
    
    @Column(name="name", length=64)
    private String name;
    
    @Column(name="surname", length=64)
    private String surname;
    
    @Column(name="mail", length=64)
    private String mail;
    
    @Column(name="phone", length=8)
    private long phone;
    
    private Set<Order> orders = new HashSet<>();
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="user_role", joinColumns = @JoinColumn(name="user_id", nullable = false, updatable = false), inverseJoinColumns = @JoinColumn(name="role_id", nullable = false, updatable = false))
    private Set<Role> roles = new HashSet<>();
    
    public User() {  
    }
    
    public User(String username, String password){
        super();
        this.username = username;
        this.password = password;
    }

    public User(String username, String name, String surname, String mail, String password, long phone, Set<Order> orders, Long id) {
        super(id);
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.phone = phone;
        this.orders = orders;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Set<Order> getHistory() {
        return orders;
    }

    public void setHistory(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.username);
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.surname);
        hash = 23 * hash + Objects.hashCode(this.mail);
        hash = 23 * hash + Objects.hashCode(this.password);
        hash = 23 * hash + (int) (this.phone ^ (this.phone >>> 32));
        hash = 23 * hash + Objects.hashCode(this.orders);
        hash = 23 * hash + Objects.hashCode(this.roles);
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
        final User other = (User) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.mail, other.mail)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (this.phone != other.phone) {
            return false;
        }
        if (!Objects.equals(this.orders, other.orders)) {
            return false;
        }
        if (!Objects.equals(this.roles, other.roles)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", name=" + name + ", surname=" + surname + ", mail=" + mail + ", password=" + password + ", phone=" + phone + ", orders=" + orders + ", roles=" + roles + '}';
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> result = new ArrayList<>();
        for(Role role : getRoles()) {
            result.add (new SimpleGrantedAuthority(role.getTitle().name()));
        }
       return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
         return false;
    }

    @Override
    public boolean isEnabled() {
         return false;
    }

    
}
