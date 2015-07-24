package za.ac.pdgswd.employeedemo.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import za.ac.pdgswd.employeedemo.model.Employee;
import za.ac.pdgswd.employeedemo.service.EmployeeService;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {

	private EmployeeService es = new EmployeeService();
	
	/*@GET
	@Produces(MediaType.TEXT_PLAIN) 
	public String getEmployees(){
		//return es.getAllEmployees();
		return "Hello nikka";
	}*/
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployees(){
		return es.getAllEmployees();
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)                                                       //Error thrown from service, resource throws to Jax_rs
	@Path("/{shortname}")                                                                       //Jax tries to see if there is an exception mapped 
	public Employee getEmployee(@PathParam("shortname") String shortname){                      //It finds DataNotFoundExceptionMapper, calls toResponse method
		return es.getEmployee(shortname);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response addEmployee(Employee employee, @Context UriInfo uriInfo) throws URISyntaxException{
		Employee newEmp = es.addEmployee(employee);
				        //Static         //Created
		return Response.created(new URI(uriInfo.getAbsolutePath()+"/"+ newEmp.getShortname()))  //  return status 201 + uri
		               .entity(newEmp)                                                          //Will return the response body
		               
		               .build();                                                                //Combines elements into one return value
		
		                                                                                        //return es.addEmployee(employee) as reponse body;
		
	} 
	
	@PUT 
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{shortname}")
	public Employee updateEmployee(@PathParam("shortname") String shortname, Employee employee){
		return es.updateEmployee(shortname, employee);
	}
	
	@DELETE
	@Path("/{shortname}")
	@Produces(MediaType.TEXT_PLAIN)
	public void deleteEmployee(@PathParam("shortname")String shortname){
		es.deleteEmployee(shortname);
	}
	
	@Path("/{shortname}/friends")
	public FriendResource getFriendsResource(){
		return new FriendResource();
	}
	
}
