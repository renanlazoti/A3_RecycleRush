/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author é o r's
 */
public class Lixeira {
    
    private String cor, tipoLixeira, caminhoImg;

    public Lixeira(String cor, String tipoLixeira, String caminhoImg) {
        this.cor = cor;
        this.tipoLixeira = tipoLixeira;
        this.caminhoImg = caminhoImg;
    }

    public String getCaminhoImg() {
        return caminhoImg;
    }

    public void setCaminhoImg(String caminhoImg) {
        this.caminhoImg = caminhoImg;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLixeira() {
        return tipoLixeira;
    }

    public void setTipoLixeira(String tipoLixeira) {
        this.tipoLixeira = tipoLixeira;
    }
    
}
