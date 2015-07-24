package za.ac.pgdswd.employeedemo.bean;

import javax.ws.rs.CookieParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.QueryParam;

public class EmployeeFilterBean {
	
	private @QueryParam("year") int year;
	private @QueryParam("start") int start;
	private @QueryParam("size") int size;
	private @MatrixParam("param") String matrixparam;
	private @HeaderParam("authToken") String header;
	private @CookieParam("JSESSIONID") String cookie;
	
	public String getMatrixparam() {
		return matrixparam;
	}
	public void setMatrixparam(String matrixparam) {
		this.matrixparam = matrixparam;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
