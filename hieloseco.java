
package cclases;
import java.util.Scanner;
public class hieloseco {
    
    Scanner Leer = new Scanner(System.in);
    private String nombre;
    private int tipo;
    private int cantidadhojas;
    private double preciounidad;
    private double preciofinal;
    private double precioneto;
    private double porcentaje;
    
    
    public void acepta_datos(){
        System.out.println("Indique el nombre del cliente");
        this.nombre = Leer.nextLine();
        System.out.println("Que tipo de cliente es "+nombre+"?");
        this.tipo = Leer.nextInt();
        System.out.println("\nCuantas hojas compro?");
        this.cantidadhojas = Leer.nextInt();
        System.out.println("A que precio se vendieron las hojas?");
        this.preciounidad = Leer.nextDouble();
    }
    
    public void operaciones(){
        if (this.tipo == 1) {
            this.precioneto = cantidadhojas * preciounidad;
            this.porcentaje = .05 * ((double) cantidadhojas) * preciounidad;
            this.preciofinal = ((double) cantidadhojas * preciounidad) - porcentaje;
        }
            else
                if (this.tipo == 2) {
                this.precioneto = cantidadhojas * preciounidad;
                this.porcentaje = .08 * ((double) cantidadhojas) * preciounidad;
                this.preciofinal = ((double) cantidadhojas * preciounidad) - porcentaje;
                }
                    else
                        if (this.tipo == 3) {
                        this.precioneto = cantidadhojas * preciounidad;
                        this.porcentaje = .12 * ((double) cantidadhojas) * preciounidad;
                        this.preciofinal = ((double) cantidadhojas * preciounidad) - porcentaje;
                        }
                            else
                                if (this.tipo == 4) {
                                this.precioneto = cantidadhojas * preciounidad;
                                this.porcentaje = .15 * ((double) cantidadhojas) * preciounidad;
                                this.preciofinal = ((double) cantidadhojas * preciounidad) - porcentaje;                              
                                }
        }
    
    public void despliegue(){
        System.out.println("El cliente "+nombre+" compro una catidad de "+cantidadhojas+
                " a un precio de "+preciounidad+" cada una, siendo un total de "+precioneto);
        System.out.println("Al ser un cliente tipo "+tipo+" la cantidad descontada de su producto es "+porcentaje+
                " dando como resultado "+preciofinal);
    }
    
    
    
    
    
    
    
    
    
    
    
    }

