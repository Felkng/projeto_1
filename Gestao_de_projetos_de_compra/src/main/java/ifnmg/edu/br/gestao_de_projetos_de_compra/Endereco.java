/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnmg.edu.br.gestao_de_projetos_de_compra;

/**
 *
 * @author felkng <&it;felipe Rodrigues at ifnmg&gt;>
 */
public class Endereco {
    private TipoLogradouro tipoLogradouro;
    private String logradouro; //max 255 ch
    private Integer numero;
    private String bairro; //max 50 ch
    private Integer cep;

    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    
    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradgouroInput) {
        this.tipoLogradouro = tipoLogradgouroInput;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) throws Exception {
        if(logradouro.length() > 255)
            throw new Exception("Logradouro must not have more than 255 caracters");
        else
            this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro)throws Exception {
         if(bairro.length() > 50)
            throw new Exception("Logradouro must not have more than 50 caracters");
         else
            this.bairro = bairro;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }
    //</editor-fold>

    public Endereco(TipoLogradouro tipoLogradouro, String logradouro, Integer numero, String bairro, Integer cep) throws Exception {
        this.tipoLogradouro = tipoLogradouro;
        setLogradouro(logradouro);
        this.numero = numero;
        setBairro(bairro);
        this.cep = cep;
    }

    public Endereco() {
    }
    
    //“RUA Dois, 300,
//Village do Lago I, 39.404-058”;

    @Override
    public String toString() {
        return "Endereco{" + tipoLogradouro.toString() + "  " + logradouro + ", " + numero + ", " + bairro + ", " + cep.toString() +  '}';
    }
    
    
    
    
    public enum TipoLogradouro{
        AVENIDA, PRACA, RUA, OUTRO
    }
}
