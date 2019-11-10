/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serv2048;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;


/**
 * REST Web Service
 * @author VICTOR
 */
@Path("Movimento")
public class MovimentoServ extends ArqServ {

    @Context
    private UriInfo context;
    
    String Var=new String("teste");
    public MovimentoServ() {
    }
    
    @GET
    @Produces("application/Json")
    public String getJson() {
        
        String saida=Read();
        Gson g= new Gson();
        String aux=g.toJson(saida);
        Write("vazio");
        
        System.out.println(aux);
        return aux;
    }
    
    @POST
    @Consumes("application/json")
    @Path("alterar")
    public void putInserir(String content){
       //System.out.println(content);
        Write(content);
        Var=content;
    }
}
