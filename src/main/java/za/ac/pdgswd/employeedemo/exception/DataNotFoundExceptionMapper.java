package za.ac.pdgswd.employeedemo.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import za.ac.pdgswd.employeedemo.model.ErrorEmployee;

@Provider  //registers class in jax_rs so it can be mapped
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException ex) {
		ErrorEmployee errEmp = new ErrorEmployee(ex.getMessage(), 404, "http://localhost:8080/employeedemo/");
		return Response.status(Status.NOT_FOUND)
				       .entity(errEmp)
				       .build();
	}
}
