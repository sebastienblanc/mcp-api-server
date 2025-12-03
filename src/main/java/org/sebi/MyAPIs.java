package org.sebi;


import io.quarkus.security.Authenticated;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
@Authenticated
public class MyAPIs {

    @POST
    @Path("/request-new-db-region")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String requestNewDBRegion(String region) {
        return "Request sent to the platform team to create a new DB region: " + region;
    }

    @POST
    @Path("/add-new-db-region")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String addNewDBRegion(String region) {
        return "New DB region added: " + region;
    }

    @POST
    @Path("/assess-region-security")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String assessRegionSecurity(String region) {
        return "Security assessment completed for DB region: " + region;
    }


}
