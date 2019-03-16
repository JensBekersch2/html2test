package h2t;

import database.Database;
import models.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserApi {

    User user = null;

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Path("/{q}")
    public Response getUser(@PathParam("q") int q) {
        Database db = new Database();
        user = db.getUser(q);
        return Response.ok(user).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Path("/{q}")
    public Response setUser(@PathParam("q") int q) {
        return Response.ok().build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Path("/{q}")
    public Response updateUser(@PathParam("q") int q) {
        return Response.ok().build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Path("/{q}")
    public Response deleteUser(@PathParam("q") int q) {
        return Response.ok().build();
    }
}
