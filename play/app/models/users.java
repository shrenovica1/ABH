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
import java.util.Base64;
import java.util.UUID;
import  java.lang.Object;
import javax.persistence.EntityManager;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.Constraint;
import  static play.data.Form.*;
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
       // this.city = (City)((HibernateEntityManager) JPA.em()).getSession().createCriteria(City.class).add(Restrictions.eq("id", cityId)).uniqueResult();
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

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) { this.phone = phone; }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() { return email; }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) { this.email = email; }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        //this.salt = base64Encode(Passwords.getNextSalt());
        //this.paswor = base64Encode(Passwords.hash(password.toCharArray(), base64Decode(this.salt)));
        this.passwor=password;
    }

    private String base64Encode(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    private byte[] base64Decode(String string) {
        return Base64.getDecoder().decode(string);
    }

    /**
     * Gets is admin.
     *
     * @return the is admin
     */
    public Boolean getIsAdmin() { return isAdmin; }


    public void setIsAdmin(Boolean admin) { isAdmin = admin; }
}
