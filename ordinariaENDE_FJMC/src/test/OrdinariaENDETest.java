package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ejercicio2.OrdinariaENDE;

@RunWith(Parameterized.class) 
public class OrdinariaENDETest {
	
	private String frase = null;
	private boolean respuesta = false;
	
	public OrdinariaENDETest(String frase, boolean respuesta) {
		this.frase = frase;
		this.respuesta = respuesta;
	}
	
	@Parameters
	public static Collection<Object[]> frases() {
		return Arrays.asList(new Object[][] {{"¡arriba la birra!",false},
											 {"reconocer",true},
											 {"Isaac no ronca así",false}});
	}

	@Test
	public void testEsPalindromo() {
		OrdinariaENDE testeo = new OrdinariaENDE();
		boolean resultado = testeo.esPalindromo(frase);
		assertEquals(respuesta, resultado);
	}

}
