package it.pkg.service.endpoint;

import org.junit.Assert;
import org.junit.Test;
import it.pkg.exception.SomethingWentWrongException;
import it.pkg.service.client.AuthenticationClient;
import it.pkg.service.resource.request.AuthenticationRequest;
import it.pkg.service.resource.response.AuthenticationResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AuthenticationTest extends TestSetup{
	private final AuthenticationClient client = new AuthenticationClient();
	
	@Test
	public void authenticateTest() throws SomethingWentWrongException{
		AuthenticationRequest authRequest = new AuthenticationRequest("username", "password"); 
		
		ResponseEntity<AuthenticationResponse> response = client.authenticate(authRequest);
		
		Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
		Assert.assertEquals(response.getBody().getToken(), "This will be a token returned by validation username/password");
	}
}
