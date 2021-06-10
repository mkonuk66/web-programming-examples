package com.kb.rest.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kb.model.User;
import com.kb.service.UserService;

@Path("/userInfo")
public class UserResource {
	UserService userService = new UserService();

	// CRUD -- CREATE operation
	@POST
	@Produces(MediaType.TEXT_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public User createUser(@FormParam("id") String id,@FormParam("name") String name,@FormParam("country") String country,@FormParam("email") String email) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		user.setCountry(country);
		User userResponse = userService.createUser(user);
		return userResponse;
	}

	// CRUD -- READ operation
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getAllUsers() {
		List<User> userList = userService.getAllUsers();
		return userList;
	}


	// CRUD -- UPDATE operation
	@PUT
	@Produces(MediaType.TEXT_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public User updateUser(@FormParam("id") String id,@FormParam("name") String name,@FormParam("country") String country,@FormParam("email") String email) {
		User user = userService.getUserForId(id);
		user.setName(name);
		user.setCountry(country);
		user.setEmail(email);
		User userResponse = userService.updateUser(user);
		return userResponse;
	}

	// CRUD -- DELETE operation
	@DELETE
	@Produces(MediaType.TEXT_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public User deleteeUser(@FormParam("id") String id) {
		User userResponse = userService.deleteUser(id);
		return userResponse;
	}
}
