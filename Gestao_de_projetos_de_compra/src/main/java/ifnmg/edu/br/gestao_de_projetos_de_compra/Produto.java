/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnmg.edu.br.gestao_de_projetos_de_compra;

import java.math.BigDecimal;

/**
 *
 * @author felkng <&it;felipe Rodrigues at ifnmg&gt;>
 */
public class Produto {
    private String nome; //max ch 150
    private BigDecimal preco;

    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.length() > 150)
            throw new Exception("Name must not have more than 150 caracters");
         else
            this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    //</editor-fold>

    public Produto(String nome, BigDecimal preco) throws Exception {
        setNome(nome);
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco.toString() + '}';
    }
   
    
   
    
}
