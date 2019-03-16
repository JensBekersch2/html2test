package h2t;

import database.Database;
import models.Project;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

public class ProjectApi {

    List<Project> projects = null;

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Path("/{q}")
    public Response getProjects(@PathParam("q") int q) {
        Database db = new Database();
        projects = db.getProjects(q);
        return Response.ok().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Path("/{q}")
    public Response getProject(@PathParam("q") int q) {
        return Response.ok().build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Path("/{q}")
    public Response setProject(@PathParam("q") int q) {
        return Response.ok().build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Path("/{q}")
    public Response updateProject(@PathParam("q") int q) {
        return Response.ok().build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Path("/{q}")
    public Response deleteProject(@PathParam("q") int q) {
        return Response.ok().build();
    }
}
