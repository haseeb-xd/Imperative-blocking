package com.haseeb;

import java.io.IOException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.smallrye.common.annotation.Blocking;
import io.smallrye.common.annotation.NonBlocking;


@Produces(MediaType.TEXT_PLAIN)
@Path("/hello")
public class Resource 
{

    @Inject
    Repository rep;

  
    @GET
    public String hello() throws IOException
     {
         rep.callBlockingCode();
        return Thread.currentThread().getName();
     }

}

// haseeb-xd