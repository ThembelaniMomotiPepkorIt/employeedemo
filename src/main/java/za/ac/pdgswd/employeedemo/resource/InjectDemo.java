package za.ac.pdgswd.employeedemo.resource;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import za.ac.pgdswd.employeedemo.bean.EmployeeFilterBean;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemo {

	@GET
	@Path("/annotations")
	public String getParams(@BeanParam EmployeeFilterBean employeeFilterBean){
		return "matrixparam " +employeeFilterBean.getMatrixparam() + 
			   "\nheader " + employeeFilterBean.getHeader() +
			   "\ncookie " + employeeFilterBean.getCookie();
	}
	
	@GET
	@Path("/context")
	public String getParamsFromContext(@Context UriInfo uriInfo, @Context HttpHeaders headers){
		
		String path = uriInfo.getRequestUri().toString();
		String cookies = headers.getCookies().toString();
		return "path " + path +
			   "\nhead "+ cookies;
	}
	
	
}
