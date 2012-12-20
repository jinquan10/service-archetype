#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.client;

import ${package}.exception.SomethingWentWrongException;
import ${package}.service.controller.AuthenticationController;
import ${package}.service.resource.request.AuthenticationRequest;
import ${package}.service.resource.response.AuthenticationResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public class AuthenticationClient extends BaseClient implements AuthenticationController{
	private static final String AUTHENTICATE_ENDPOINT = "/authenticate";
	
	public ResponseEntity<AuthenticationResponse> authenticate(AuthenticationRequest authRequest) throws SomethingWentWrongException {
		return restTemplate.exchange(urlResolver(AUTHENTICATE_ENDPOINT), HttpMethod.POST, httpEntity(authRequest), AuthenticationResponse.class);
	}
}
