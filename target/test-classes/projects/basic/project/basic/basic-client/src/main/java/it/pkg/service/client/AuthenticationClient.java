package it.pkg.service.client;

import it.pkg.exception.SomethingWentWrongException;
import it.pkg.service.controller.AuthenticationController;
import it.pkg.service.resource.request.AuthenticationRequest;
import it.pkg.service.resource.response.AuthenticationResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public class AuthenticationClient extends BaseClient implements AuthenticationController{
	private static final String AUTHENTICATE_ENDPOINT = "/authenticate";
	
	public ResponseEntity<AuthenticationResponse> authenticate(AuthenticationRequest authRequest) throws SomethingWentWrongException {
		return restTemplate.exchange(urlResolver(AUTHENTICATE_ENDPOINT), HttpMethod.POST, httpEntity(authRequest), AuthenticationResponse.class);
	}
}
