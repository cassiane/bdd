package com.bdd.testes.passos;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import bdd.modelo.Users;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UsersTestePassos {
	private List<Users> usersLocal;
	private int totalUsuarios;

	@Given("^usuarios$")
	public void usuarios(List<Users> users) throws Throwable {
		this.setUsersLocal(new ArrayList<>());
		this.setUsersLocal(users);
	}

	@Then("^o total de usuario e (\\d+)$")
	public void o_total_de_usuario_e(int total) throws Throwable {		
		assertEquals("O total de usuario", total, this.getUsersLocal().size());
	}

	/**
	 * @return the usersLocal
	 */
	public List<Users> getUsersLocal() {
		return usersLocal;
	}

	/**
	 * @param usersLocal
	 *            the usersLocal to set
	 */
	public void setUsersLocal(List<Users> usersLocal) {
		this.usersLocal = usersLocal;
	}

	/**
	 * @return the totalUsuarios
	 */
	public int getTotalUsuarios() {
		return totalUsuarios;
	}

	/**
	 * @param totalUsuarios
	 *            the totalUsuarios to set
	 */
	public void setTotalUsuarios(int totalUsuarios) {
		this.totalUsuarios = totalUsuarios;
	}
}
