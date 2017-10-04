package models;
import play.data.Form;
import play.data.FormFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.jpa.HibernateEntityManager;
import play.db.jpa.JPA;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;
import  java.lang.Object;
import javax.persistence.EntityManager;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.Constraint;
import  static.play.data.Form.*;
import play.db.jpa.JPAApi;


@Entity
@Table(name="\"users\"")
public class users {

   // EntityManagerFactory emfdb = Persistence.createEntityManagerFactory("defaultPersistenceUnit");

    //Form<users> USERS_FORM = formFactory.form(users.class);
    //public static final Form<users>USERS_FORM = FormFactory.form(users.class);
    @Id
    @GeneratedValue
    @Column(name = "id")
    private  UUID id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "address")
    private String address;


    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "passwor")
    private String passwor;

    @Column(name = "is_admin")
    private Boolean isAdmin;

    public users() { }


    public users(String firstName, String lastName, String email, String password) {
        this.firstname = firstName;
        this.lastname=lastName;
        this.email = email;
        this.setPassword(password);
           }


    public UUID getId() { return id; }

    public void setId(UUID id) { this.id = id; }


    public String getFirstname() { return firstname; }


    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }


    public void setLastname(String lastname) { this.lastname = lastname; }



    public String getAddress() { return address; }


    public void setAddress(String address) { this.address = address; }


    public String getPhone() { return phone; }

        public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }

    
    public void setEmail(String email) { this.email = email; }

    public void setPassword(String password) {

                this.passwor=password;
    }

   
    public Boolean getIsAdmin() { return isAdmin; }


    public void setIsAdmin(Boolean admin) { isAdmin = admin; }
}
