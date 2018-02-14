package com.as.newasset.api.responses;

import java.util.ArrayList;

public class Response<T> {

	private T data;
	private ArrayList<String> errors;
	
	public Response() {
		
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ArrayList<String> getErrors() {
        if (errors == null)
        	   errors = new ArrayList<String>();
		return errors;
	}

	public void setErrors(ArrayList<String> errors) {
		this.errors = errors;
	}
}
