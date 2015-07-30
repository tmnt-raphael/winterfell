package com.resources;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
@Path("/v1/hello")
public class HelloWorld extends HttpServlet {
    private static final long serialVersionUID = 1234563220220L;

    private String greeting;
    @Inject public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getOutputStream().print(greeting);
    }

    @GET
    @Path("/test")
    public Response getTest(){
        System.out.println("AWFASDF");
        return Response.status(Response.Status.OK).entity("HELLO").build();
    }

}