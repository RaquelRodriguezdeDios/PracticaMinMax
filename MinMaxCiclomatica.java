import static org.junit.Assert.*;

import org.junit.Test;

import MinMax.MinMax;

public class MinMaxCiclomatica {

		@Test
		public void ArrayNulo(){
			
			int [] array;
			
			array = null;
			
			assertEquals(MinMax.minMax(array),null);
			
		}	
		
		@Test
		public void ArrayIntroducidoVacio() {
		
			int [] array;
			
			array = new int[0];
			
			assertEquals(MinMax.minMax(array),null);
			
		}	
		
		@Test
		public void ArrayDevuelveMinimoMaximo(){
			
			int [] array;
			int [] resultado;
			
			array = new int[10];
			resultado = new int[2];

			array[0]=2;
			array[1]=3;
			array[2]=7;
			array[3]=6;
			array[4]=9;
			array[5]=1;
			array[6]=0;
			array[7]=4;
			array[8]=5;
			array[9]=8;
			
			
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