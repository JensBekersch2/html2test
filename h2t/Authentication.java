package h2t;

import database.Database;
import exceptions.AuthenticationException;
import models.AuthenticationDetails;
import models.LoginCredentials;
import models.UserAuth;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/authentication")
public class Authentication {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public AuthenticationDetails userLogin(LoginCredentials loginCredentials) {

        AuthenticationDetails returnValue = new AuthenticationDetails();

        String userName = loginCredentials.getUserName();


        Database database = new Database();
        UserAuth user = database.getUserAuth(userName);

        if(loginCredentials.getUserPassword().equals(user.getPassword())) {
            returnValue.setId(Integer.toString(user.getId()));
            returnValue.setToken("asd907nklk86kjb897");
        } else {
            throw new AuthenticationException("Authentication failed");
        }
        return returnValue;
    }

}
