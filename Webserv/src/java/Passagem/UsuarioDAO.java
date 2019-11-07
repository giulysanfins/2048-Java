/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Passagem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Passagem.Usuario;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

/**
 *
 * @author victorreis
 */
public class UsuarioDAO {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    public String Var=new String();
    FileWriter writeFile=null;
    JSONObject objetoJson=new JSONObject();
    public UsuarioDAO()
    {
    
    }
    
    public boolean inserir(String usuario){
        objetoJson.put("Movi",usuario);
        try {
            writeFile =new FileWriter("build\\classes\\SaveHighScore.txt");
            writeFile.write(objetoJson.toJSONString());
        } catch (IOException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.Var = usuario;
        
        return true;
    }
    /*public String visualizar(){
        Var
    } */
    public String getVar() {
        return Var;
    }

    
}
