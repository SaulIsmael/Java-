package mx.com.gm.sga.servicio.rest;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.Status;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaService;

@Path("/personas")
@Stateless
public class PersonaServiceRS {

    @Inject
    private PersonaService personaService;

    @GET
    @Produces(value={MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Persona> listarPersonas() {
        return personaService.listarPersonas();
    }

    @GET
    @Produces(value={MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("{id}") //hace referencia a /personas/{id}    
    public Persona encontrarPersonaPorId(@PathParam("id") int id) {
        return personaService.encontrarPersonaPorId(new Persona(id));
    }

    @POST
    @Produces(value={MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes(value={MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response agregarPersona(Persona persona) {
        try {
            personaService.registrarPersona(persona);
            return Response.ok().entity(persona).build();
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
            return Response.status(Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PUT
    @Produces(value={MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes(value={MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Response modificarPersona(@PathParam("id") int id, Persona personaModificada) {
        try {
            Persona persona = personaService.encontrarPersonaPorId(new Persona(id));
            if (persona != null) {
                personaService.modificarPersona(personaModificada);
                return Response.ok().entity(personaModificada).build();
            } else {
                return Response.status(Status.NOT_FOUND).build();
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
            return Response.status(Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DELETE
    @Path("{id}")
    public Response eliminarPersonaPorId(@PathParam("id") int id) {
        try {
            personaService.eliminarPersona(new Persona(id));
            return Response.ok().build();
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
            return Response.status(404).build();
        }
    }
}