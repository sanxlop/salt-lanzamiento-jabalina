package es.upm;


/**
 * @author Alberto Sánchez 
 *         Antonio San Agustín 
 *         Alberto Campos
 */
public class Lanzamiento {
	
	//Se crean los lanzadores con son respectivas variables para calculos posteriores
	//Añadir Lanzadores
    Lanzador1 lanzador1 = new Lanzador1();
    Lanzador2 lanzador2 = new Lanzador2();
    Lanzador3 lanzador3 = new Lanzador3();
    Lanzador4 lanzador4 = new Lanzador4();
    Lanzador5 lanzador5 = new Lanzador5();
    Lanzador6 lanzador6 = new Lanzador6();
    Lanzador7 lanzador7 = new Lanzador7();
    Lanzador8 lanzador8 = new Lanzador8();
    
    double aLanzador1 = 0;
    double aLanzador2 = 0;
    double aLanzador3 = 0;
    double aLanzador4 = 0;
    double aLanzador5 = 0;
    double aLanzador6 = 0;
    double aLanzador7 = 0;
    double aLanzador8 = 0;
    
    double contador1 = 0;
    double contador2 = 0;
    double contador3 = 0;
    double contador4 = 0;
    double contador5 = 0;
    double contador6 = 0;
    double contador7 = 0;
    double contador8 = 0;
    
    
    /**
     * Este metodo se encarga de redondear a 2 decimales
     * @param numero Numero que queremos redondear
     * @return
     */
    public double Redondear(double numero){
           return Math.rint(numero*100)/100;
    }
    
    
    /**
     * Este metodo se encarga de imprimir por pantalla los alcances de cada lanzador
     * ademas de el jugador que ha hecho el mejor lanzamiento
     * @throws InterruptedException 
     */
    public void getAlcances() throws InterruptedException{
    	
    	double mayorDistancia = 0;
    	double segundo=0;
    	double tercero=0;
    	//Se inicia el lanzamiento y aportamos las distancias de tiro
    	//Añadir Lanzadores
    	
    	aLanzador1 = lanzador1.medirAlcance(lanzador1.getVLanzador(), lanzador1.getAltura());
    	if(aLanzador1>60.0){
    	System.out.println("Vitezslay Vesely: " + Redondear(aLanzador1) + " m");}
    	else{System.out.println("Vitezslay Vesely: " + "Nulo" );}
    	Thread.sleep(1000);
    	
    	aLanzador2 = lanzador2.medirAlcance(lanzador2.getVLanzador(), lanzador2.getAltura());
    	if(aLanzador2>60.0){
    	System.out.println("Tero Pitkamaki: " + Redondear(aLanzador2) + " m");}
    	else{System.out.println("Tero Pitkamaki: " + "Nulo" );}
    	Thread.sleep(1000);
    
    
    	
    	 
    	aLanzador3 = lanzador3.medirAlcance(lanzador3.getVLanzador(), lanzador3.getAltura());
    	if(aLanzador3>60.0){
    	System.out.println("Dmitri Tarabin: " + Redondear(aLanzador3) + " m");}
    	else{System.out.println("Dmitri Tarabin: " + "Nulo" );}
    	Thread.sleep(1000);
    
    	aLanzador4 = lanzador4.medirAlcance(lanzador4.getVLanzador(), lanzador4.getAltura());
    	if(aLanzador4>60.0){
    	System.out.println("Julius Yego: " + Redondear(aLanzador4) + " m");}
    	else{System.out.println("Julius Yego: " + "Nulo" );}
    	Thread.sleep(1000);
    	
    
	
    	aLanzador5 = lanzador5.medirAlcance(lanzador5.getVLanzador(), lanzador5.getAltura());
    	if(aLanzador5>60.0){
    	System.out.println("Roman Avramenko: " + Redondear(aLanzador5) + " m");}
    	else{System.out.println("Roman Avramenko: " + "Nulo" );}
    	Thread.sleep(1000);
    
    	aLanzador6 = lanzador6.medirAlcance(lanzador6.getVLanzador(), lanzador6.getAltura());
    	if(aLanzador6>60.0){
    	System.out.println("Antti Ruuskanen: " + Redondear(aLanzador6) + " m");}
    	else{System.out.println("Antti Ruuskanen: " + "Nulo" );}
    	Thread.sleep(1000);
    	
    	aLanzador7 = lanzador7.medirAlcance(lanzador7.getVLanzador(), lanzador7.getAltura());
    	if(aLanzador7>60.0){
    	System.out.println("Andreas Thorkildsen: " + Redondear(aLanzador7) + " m");}
    	else{System.out.println("Andreas Thorkildsen: " + "Nulo" );}
    	Thread.sleep(1000);
    	
    	aLanzador8 = lanzador8.medirAlcance(lanzador8.getVLanzador(), lanzador8.getAltura());
    	if(aLanzador8>60.0){
    	System.out.println("Ihab Abdelrahman El Sayed: " + Redondear(aLanzador8) + " m");}
    	else{System.out.println("Ihab Abdelrahman El Sayed: " + "Nulo" );}
    	Thread.sleep(1000);
    	
    
    	
		double [] alcances = {aLanzador1, aLanzador2, aLanzador3, 
				aLanzador4, aLanzador5, aLanzador6
				, aLanzador7, aLanzador8}; //Array que contiene las distancias de lanzamiento
		
		//Elige el mayor alcance del array 
		
		int izquierda=1;
		int derecha=alcances.length;
		
		do{
		for(int i=alcances.length-1;i>0;i--){
			if(alcances[i-1]>alcances[i]){
				double aux=alcances[i];
				alcances[i]=alcances[i-1];
				alcances[i-1]=aux;
				
			}
		}
		izquierda=izquierda+1;
		for(int j=1;j<alcances.length;j++){
			if(alcances[j-1]>alcances[j]){
				double a=alcances[j];
				alcances[j]=alcances[j-1];
				alcances[j-1]=a;
		
			}
			
		}
	    derecha = derecha-1;
	    }while(derecha >= izquierda);
	 
	    for(int i=alcances.length-1;i>0;i--){
	    	mayorDistancia=alcances[7];
	        segundo=alcances[6];
	        tercero=alcances[5];
	    
	    }
		
	   
		System.out.println("");
		
		//Elegimos el vencedor
    	if(aLanzador1 == mayorDistancia){
    		System.out.println("Vitezslay Vesely ha conseguido la medalla de oro con una distancia de: " + Redondear(aLanzador1) + " m");
    	}
    	if(aLanzador1 == segundo){
    		System.out.println("Vitezslay Vesely ha conseguido la medalla de plata con una distancia de: " + Redondear(aLanzador1) + " m");
    	}
    	if(aLanzador1 == tercero){
    		System.out.println("Vitezslay Vesely ha conseguido la medalla de bronce con una distancia de: " + Redondear(aLanzador1) + " m");
    	}
    	
    	if(aLanzador2 == mayorDistancia){
    		System.out.println("Tero Pitkamaki ha conseguido la medalla de oro con una distancia de: " + Redondear(aLanzador2) + " m");
    	}
    	if(aLanzador2 == segundo){
    		System.out.println("Tero Pitkamaki ha conseguido la medalla de plata con una distancia de: " + Redondear(aLanzador2) + " m");
    	}
    	if(aLanzador2 == tercero){
    		System.out.println("Tero Pitkamaki ha conseguido la medalla de bronce con una distancia de: " + Redondear(aLanzador2) + " m");
    	}
    	if(aLanzador3 == segundo){
    		System.out.println("Dmitri Tarabin ha conseguido la medalla de plata con una distancia de: " + Redondear(aLanzador2) + " m");
    	}
    	if(aLanzador3 == mayorDistancia){
    		System.out.println("Dmitri Tarabin ha conseguido la medalla de oro con una distancia de: " + Redondear(aLanzador3) + " m");
    	}
    	if(aLanzador3 == tercero){
    		System.out.println("Dmitri Tarabin ha conseguido la medalla de bronce con una distancia de: " + Redondear(aLanzador2) + " m");
    	}
    	if(aLanzador4 == mayorDistancia){
    		System.out.println("Julius Yego ha conseguido la medalla de oro con una distancia de: " + Redondear(aLanzador4) + " m");
    	}
    	if(aLanzador4 == segundo){
    		System.out.println("Julius Yego ha conseguido la medalla de plata con una distancia de: " + Redondear(aLanzador4) + " m");
    	}
    	if(aLanzador4 == tercero){
    		System.out.println("Julius Yego ha conseguido la medalla de bronce con una distancia de: " + Redondear(aLanzador4) + " m");
    	}
    	
    	if(aLanzador5 == mayorDistancia){
    		System.out.println("Roman Avramenko ha conseguido la medalla de oro con una distancia de: " + Redondear(aLanzador5) + " m");
    	}
    	if(aLanzador5 == segundo){
    		System.out.println("Roman Avramenko ha conseguido la medalla de plata con una distancia de: " + Redondear(aLanzador5) + " m");
    	}
    	if(aLanzador5 == tercero){
    		System.out.println("Roman Avramenko ha conseguido la medalla de bronce con una distancia de: " + Redondear(aLanzador5) + " m");
    	}
    	if(aLanzador6 == mayorDistancia){
    		System.out.println("Antti Ruuskanen ha ha conseguido la medalla de oro con una distancia de: " + Redondear(aLanzador6) + " m");
    	}
    	if(aLanzador6 == segundo){
    		System.out.println("Antti Ruuskanen ha ha conseguido la medalla de plata con una distancia de: " + Redondear(aLanzador6) + " m");
    	}
    	if(aLanzador6 == tercero){
    		System.out.println("Antti Ruuskanen ha ha conseguido la medalla de bronce con una distancia de: " + Redondear(aLanzador6) + " m");
    	}
    	if(aLanzador7 == mayorDistancia){
    		System.out.println("Andreas Thorkildsen ha conseguido la medalla de oro con una distancia de: " + Redondear(aLanzador7) + " m");
    	}
    	if(aLanzador7 == segundo){
    		System.out.println("Andreas Thorkildsen ha conseguido la medalla de plata con una distancia de: " + Redondear(aLanzador7) + " m");
    	}
    	if(aLanzador7 == tercero){
    		System.out.println("Andreas Thorkildsen ha conseguido la medalla de bronce con una distancia de: " + Redondear(aLanzador7) + " m");
    	}
    	if(aLanzador8 == mayorDistancia){
    		System.out.println("Ihab Abdelrahman El Sayed ha conseguido la medalla de oro con una distancia de: " + Redondear(aLanzador8) + " m");
    	}
    	if(aLanzador8 == segundo){
    		System.out.println("Ihab Abdelrahman El Sayed ha conseguido la medalla de plata con una distancia de: " + Redondear(aLanzador8) + " m");
    	}
    	if(aLanzador8 == tercero){
    		System.out.println("Ihab Abdelrahman El Sayed ha conseguido la medalla de bronce con una distancia de: " + Redondear(aLanzador8) + " m");
    	}
    	
    }
    
