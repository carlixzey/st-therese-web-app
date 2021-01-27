package com.optimal.web.api.dtos.responses;

public class ErrorResponse extends AppResponse {

	public ErrorResponse(String message) {
		super(false);
		addFullMessage(message);
	}

	public ErrorResponse() {
		super(false);
	}
}
