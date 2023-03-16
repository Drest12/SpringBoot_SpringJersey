package com.example.demo.service;

import org.glassfish.jersey.server.ResourceConfig;

import org.springframework.stereotype.Component;

import jakarta.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class Publicaciones extends ResourceConfig{
	public  Publicaciones()
	{
		register(Operaciones.class);
	}
}
