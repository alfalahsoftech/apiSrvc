package com.alfalahsoftech.base;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.server.model.ResourceMethod;

public class FirstPageFilter extends AFBaseObject implements ContainerRequestFilter {
	ContainerRequestContext requestContext;
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		
		this.requestContext = requestContext;
//		afDebug("getUserPrincipal=>"+requestContext.getSecurityContext().getUserPrincipal().getName());
		afDebug("getHeaders=> "+requestContext.getHeaders());
		afDebug("getUriInfo=> "+requestContext.getUriInfo());
		afDebug("getPropertyNames=> "+requestContext.getPropertyNames());
		System.out.println("requestContext.getMethod==>>> "+ requestContext.getMethod());
		System.out.println("getSecurityContext.isSecure==>>> "+ requestContext.getSecurityContext().isSecure());
		System.out.println("requestContext.getSecurityContext.getAuthenticationScheme()==>>> "+ requestContext.getSecurityContext().getAuthenticationScheme());
	}
	
	 public void preProcess(HttpServletRequest request, ResourceMethod methodInvoked) throws  WebApplicationException {
		 
		afDebug(methodInvoked);
		afDebug("request=== "+ request);
	    }
	
	
	
}
