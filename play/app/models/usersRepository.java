package models;
import play.db.jpa.JPA;
import play.db.jpa.JPAApi;

import javax.inject.*;
import javax.persistence.*;
import java.util.concurrent.*;

public  class usersRepository{
    public users create(users user){
        JPA.em().persist(user);
        JPA.em().flush();
        return user;
    }

}