    /**
     * Este metodo junto con lanzar1000 se encarga de calcular el porcentaje de 
     * victorias entre los jugadores, en particular, añade el numero de victorias a un
     * contador para que luego con el metodo lanzar1000 podamos ejecutarlo las veces 
     * que queramos y calcular asi el porcentaje que tienen los lanzadores de vencer
     */
    public void getVencedores(){
    	
    	double mayorDistancia = 0;

    	aLanzador1 = lanzador1.medirAlcance(lanzador1.getVLanzador(), lanzador1.getAltura());
    	aLanzador2 = lanzador2.medirAlcance(lanzador2.getVLanzador(), lanzador2.getAltura());
    	aLanzador3 = lanzador3.medirAlcance(lanzador3.getVLanzador(), lanzador3.getAltura());
    	aLanzador4 = lanzador4.medirAlcance(lanzador4.getVLanzador(), lanzador4.getAltura());
    	aLanzador5 = lanzador5.medirAlcance(lanzador5.getVLanzador(), lanzador5.getAltura());
    	aLanzador6 = lanzador6.medirAlcance(lanzador6.getVLanzador(), lanzador6.getAltura());
    	aLanzador7 = lanzador7.medirAlcance(lanzador7.getVLanzador(), lanzador7.getAltura());
    	aLanzador8 = lanzador8.medirAlcance(lanzador8.getVLanzador(), lanzador8.getAltura());

		double [] alcances = {aLanzador1, aLanzador2, aLanzador3, 
				aLanzador4, aLanzador5, aLanzador6
				, aLanzador7, aLanzador8}; //Array que contiene las distancias de lanzamiento
		
		//Elige el mayor alcance del array 
		for (int i=0; i<alcances.length; i++){
			
			if(alcances[i] > mayorDistancia){
			mayorDistancia = alcances[i];
		    }
		}
    	
		//Añadimos victoria a su respectivo contador
    	if(aLanzador1 == mayorDistancia){
    		contador1++;
    	}
    	if(aLanzador2 == mayorDistancia){
    		contador2++;
    	}
    	if(aLanzador3 == mayorDistancia){
    		contador3++;
    	}
    	if(aLanzador4 == mayorDistancia){
    		contador4++;
    	}
    	if(aLanzador5 == mayorDistancia){
    		contador5++;
    	}
    	if(aLanzador6 == mayorDistancia){
    		contador6++;
    	}
    	if(aLanzador7 == mayorDistancia){
    		contador7++;
    	}
    	if(aLanzador8 == mayorDistancia){
    		contador8++;
    	}
    }
    
