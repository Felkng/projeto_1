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
public class Compra {
    private Long notaFiscal;
    private Pessoa person;
    private ArrayList<Item> itens;

    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    

    public Long getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(Long notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Pessoa getPerson() {
        return person;
    }

    public void setPerson(Pessoa person) {
        this.person = person;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    
    public void addIten(Item itens) {
        this.itens.add(itens);
    }
    
    //</editor-fold>
    
    
    public BigDecimal calcularTotal(){
        BigDecimal total = new BigDecimal(0.0);
        for(Item iten : this.itens){
            total = total.add(iten.calcularTotal());
        }
        return total;
    }

    public Compra(Long notaFiscal, Pessoa person, ArrayList<Item> itens) {
        this.notaFiscal = notaFiscal;
        this.person = person;
        this.itens = itens;
    }

    public Compra() {
        itens = new ArrayList<>();
    }

    
    @Override
    public String toString() {
        String items = "\n";
        for(Item x: this.itens){
            items += x.toString() + "\n";
        }
        return "Compra{" + "notaFiscal=" + notaFiscal + ", person=" + person.getName() + ", \nitens=" + items + '}';
    }
    
    
}
