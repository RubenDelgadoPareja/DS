package practica3;
import java.util.Observable;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Simulador extends Observable implements Runnable{
    private float _temperatura;
    
    public float getTemp(){
        return this._temperatura;
    }
    
    public void setTemp(float temp){
        this._temperatura = temp;
        setChanged();
        notifyObservers(temp);
    }
    
    public int getPeticion(){
        Random rand = new Random();
        int np = 0+ ThreadLocalRandom.current().nextInt(0,3);
        
        return np;
        
    }
    
    //Pos aquí va lo de ejecutar y detener la simulación, como en los sims
    //Al ejecutar, se escoge una temperatura al azar entre maximo y minimo
    @Override
    public void run(){
        float min = -20,
              max =  50;
        Random rand = new Random();
        
        this._temperatura = min+rand.nextFloat() * (max-min);
        
        System.out.println("Temperatura actual establecida...");
        
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
        }
        
        
        
    }
    
    
    
    public static void main(String[] args){
        System.out.println("-----INICIO DE LA SIMULACION-----");
        //Declaramos todos los objetos utilizados para realizar la simulacion
        Simulador s = new Simulador();

        System.out.println("Cargando observadores del simulador...");
        graficaTemperatura grafica = new graficaTemperatura();
        pantallaTemperatura pantalla = new pantallaTemperatura();
        botonCambio boton = new botonCambio();
        
        
        //Añadimos todos los observadores al simulador
        System.out.println("Añadiendo observadores al simulador...");
        s.addObserver(grafica);
        s.addObserver(pantalla);
        s.addObserver(boton);
        
        //Pedimos el numero de peticiones a los observadores que se van a realizar a la vez,
        int n_peticiones = 0;
        do{
            System.out.println("Numero de peticiones a realizar en la simulacion: ");
            Scanner in = new Scanner(System.in);
            n_peticiones = in.nextInt();
        }while(n_peticiones <= 0);
        
        //Iniciamos el simulador como una hebra
        System.out.println("\n---COMIENZA LA SIMULACION---\n");
        Thread hebra = new Thread(s);
        hebra.start();
        
        //Se realizan las peticiones escogiendo al azar los observadores: 
        // +) Si sale 0, se mostraría la gráfica (en principio solo la temperatura)
        // +) Si sale 1, se mostraría la pantalla, que mostraría la temperatura actual (un get de toa la vida)
        // +) Si sale 2, se mostraría el boton, el cual haría el get de la temperatura y además daría la opción de 
        //    cambiar la temperatura si se desea. Si es así, se haría un update to wapo
        int n = 0;
        while(n < n_peticiones){
            //Actualizamos el valor de la temperatura de cada observador
            s.setTemp(s.getTemp());
            
            //Obtenemos numero entre [0-2] para ver que peticion se activaria
            int np = s.getPeticion();
            
            if(np == 0){
                System.out.println("Mostrando grafica...");
                //Aquí iría lo de mostrar la gráfica
            }else if(np == 1){
                System.out.println("Estableciendo temperatura actual en pantalla...");
                pantalla.pedirTemp(s);
            }
            else{
                System.out.println("Boton seleccionado, introduzca nueva temperatura: ");
                Scanner in = new Scanner(System.in);
                float nueva_temp = in.nextFloat();
                s.setTemp(nueva_temp);
            }
            
            
            //Mostramos las temperaturas de cada observador para comprobar que está correcto todo
            System.out.println("\n---TEMPERATURAS DE LOS OBSERVADORES---");
            System.out.println("Grafica  -----> " + grafica.getTemp() + "º.");
            System.out.println("Pantalla -----> " + pantalla.getTemp() + "º.");
            System.out.println("Boton    -----> " + boton.getTemp() + "º.");
            
            n++;
        }
        
        System.out.println("\n-----FIN DEL PROGRAMA-----\n");
    }
	
}