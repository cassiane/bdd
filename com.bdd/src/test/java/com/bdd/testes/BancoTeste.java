package com.bdd.testes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/html"},
        features = {"classpath:features/banco.feature"})
public class BancoTeste{
	public BancoTeste(){
		
	}
}
