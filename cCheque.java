package cclases;
import java.util.Scanner;
//Montes De Oca Rueda Hellen Sherley
public class cCheque {
    
Scanner Leer=new Scanner (System.in);
    private String nombre;
    private int tipo;
    private int horas;
    private int sueldo;
    
    public void aceptaDatos(){
        System.out.println("Indique el nombre del empleado");
        this.nombre = Leer.nextLine();
        System.out.println("Que tipo de empleado es "+nombre+"? Opciones: 1,2,3,4");
        this.tipo = Leer.nextInt();
        System.out.println("Cuantas horas trabajo?");
        this.horas=Leer.nextInt();
    }
    public void calculaSueldo(){
        if(this.tipo==1){
            this.sueldo=horas*1000;
        }
        else 
            if(this.tipo==2){
            this.sueldo=horas*1500;
            }
           else
                if (this.tipo==3){
                this.sueldo=horas*2000;    
                }
                else{
                    this.sueldo=horas*4000;
                } 
                    
    }
    public void despliegaDatos(){
        System.out.println("Cheque del trabajador "+ nombre + ":");
        System.out.println("Horas trabajadas: "+horas);
        System.out.println("Pertenece al tipo de trabajador: "+tipo);
        System.out.println("Su sueldo es de: "+sueldo);
    }
    
}


