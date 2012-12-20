#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.manager;

import ${package}.service.dao.AuthenticationDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationManagerImpl {
	@Autowired
	private AuthenticationDAOImpl authenticationDAO;
	
	public String authenticateUsernamePassword(String username, String password){
		return "This will be a token returned by validation username/password";
//		return authenticationDAO.authenticateUsernamePassword(username, password);
	}
	
	public String authenticateToken(String token){
		return authenticationDAO.authenticateToken(token);
	}
}
