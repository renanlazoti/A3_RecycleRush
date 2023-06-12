/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
/**
 *
 * @author é o r's
 */
public class Lixo {
    
    private String lixo, tipoLixo, caminhoImg;

    public Lixo(String lixo, String tipoLixo, String caminhoImg) {
        this.lixo = lixo;
        this.tipoLixo = tipoLixo;
        this.caminhoImg = caminhoImg;
    }

    public String getCaminhoImg() {
        return caminhoImg;
    }

    public void setCaminhoImg(String caminhoImg) {
        this.caminhoImg = caminhoImg;
    }

    public String getLixo() {
        return lixo;
    }

    public void setLixo(String lixo) {
        this.lixo = lixo;
    }

    public String getTipoLixo() {
        return tipoLixo;
    }

    public void setTipoLixo(String tipoLixo) {
        this.tipoLixo = tipoLixo;
    }
    
}
