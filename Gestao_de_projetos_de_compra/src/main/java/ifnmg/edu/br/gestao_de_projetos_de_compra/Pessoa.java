/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnmg.edu.br.gestao_de_projetos_de_compra;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author felkng <&it;felipe Rodrigues at ifnmg&gt;>
 */
public class Pessoa {
    private String name; //max 45 ch
    private LocalDate dateBorn;
    private Byte age;
    private Credencial credencial;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Telefone> telefones;
    private ArrayList<Compra> compras;
}
