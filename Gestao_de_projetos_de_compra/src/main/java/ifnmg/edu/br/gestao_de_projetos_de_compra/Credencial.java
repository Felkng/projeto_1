/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnmg.edu.br.gestao_de_projetos_de_compra;

/**
 *
 * @author felkng <&it;felipe Rodrigues at ifnmg&gt;>
 */
public class Credencial {
    private String email;
    private String senha; //max 12 ch
    private Boolean isAdminstrator; //padrão = false
    private Pessoa person;

    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws  Exception {
        if(senha.length() > 12)
            throw new Exception("The password must not contain more than 12 caracters!");
        else
            this.senha = senha;
    }

    public Boolean getIsAdminstrator() {
        return isAdminstrator;
    }

    public void setIsAdminstrator(Boolean isAdminstrator) {
        this.isAdminstrator = isAdminstrator;
    }

    public Pessoa getPerson() {
        return person;
    }

    public void setPerson(Pessoa person) {
        this.person = person;
    }
//</editor-fold>    

    public Credencial(String email, String senha, Boolean isAdminstrator, Pessoa person) throws Exception {
        this.email = email;
        setSenha(senha);
        this.isAdminstrator = isAdminstrator;
        this.person = person;
    }

    public Credencial() {
        this.isAdminstrator = false;
    }

    @Override
    public String toString() {
        return "Credencial{" + "email=" + email + ", senha=" + senha + ", isAdminstrator=" + isAdminstrator + ", person=" + person.getName() + '}';
    }
    
    
    
}
