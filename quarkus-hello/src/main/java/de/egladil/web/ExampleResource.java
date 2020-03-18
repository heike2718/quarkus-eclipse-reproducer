package de.egladil.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.egladil.web.own_artifact.SecUtils;

@Path("/hello")
public class ExampleResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {

		SecUtils.wipe("very secret string");
		return "hello";
	}
}
