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
    private ArrayList<Produto> products;

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<Produto> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Produto> products) {
        this.products = products;
    }

    
    public void addProduct(Produto product) {
        this.products.add(product);
    }

    public Item() {
        this.products = new ArrayList<>();
    }

    public Item(Integer quantidade, ArrayList<Produto> products) {
        this.quantidade = quantidade;
        this.products = products;
    }
    
    public BigDecimal calcularTotal(){
        BigDecimal total = new BigDecimal(0.0);
//        for(Produto produto: this.products){
//            total = total.add(produto.getPreco());
//        }
        total = this.products.get(0).getPreco();
        total = total.multiply(BigDecimal.valueOf(this.quantidade));
        return total;
    }

    @Override
    public String toString() {
        String produtos = "[";
            for(Produto x: this.products){
                produtos += " [ "+  x.toString() + " ] ";
            }
        return "Item{" + "quantidade=" + quantidade + ", \nproducts=" + produtos + ']' + '}';
    }
    
    
    
    
    
    
    
    
}
