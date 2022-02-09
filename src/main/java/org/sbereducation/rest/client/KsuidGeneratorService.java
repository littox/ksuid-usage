package org.sbereducation.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/id")
@RegisterRestClient
public interface KsuidGeneratorService {
    @GET
    Id generateId() throws SomeException;
}
