/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnmg.edu.br.gestao_de_projetos_de_compra;

/**
 *
 * @author felkng <&it;felipe Rodrigues at ifnmg&gt;>
 */
public class Telefone {
    private Byte ddd;
    private Integer number;

    public Byte getDdd() {
        return ddd;
    }

    public void setDdd(Byte ddd) {
        this.ddd = ddd;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Telefone(Byte ddd, Integer number) {
        this.ddd = ddd;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Telefone{" + "(" + ddd.intValue() + ")" + " " + number.toString() +  '}';
    }
    
    
}
