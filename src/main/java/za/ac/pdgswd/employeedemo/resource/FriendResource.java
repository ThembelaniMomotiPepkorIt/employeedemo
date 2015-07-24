package za.ac.pdgswd.employeedemo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class FriendResource {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getFriends(){
		return "These are the friends";
	}
	
	@GET
	@Path("/{name}")
	@Produces(MediaType.TEXT_HTML)
	public String getSpecialFriend(@PathParam("shortname") String shortname, @PathParam("name") String name){
		return shortname +"'s special Friend is " + name;
	}
	
}
