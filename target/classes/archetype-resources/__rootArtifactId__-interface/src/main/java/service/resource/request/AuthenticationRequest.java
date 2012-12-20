#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.resource.request;

import ${package}.service.resource.BaseResource;

public class AuthenticationRequest extends BaseResource{
	private String username;
	private String password;
	
	public AuthenticationRequest(){
		
	}
	
	public AuthenticationRequest(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
