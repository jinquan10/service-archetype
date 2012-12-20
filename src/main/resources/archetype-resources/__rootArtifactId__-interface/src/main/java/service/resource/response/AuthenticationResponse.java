#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.resource.response;

import ${package}.service.resource.BaseResource;

public class AuthenticationResponse extends BaseResource {
	private String token;

	public AuthenticationResponse(){
		
	}
	
	public AuthenticationResponse(String token){
		this.token = token;
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
