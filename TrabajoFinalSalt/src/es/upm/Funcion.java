package es.upm;

import java.util.*;

/**
 * @author Alberto Sánchez 
 *         Antonio San Agustín 
 *         Alberto Campos
 */
public class Funcion {
	private double vLanzamiento;
	private double alturaLanzador;
	private double dispersionAngular;
	private double angulo;
	private Random aleatorio;
	
	
	/**
	 * Constructor de la clase.
	 * @param vLanzamiento Velocidad inicial de cada jugador
	 * @param alturaLanzador Estatura del lanzador
	 * @param dispersionAngular Factor de variacion del angulo 
	 * @param angulo Angulo de lanzamiento con el que intenta lanzar la jabalina
	 */
	public Funcion (double vLanzamiento, double alturaLanzador, double dispersionAngular, double angulo) {    
        if (vLanzamiento <=0| vLanzamiento <= 0| dispersionAngular<=0) throw new IllegalArgumentException("Valores negativos no validos"); //Valores inferiores a cero como valores no validos
        this.vLanzamiento = vLanzamiento;
        this.alturaLanzador = alturaLanzador;
        this.dispersionAngular = dispersionAngular;
        this.angulo = angulo;
        aleatorio = new Random(); //Variable aleatoria que asociaremos a la dispersionAngular.
	}
	
	
	/**
	 * Con esta clase obtenemos el angulo despues de haber aplicado la dispersionAngular.
	 * @return Nos devuelve el angulo con la dispersionAngular.
	 */
	 public double getAngulo() {   
	        double gaussN = aleatorio.nextGaussian();  // Valor aleatorio
	        gaussN *= dispersionAngular/2;   // Escalado de la gaussiana
	        gaussN += angulo;
	        return gaussN;
	        
	       
	 }
	 
	 
	 /**
	  * Obetenemos el velocidad del lanzador
	  * @return velocidad de lanzamiento
	  */
	 public double getVLanzador(){
		 return vLanzamiento;
	 }
	 
	 
	 /**
	  * Obetenemos la altura del lanzador
	  * @return altura del lanzador
	  */
	 public double getAltura(){
		 return alturaLanzador;
	 }
	 
	 
	 /**
	  * Despejando en las ecuaciones del movimiento parabolico el alcance con el dato de altura inicial, 
	  * medimos la distancia de lanzamiento
	  * @param vLanzador Velocidad inicial del lanzador
	  * @param alturaLanzador Altura del lanzador
	  * @return alcance de la jabalina
	  */
	 public double medirAlcance(double vLanzador, double alturaLanzador){
		 double g = 9.80665;
		 double t=0;
		 double t1 = (-vLanzador*Math.sin(getAngulo()) +
				 Math.sqrt( vLanzador*vLanzador*Math.sin(getAngulo())*Math.sin(getAngulo()) + 2*g*alturaLanzador))/
				 (-g);
		 double t2 = (-vLanzador*Math.sin(getAngulo()) -
				 Math.sqrt( vLanzador*vLanzador*Math.sin(getAngulo())*Math.sin(getAngulo()) + 2*g*alturaLanzador))/
				 (-g);
		 if(t1>0){
			 t=t1;
					 }
		 else{
			 t=t2;
					 }
		 
		 return vLanzador*Math.cos(getAngulo())*t;
		 
	 }
	 
	 
	
	 
	 
}

