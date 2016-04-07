package ar.edu.unlam.tallerweb.TareaUno;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CuadradoTest {

	@Test
	public void areaTest(){
		Integer valorEsperado, areaCuadrado;
		valorEsperado = 16;
		Cuadrado valorArea = new Cuadrado();
		areaCuadrado=valorArea.areaCuadrado(4);
		Assert.assertEquals(valorEsperado, areaCuadrado);
		
	}
	
	@Test
	public void perimetroTest(){
		  Integer valorEsperado, perimetroCuadrado;
			valorEsperado = 16;
			Cuadrado valorPerimetro = new Cuadrado();
			perimetroCuadrado=valorPerimetro.perimetroCuadrado(4);
			Assert.assertEquals(valorEsperado, perimetroCuadrado);
			
		}
	
}
