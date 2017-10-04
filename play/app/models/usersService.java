package models;
import  javax.inject.Inject;
import javax.inject.Singleton;
import  models.users;
import  models.usersRepository;
@Singleton
public  class usersService{


    private usersRepository usersRepository;

    @Inject
    public usersRepository getUsersRepository() {
        return usersRepository;
    }

 public users create(users user){
        return usersRepository.create(user);
 }

}