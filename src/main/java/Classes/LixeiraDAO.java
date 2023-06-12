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
public class LixeiraDAO {
    public ArrayList<Lixeira> listar(){
        ArrayList<Lixeira> ret = new ArrayList<>();
        String sql = "SELECT * FROM tb_lixeira";
        ConnectionFactory cf = new ConnectionFactory();
        try (Connection c = cf.conectar()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("idLixeira");
                String corLixeira = rs.getString("corLixeira");
                String tipoLixeira = rs.getString("tipoLixeira");
                String caminhoImg = rs.getString("caminhoImg");
                Lixeira bin = new Lixeira(corLixeira,tipoLixeira, caminhoImg);
                ret.add(bin);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ret;
    }
}