    /*
    /**
     * Ejecutamos el metodo getVencedores tantas veces como queramos, 
     * en este caso 1000, para calcular la probabilidad en porcentaje de 
     * vencer sobre los demas
     */
    public void lanzar1000(){
    	for (int i=0; i<1000; i++){
	    	getVencedores();
	    }
	  System.out.println("Vitezslay Vesely: " + Redondear((contador1/1000)*100) + "% (opciones de ganar)");
	  System.out.println("Tero Pitkamaki: " + Redondear((contador2/1000)*100) + "% (opciones de ganar)");
	  System.out.println("Dmitri Tarabin: " + Redondear((contador3/1000)*100) + "% (opciones de ganar)");
	  System.out.println("Julius Yego: " + Redondear((contador4/1000)*100) + "% (opciones de ganar)");
	  System.out.println("Roman Avramenko: " + Redondear((contador5/1000)*100) + "% (opciones de ganar)");
	  System.out.println("Antti Ruuskanen: " + Redondear((contador6/1000)*100) + "% (opciones de ganar)");
	  System.out.println("Andreas Thorkildsen: " + Redondear((contador7/1000)*100) + "% (opciones de ganar)");
	  System.out.println("Ihab Abdelrahman El Sayed: " + Redondear((contador8/1000)*100) + "% (opciones de ganar)");
	  
    }

    
}

