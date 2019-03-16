package h2t;

import helper.HtmlExtractor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class HtmlElementsApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Path("/{q}")
    public Response getNewHtmlElements(@PathParam("q") String q) {
        HtmlExtractor.getElements(q);
        return Response.ok().build();
    }
}
