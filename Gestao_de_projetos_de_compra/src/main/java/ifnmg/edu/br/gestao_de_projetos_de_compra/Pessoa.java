/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnmg.edu.br.gestao_de_projetos_de_compra;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    

    public String getName() {
        return name;
    }

    public void setName(String name)throws Exception {
        if (name.length() > 45)
            throw new Exception("Name must not have more than 45 caracters");
        else
            this.name = name;
    }

    public LocalDate getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(LocalDate dateBorn) {
        this.dateBorn = dateBorn;
        Integer x = (int)this.dateBorn.until(LocalDate.now(), ChronoUnit.YEARS);
        this.age = x.byteValue() ;
    }

    public Byte getAge() {
        return age;
    }

//    public void setAge(Byte age) {
//        this.age = age;
//    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void addTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void addCompra(Compra compra) {
        this.compras.add(compra);
    }
    //</editor-fold>
    
    public Pessoa(){
        this.enderecos = new ArrayList<>();
        this.telefones = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    public Pessoa(String name, LocalDate dateBorn, Byte age, Credencial credencial, ArrayList<Endereco> enderecos, ArrayList<Telefone> telefones, ArrayList<Compra> compras) throws Exception {
        setName(name);
        this.dateBorn = dateBorn;
        this.age = age;
        this.credencial = credencial;
        this.enderecos = enderecos;
        this.telefones = telefones;
        this.compras = compras;
    }

    @Override
    public String toString() {
        String nome ="Nome: " +  this.name + "\n";
        String credenciais ="Credenciais: " + this.credencial.toString() + "\n";
        String dataDeNascimento = "Data de nascimento: " + this.dateBorn.toString() + "\n";
        String idade = "Idade: " + this.age.intValue() + "\n";
        String enderecos = "Enderecos: \n";
        for(Endereco x: this.enderecos){
            enderecos += " [ " +  x.toString() + " ] " + "\n";
        }
        String telefones = "Telefones: \n";
        for(Telefone x: this.telefones){
            telefones +=  " [ " +  x.toString() + "]" + "\n";
        }
        String compras = "Compras: \n";
         for(Compra x: this.compras){
            compras +=  " [ " +  x.toString() + "]" + "\n";
        }
        return nome + credenciais + dataDeNascimento+ idade + enderecos + telefones + compras;
    }
    

    
    
    
}
