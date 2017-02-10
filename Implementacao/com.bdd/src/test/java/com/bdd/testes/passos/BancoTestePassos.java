/**
 * 
 */
package com.bdd.testes.passos;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import bdd.modelo.Banco;
import bdd.modelo.Conta;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * @author cassiane.santos
 *
 */
public class BancoTestePassos {

	private Banco banco;
	private int totalContas;
	private Double totalDinheiro;
	List<Conta> listaDeContas = new ArrayList<>();

	@Given("^que as contas sao do \"(.*?)\"$")
	public void que_as_contas_sao_do(String nome, List<Conta> listaDeContas) throws Throwable {
		this.setBanco(new Banco(nome, listaDeContas));
	}

	@Given("^o calculo do total de contas criadas$")
	public void o_calculo_do_total_de_contas_criadas() throws Throwable {
		this.setTotalContas(this.getBanco().getListaDeContas().size());
	}

	@Given("^o calculo do total de dinheiro$")
	public void o_calculo_do_total_de_dinheiro() throws Throwable {
		this.setTotalDinheiro(this.getBanco().getListaDeContas().stream().mapToDouble(c -> c.getSaldo()).sum());
	}

	@Then("^o total de contas e (\\d+)$")
	public void o_total_de_contas_e(int totalContasEsperado) throws Throwable {
		assertEquals("O cálculo do total de contas está incorreto", totalContasEsperado, totalContas);
	}

	@Then("^o total de dinheiro no banco e (\\d+)$")
	public void o_total_de_dinheiro_no_banco_e(Double totalDinheiroEsperado) throws Throwable {
		assertEquals("O cálculo do total de dinheiro no banco " + banco.getNome() + " está incorreto",
				totalDinheiroEsperado, this.getTotalDinheiro());
	}

	/**
	 * @return the banco
	 */
	public Banco getBanco() {
		return banco;
	}

	/**
	 * @param banco
	 *            the banco to set
	 */
	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	/**
	 * @return the totalContas
	 */
	public int getTotalContas() {
		return totalContas;
	}

	/**
	 * @param totalContas
	 *            the totalContas to set
	 */
	public void setTotalContas(int totalContas) {
		this.totalContas = totalContas;
	}

	/**
	 * @return the totalDinheiro
	 */
	public Double getTotalDinheiro() {
		return totalDinheiro;
	}

	/**
	 * @param totalDinheiro
	 *            the totalDinheiro to set
	 */
	public void setTotalDinheiro(Double totalDinheiro) {
		this.totalDinheiro = totalDinheiro;
	}
}
