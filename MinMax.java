package MinMax;

public class MinMax{
	
	public static int[] minMax(int[] xs) {
		int mi, ma;
		int[] result = null;
		if(xs != null && xs.length != 0) { //Comprueba si el array es nulo y si su longitud es 0
			mi = ma = xs[0]; //Guarda el valor de xs[0] en el minimo y el maximo
			for (int i = 1; i < xs.length; i++){
				int n = xs[i];
				if(n > ma){
					ma = n;
				} else if (n < mi){
					mi = n;
				}
			}
			result = new int[] {mi,ma};
		}
		return result;
	}
	
}