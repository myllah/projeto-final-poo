import model.bean.Locadora;
import model.bean.Veiculo;
import modelo.dao.ClienteDAO;
import modelo.dao.LocadoraDAO;
import junit.framework.TestCase;
import org.junit.Test;
import validacao.ValidaLocadora;
import validacao.ValidaVeiculo;

public class JUnitTest extends TestCase{
    
    public JUnitTest() {}

     @Test
     public void testaNomeLocadora() {
     
     Locadora l = new Locadora();
     l.setNome("");
     l.setCnpj("12123123123412");
     l.setEmail("email");
     l.setId(0);
     l.setTelefone("12112121212");
     l.setSenha("123456");
     
    assertTrue(ValidaLocadora.validaCadastro(l));
    // nome vazio
     
     }
     
     @Test
     public void testaSenhaLocadora() {
     
     Locadora l = new Locadora();
     l.setCnpj("12123123123412");
     l.setEmail("email");
     l.setId(0);
     l.setNome("Nome");
     l.setTelefone("12112121212");
     l.setSenha("123");
     
    assertTrue(ValidaLocadora.validaCadastro(l));
    // senha entre 6 e 12 characteres
     
     }
     
      @Test
     public void testaLocadora() {
     
     Locadora l = new Locadora();
     l.setCnpj("12123123123412");
     l.setEmail("email");
     l.setId(0);
     l.setNome("Nome");
     l.setTelefone("12112121212");
     l.setSenha("123456");
     
    assertFalse(ValidaLocadora.validaCadastro(l));
    // tudo ok
     
     }

      @Test
     public void testaCorVeiculo() {
     
     Veiculo v = new Veiculo();
     v.setAno(5);
     v.setCombustivel("combustivel");
     v.setCor("");
     v.setId(0);
     v.setId_locadora(0);
     v.setMarca("marca");
     v.setModelo("modelo");
     v.setMotor("motor");
     v.setPlaca("placa");
     v.setPrecoDia(1);
     v.setVeiculo("veiculo");
     
     assertTrue(ValidaVeiculo.validaCadastro(v));
     // cor vazio
     
     
     }
     
       @Test
     public void testaPrecoVeiculo() {
     
     Veiculo v = new Veiculo();
     v.setAno(5);
     v.setCombustivel("combustivel");
     v.setCor("Cor");
     v.setId(0);
     v.setId_locadora(0);
     v.setMarca("marca");
     v.setModelo("modelo");
     v.setMotor("motor");
     v.setPlaca("placa");
     v.setPrecoDia(0);
     v.setVeiculo("veiculo");
     
     assertTrue(ValidaVeiculo.validaCadastro(v));
     // preco vazio
     
     }

       @Test
     public void testaContaCliente() {
 
     String email = "email";
     String senha = "senha";
     
     ClienteDAO dao = new ClienteDAO();
        
    assertFalse(dao.checkLogin(email, senha));
    // cliente não existe
     
     }
     
        @Test
     public void testaContaLocadora() {
 
     String email = "email";
     String senha = "senha";
     
     LocadoraDAO dao = new LocadoraDAO();
        
    assertFalse(dao.checkLogin(email, senha));
    // locadora não existe
     
     }
}
