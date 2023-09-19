/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnmg.edu.br.gestao_de_projetos_de_compra;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author felkng <&it;felipe Rodrigues at ifnmg&gt;>
 */
public class Item {
    private Integer quantidade;
    private Produto products;

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProducts() {
        return products;
    }

    public void setProducts(Produto products) {
        this.products = products;
    }

    public Item(Integer quantidade, Produto products) {
        this.quantidade = quantidade;
        this.products = products;
    }

    public Item() {
    }

    
    public BigDecimal calcularTotal(){
        BigDecimal total = new BigDecimal(0.0);
        total = this.products.getPreco();
        total = total.multiply(BigDecimal.valueOf(this.quantidade));
        return total;
    }

    @Override
    public String toString() {
        return "Item{ " + this.products.getNome() + " " + this.quantidade + " x R$" + this.products.getPreco() + " = "  + this.calcularTotal().toString() + " }";
    }
    
    
    
    
    
    
    
    
}
