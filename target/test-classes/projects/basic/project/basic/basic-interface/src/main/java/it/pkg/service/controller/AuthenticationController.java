package it.pkg.service.controller;

import it.pkg.exception.SomethingWentWrongException;
import it.pkg.service.resource.request.AuthenticationRequest;
import it.pkg.service.resource.response.AuthenticationResponse;
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
