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
    
    
    
    
    
    public enum TipoLogradouro{
        AVENIDA, PRACA, RUA, OUTRO
    }
}
