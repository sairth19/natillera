package com.tunatillera.core.usecase;

public class UseCaseReponse<T> {
	public T output;
	public int statusCode;
	
	public UseCaseReponse() {}

	public UseCaseReponse(T output, int statusCode) {
		super();
		this.output = output;
		this.statusCode = statusCode;
	}

	public T getOutput() {
		return output;
	}

	public void setOutput(T output) {
		this.output = output;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
}
