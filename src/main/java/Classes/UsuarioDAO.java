/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Model.ConnectionFactory;
import Telas.Jogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author é o r's
 */
public class UsuarioDAO {
   
    int novoScore = Integer.parseInt(Jogo.lblScore.getText());
    
    public void atualizarScore(int score, int id){  
        
        if(score<novoScore){
            String sql = "update tb_usuario set score=? where id=?";
            
            ConnectionFactory cf = new ConnectionFactory();
            try(Connection c = cf.conectar()){
                PreparedStatement ps = c.prepareStatement(sql);
                
                ps.setInt(1, novoScore);
                ps.setInt(2, id);
                
                ps.execute();
                
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
