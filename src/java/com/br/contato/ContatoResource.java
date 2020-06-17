/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.contato;


import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author vitcl
 */
@Path("contato")
public class ContatoResource {


    /**
     * Creates a new instance of ContatoResource
     */
    public ContatoResource() {
    }

    /**
     * Retrieves representation of an instance of com.br.contato.ContatoResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Contato retornaNomeContato() {
        //TODO return proper representation object
        return new Contato("Vitor Oliveira da Silva", "vitoro580@gmail.com");
    }
    
    // Exemplo de objeto a ser trafegado no SERVICE
    /*
        <contato>
            <nome></nome>
            <email></email>
        </contato>
    */
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public void inserirContato(Contato contato){
        System.out.println(contato.getEmail());
        System.out.println(contato.getNome());
    }

    /**
     * PUT method for updating or creating an instance of ContatoResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
