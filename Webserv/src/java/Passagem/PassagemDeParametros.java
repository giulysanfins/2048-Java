/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Passagem;

import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author VICTOR
 */
@Path("Passagem")
public class PassagemDeParametros {
    Usuario u=new Usuario();
    Gson g=new Gson();
    String save= new String();
    UsuarioDAO dao = new UsuarioDAO();
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PassagemDeParametros
     */
    public PassagemDeParametros() {
    }

    /**
     * Retrieves representation of an instance of Passagem.PassagemDeParametros
     * @return an instance of java.lang.String
     */
    /*@GET
    @Produces("application/text")
    public String getJson() {
        //TODO return proper representation object
        return "funcionando aparentemente";
    }
*/
    @GET
    @Produces("application/text")
    @Path("Movimento/ver")
    public String ver() {
        String teste=new String(dao.getVar());
      //  u.setLogin();
        Gson g = new Gson();
        return g.toJson(teste);
    }
    
    @GET
    @Produces("application/json")
    @Path("Movimento/get/{login}")
    public String getUsuario(@PathParam("login")String login) {
       // Usuario u = new Usuario();
        //u.setLogin(login);    
       // dao.busca(login);
       // save=login;
        //Converter para Gson
        
       // u.setLogin(login);
        dao.inserir(login);
        //System.out.println(dao.Var);
        Gson g = new Gson();
        
        return g.toJson(login);      
    }
    
    @POST
    @Consumes({"application/json"})
    @Path("Movimento/inserir/{login}")
    public String inserir(@PathParam("login")String login){
     Gson g = new Gson();
     String Str=new String();
     
        Str = (String) g.fromJson(login, String.class);
        dao.inserir(Str);
        return g.toJson(login);
}
    /**
     * PUT method for updating or creating an instance of PassagemDeParametros
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
