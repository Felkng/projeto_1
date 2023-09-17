/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ifnmg.edu.br.gestao_de_projetos_de_compra;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author felkng <&it;felipe Rodrigues at ifnmg&gt;>
 */
public class Gestao_de_projetos_de_compra {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        try{
            Credencial cred1 = new Credencial("ana.zaira@mail.com", "asdf123", Boolean.TRUE, p1);
            p1.setCredencial(cred1);
            Credencial cred2 = new Credencial("beatriz.yana@mail.com", "123asdf", Boolean.FALSE, p2);
            p2.setCredencial(cred2);
            Credencial cred3 = new Credencial("cecilia.xerxes@mail.com", "123123", Boolean.FALSE, p3);
            p3.setCredencial(cred3);      
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            p1.setName("Ana Zaira");
            p1.setDateBorn(LocalDate.parse("2000-01-29"));
            p2.setName("Beatriz Yana");
            p2.setDateBorn(LocalDate.parse("1999-01-28"));
            p3.setName("Cecília Xerxes");
            p3.setDateBorn(LocalDate.parse("1998-01-27"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }   
      try{
        p1.addEndereco(new Endereco(Endereco.TipoLogradouro.RUA, "A1", 1011, "Santa Ana I", 39401111));
        p2.addEndereco(new Endereco(Endereco.TipoLogradouro.RUA, "A2", 1012, "Santa Ana II", 39401112));
        p3.addEndereco(new Endereco(Endereco.TipoLogradouro.RUA, "B", 2022, "Santa Beatriz", 39402222));
        p1.addEndereco(new Endereco(Endereco.TipoLogradouro.RUA, "C1", 3031, " Santa Cecília I", 39403331));
        p2.addEndereco(new Endereco(Endereco.TipoLogradouro.RUA, "C2", 3032, "Santa Cecília II", 39403332));
        p1.addEndereco(new Endereco(Endereco.TipoLogradouro.RUA, "C3", 3033, "Santa Cecília III", 39403333));
      }catch(Exception e){
          System.out.println(e.getMessage());
      }
      p1.addTelefone(new Telefone((byte)38,12341234 ));
      p2.addTelefone(new Telefone((byte)38,23452345 ));
      p2.addTelefone(new Telefone((byte)38,923452345 ));
      p3.addTelefone(new Telefone((byte)38,934563456 ));
      p3.addTelefone(new Telefone((byte)38,834563456 ));
        Compra comprasP1 = new Compra();
        ArrayList<Compra> comprasP2 = new ArrayList<>();
        comprasP2.add(new Compra());
        comprasP2.add(new Compra());
        Compra comprasP3 = new Compra();
        try{
            comprasP1.addIten(new Item());
            comprasP1.getItens().get(0).setQuantidade(11);
            comprasP1.getItens().get(0).addProduct((new Produto("Abacaxi", BigDecimal.valueOf(1.99))));
            comprasP1.setNotaFiscal((long)000100101);
            comprasP1.setPerson(p1);
            p1.addCompra(comprasP1);
            for(int i=1; i<=4; i++){
                comprasP2.get(0).addIten(new Item());
                comprasP2.get(0).getItens().get(i-1).setQuantidade(10+i);
            }
            comprasP2.get(0).getItens().get(0).addProduct((new Produto("Banana", BigDecimal.valueOf(2.99))));
            comprasP2.get(0).getItens().get(1).addProduct((new Produto("Caqui", BigDecimal.valueOf(3.99))));
            comprasP2.get(0).getItens().get(2).addProduct((new Produto("Damasco", BigDecimal.valueOf(4.99))));
            comprasP2.get(0).getItens().get(3).addProduct((new Produto("Espinafre", BigDecimal.valueOf(5.99))));
            comprasP2.get(0).setNotaFiscal((long)000200202);
            comprasP2.get(0).setPerson(p2);
            
            comprasP2.get(1).addIten(new Item());
            comprasP2.get(1).addIten(new Item());
            comprasP2.get(1).addIten(new Item());
            comprasP2.get(1).getItens().get(0).setQuantidade(21);
            comprasP2.get(1).getItens().get(1).setQuantidade(22);
            comprasP2.get(1).getItens().get(2).setQuantidade(23);
            
            comprasP2.get(1).getItens().get(0).addProduct((new Produto("Abacaxi", BigDecimal.valueOf(1.99))));
            comprasP2.get(1).getItens().get(1).addProduct((new Produto("Caqui", BigDecimal.valueOf(3.99))));
            comprasP2.get(1).getItens().get(2).addProduct((new Produto("Espinafre", BigDecimal.valueOf(5.99))));
            comprasP2.get(1).setNotaFiscal((long)000200212 );
            comprasP2.get(1).setPerson(p2);
            p2.setCompras(comprasP2);
            comprasP3.addIten(new Item());
            comprasP3.addIten(new Item());
            comprasP3.addIten(new Item());
            comprasP3.getItens().get(0).setQuantidade(31);
            comprasP3.getItens().get(1).setQuantidade(32);
            comprasP3.getItens().get(2).setQuantidade(33);
            
            comprasP3.getItens().get(0).addProduct(new Produto("Abacaxi", BigDecimal.valueOf(1.99)));
            comprasP3.getItens().get(1).addProduct(new Produto("Caqui", BigDecimal.valueOf(3.99)));
            comprasP3.getItens().get(2).addProduct(new Produto("Espinafre", BigDecimal.valueOf(5.99)));
            comprasP3.setNotaFiscal((long)000300303);
            comprasP3.setPerson(p3);
            p3.addCompra(comprasP3);
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(p1.toString());
        System.out.println("Valor total da compra:" + p1.getCompras().get(0).calcularTotal().toString() + "\n");
        System.out.println(p2.toString());
        System.out.println("Valor total da compra 1: " + p2.getCompras().get(0).calcularTotal().toString() + "\n");
        System.out.println("Valor total da compra 2: " + p2.getCompras().get(1).calcularTotal().toString() + "\n");
        System.out.println(p3.toString());
        System.out.println("Valor total da compra:" + p3.getCompras().get(0).calcularTotal().toString() + "\n");
      
      
    }
}
