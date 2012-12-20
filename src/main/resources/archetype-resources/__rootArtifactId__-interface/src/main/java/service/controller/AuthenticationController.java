#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.controller;

import ${package}.exception.SomethingWentWrongException;
import ${package}.service.resource.request.AuthenticationRequest;
import ${package}.service.resource.response.AuthenticationResponse;
import org.springframework.http.ResponseEntity;

// - DONE: figure out how to integrate tomcat7 into maven build cycle
//		- bug in current maven tomcat plugin 2.0, can't use package phase and above executed from parent pom
// - DONE: configure long standing service instance
// - DONE: create maven archetype
// - DONE: find out how to use the MongoDB Datasource
// - TODO: add authFilter
// - TODO: embedded mongodb!
// - TODO: auto documentation

public interface AuthenticationController {
	public ResponseEntity<AuthenticationResponse> authenticate(AuthenticationRequest authResource) throws SomethingWentWrongException;
}
