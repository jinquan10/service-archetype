#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.stereotype.Component;

@Component(value = "mongoCredentials")
public class MongoCredentials{
	@Value("${symbol_dollar}{db.username}")
	private String username;
	
	@Value("${symbol_dollar}{db.password}")
	private String password;

	@Value("${symbol_dollar}{db.encrypted}")
	private boolean isEncrypted;
	
	@Value("${symbol_dollar}{db.name}")
	private String name;
	
	@Value("${symbol_dollar}{db.host}")
	private String host;
	
	@Value("${symbol_dollar}{db.port}")
	private int port;	
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public UserCredentials getUserCredentials(){
		if(isEncrypted){
			// - decrypt username/password
		}
		
		return new UserCredentials(username, password);
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

	public boolean isEncrypted() {
		return isEncrypted;
	}

	public void setEncrypted(boolean isEncrypted) {
		this.isEncrypted = isEncrypted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
