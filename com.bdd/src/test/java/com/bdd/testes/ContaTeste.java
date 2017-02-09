/**
 * 
 */
package com.bdd.testes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author cassiane.santos
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/html"},
        features = {"classpath:features/conta.feature"})
public class ContaTeste {
	public ContaTeste(){
		
	}

}
