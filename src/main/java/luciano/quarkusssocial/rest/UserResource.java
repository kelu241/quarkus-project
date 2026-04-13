package luciano.quarkusssocial.rest;

import jakarta.ws.rs.Produces;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import luciano.quarkusssocial.rest.dto.CreateUserRequests;
import luciano.quarkusssocial.rest.model.User;
import jakarta.ws.rs.core.MediaType;

@Path("/users")

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

  @POST
  @Transactional
  public Response createUser(CreateUserRequests userRequests) {

    User user = new User(userRequests.getName(), userRequests.getAge());
    user.persist();
    return Response.ok(userRequests).build();

  }

  @GET
  public Response getAllUsers() {

    PanacheQuery<PanacheEntity> query = User.findAll();
    return Response.ok(query.list()).build();
  }

}
