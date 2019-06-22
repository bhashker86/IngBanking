package com.IngBanking.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class ErrorsResponse {
	
private Date date;	
private HttpStatus status;
private String message;

public ErrorsResponse(Date date, HttpStatus ok, String message) {
	super();
	this.date = date;
	this.status = ok;
	this.message = message;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public HttpStatus getStatus() {
	return status;
}
public void setStatus(HttpStatus status) {
	this.status = status;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public ErrorsResponse() {
	super();
	// TODO Auto-generated constructor stub
}

}
