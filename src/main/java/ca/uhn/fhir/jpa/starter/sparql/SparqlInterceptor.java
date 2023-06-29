package ca.uhn.fhir.jpa.starter.sparql;

import ca.uhn.fhir.interceptor.api.Hook;
import ca.uhn.fhir.interceptor.api.Interceptor;
import ca.uhn.fhir.interceptor.api.Pointcut;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.rest.api.server.RequestDetails;
import ca.uhn.fhir.rest.api.server.ResponseDetails;
import org.hl7.fhir.instance.model.api.IBaseResource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Interceptor
public class SparqlInterceptor {

	public SparqlInterceptor() {
	}

	@Hook(Pointcut.SERVER_INCOMING_REQUEST_PRE_PROCESSED)
	public void preProcessIncomingRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Processing SPARQL ");
	}

	@Hook(Pointcut.SERVER_OUTGOING_RESPONSE)
	public void preProcessOutgoingResponse(RequestDetails theRequestDetails, ResponseDetails theResponseDetails) {
		System.out.println("Finalizing SPARQL processing");
		IBaseResource resource = theResponseDetails.getResponseResource();
	}

}

