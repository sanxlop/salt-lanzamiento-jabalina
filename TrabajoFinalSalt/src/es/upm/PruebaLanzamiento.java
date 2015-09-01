package es.upm;

/**
 * @author Alberto Sánchez 
 *         Antonio San Agustín 
 *         Alberto Campos
 */
public class PruebaLanzamiento {

public static void main(String[] args) throws Exception{
		
	Lanzamiento lanzamiento = new Lanzamiento();
		
		System.out.println("En esta competicion participan 8 lanzadores de los que nos consta el siguiente porcentaje de exito:");
		
		System.out.println("");
		lanzamiento.lanzar1000();
		Thread.sleep(5000);
		/*		
		System.out.println("");
		System.out.println("La competicion de lanzamiento de jabalina va a comenzar");
		System.out.println("");
		Thread.sleep(1000);
		System.out.print("3, ");Thread.sleep(1000);System.out.print("2, ");
		Thread.sleep(1000);System.out.print("1 ");Thread.sleep(500);System.out.print(".");
		Thread.sleep(500);System.out.print(".");Thread.sleep(500);System.out.print(".");
		Thread.sleep(1000);
		System.out.println("");
*/	
		
		System.out.println("");
        lanzamiento.getAlcances();
        


	}
}

	

