/**
 * 
 */
package bdd.modelo;

import java.util.List;


/**
 * @author cassiane.santos
 *
 */
public class Banco {

	private String nome;
    private List<Conta> listaDeContas;
    
    public Banco(String nome, List<Conta> listaDeContas) {
           this.nome = nome;
           this.listaDeContas= listaDeContas;
    }
    
	public Banco() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
          return nome;
    }
    public void setNome(String nome) {
          this.nome = nome;
    }
    public List<Conta> getListaDeContas() {
          return listaDeContas;
    }
    public void setListaDeContas(List<Conta> listaDeContas) {
          this.listaDeContas = listaDeContas;
    }

}
