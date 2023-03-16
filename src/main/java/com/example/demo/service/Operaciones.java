package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/servicio")
public class Operaciones {
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> listar()
	{
		List<String> items = new ArrayList<>();
		items.add("Aruto");
		items.add("Maria");
		items.add("Armando");
		items.add("Andrea");
		
		return items;
		
	}

}
