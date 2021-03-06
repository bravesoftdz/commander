package com.integralblue.commander.web.message;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
@Builder
public class SpeakerRequestToClient extends RequestToClient {
	@NonNull
	String mimeType;

	@NonNull
	byte[] audio;
}
