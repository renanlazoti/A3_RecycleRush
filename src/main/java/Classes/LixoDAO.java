/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Model.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author é o r's
 */
public class LixoDAO {
    public ArrayList<Lixo> listar(){
        ArrayList<Lixo> ret = new ArrayList<>();
        String sql = "SELECT * FROM tb_lixo";
        ConnectionFactory cf = new ConnectionFactory();
        try (Connection c = cf.conectar()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        while (rs.next()){
            int id = rs.getInt("id");
            String nomeLixo = rs.getString("nomeLixo");
            String tipoLixo = rs.getString("tipoLixo");
            String caminhoImg = rs.getString("caminhoImg");
            Lixo trash = new Lixo(nomeLixo, tipoLixo, caminhoImg);
            ret.add(trash);
        }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ret;
    }
    
    
    
}
