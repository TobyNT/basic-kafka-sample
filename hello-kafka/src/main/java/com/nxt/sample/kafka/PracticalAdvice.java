package com.nxt.sample.kafka;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PracticalAdvice {
	private final String message;
	private final int identifier;

	public PracticalAdvice(@JsonProperty("message") final String message,
			@JsonProperty("identifier") final int identifier) {
		this.message = message;
		this.identifier = identifier;
	}

	public String getMessage() {
		return message;
	}

	public int getIdentifier() {
		return identifier;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("message", message).append("identifier", identifier).toString();
	}
}
