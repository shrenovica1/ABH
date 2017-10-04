package controllers;
import play.data.Form;
import play.mvc.*;
import play.db.jpa.Transactional;
import views.html.*;
import  javax.inject.Inject;
import javax.inject.Singleton;
import play.db.jpa.JPA;
import models.usersService;
import models.users;
import play.libs.Json;
import play.data.FormFactory;

import javax.validation.Validator;


public class UsersController extends Controller {


    private FormFactory formFactory;

    @Inject
    public void setFormFactory(FormFactory formFactory) {
        this.formFactory = formFactory;
    }
    private usersService UsersService;

    @Inject
    public void setUsersService(usersService usersService) {
        this.UsersService = usersService;
    }

    @Transactional
    public Result create() {
        Form<users> userForm = formFactory.form(users.class);
      users User = userForm.bindFromRequest().get();
       if (userForm.hasErrors()) {
            return badRequest("form has errors");
        }

        return ok(Json.toJson(UsersService.create(userForm.get())));

    // return ok();
    }
}