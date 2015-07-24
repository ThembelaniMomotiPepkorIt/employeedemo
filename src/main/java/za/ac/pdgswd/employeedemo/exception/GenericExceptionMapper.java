package za.ac.pdgswd.employeedemo.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import za.ac.pdgswd.employeedemo.model.ErrorEmployee;

//@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable ex) {
		ErrorEmployee errEmp = new ErrorEmployee(ex.getMessage(), 500, "http://localhost:8080/employeedemo/");
		return Response.status(Status.INTERNAL_SERVER_ERROR)
		               .entity(errEmp)
		               .build();
	}

	
}
