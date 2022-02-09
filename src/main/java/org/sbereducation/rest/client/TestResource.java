package org.sbereducation.rest.client;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ksuid")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TestResource {
    @Inject
    @RestClient
    KsuidGeneratorService ksuidGeneratorService;

    @GET
    public NewId id() {
        String id;
        try {
            id = ksuidGeneratorService.generateId().id;
        } catch (SomeException e)
        {
            return new NewId(e.getMessage());
        }
        return new NewId(id);
    }
}
