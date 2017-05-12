import static org.junit.Assert.*;
import org.junit.Test;

import MinMax.MinMax;

public class MinMaxTestCajaNegra {

	@Test
	public void ArrayIntroducidoVacio() {
	
		int [] array;
		
		array = new int[0];
		
		assertEquals(MinMax.minMax(array),null);
		
	}

	@Test
	public void ArrayNulo(){
		
		int [] array;
		
		array = null;
		
		assertEquals(MinMax.minMax(array),null);
		
	}	
	
	@Test
	public void ArrayDevuelveMinimoMaximo(){
		
		int [] array;
		int [] resultado;
		
		array = new int[10];
		resultado = new int[2];

		for(int i=0;i<10;i++){
			
			array[i]=i;
			
		}
		
		resultado[0] = 0;
		
		resultado[1] = 9;
		
		assertEquals(compruebaArray(MinMax.minMax(array),resultado),true);
		
	}
	
	public boolean compruebaArray(int [] array, int [] resultado){
		
		if(array.length!=resultado.length){
			
			return false;
			
		} else {
			
			for(int i=0;i<array.length;i++){
				
				if(array[i]!=resultado[i]){
					
					return false;
					
				}
				
			}
			
		}
		
		return true;
	}
	
}
