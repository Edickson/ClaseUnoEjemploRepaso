/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_ejemplo_repaso;
import java.io.*;
import javax.swing.*;


/**
 *
 * @author Morales Pacherres José Edickson
 * Fecha de Creación : 19.09.2018
 * Curso : EStructura de Datos - Grupo A
 * Tema : ED
 */
public class Tarea_Ejemplo_Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaración de Varibles
        
        int nEst; //Cantidad de Estudiantes
        String lista = "";
        int mayor = 0;
        int menor = 999999;
        double promedio = 0;
        int suma = 0;
        
        JOptionPane.showMessageDialog(null,"Ingerese los datos de los estudiantes");
        nEst = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la CANTIDAD de estudiantes"));
        
        //nEst = nEst-1;
        // Declaración de Arreglos
        
        String nombres[] = new String[nEst];
        int edades[] = new int[nEst];
        int multiplos[] = new int[nEst];
        int posicionMultiplo = 0;
        
        
        lista = lista + "La Lista de los Estudiantes";
        for (int i = 0; i < nEst; i++) {
            
            nombres[i] = (JOptionPane.showInputDialog("Ingrese nombre de Estudiante "+(i+1)+" :"));
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Estudiante N° "+(i+1)+" :"));           
            
            if(edades[i]<menor){
                menor = edades[i];
            }
            
            if(edades[i]>=mayor){
                mayor = edades[i];
            }
            
            if(edades[i] % 7 == 0){
                multiplos[posicionMultiplo] = edades[i];
                posicionMultiplo++;
                
            }
            
            suma = suma+edades[i];
            promedio = suma / nEst;
            
            lista = lista + "\n" + (i+1) + ") " + nombres[i] + "";
            lista = lista + " tiene " + edades[i] + " años";
        }
        
        
        // impresion de datos
        lista = lista + "\n-----------------------";
        lista = lista + "\nDatos Estadísticos : ";
        lista = lista + "\nLa Edad Menor es: " + menor;
        lista = lista + "\nLa Edad Mayor es: " + mayor;
        lista = lista + "\nLa SUMA de las edades es: " + suma;
        lista = lista + "\nEl PROMEDIO de las edades es: " + promedio + "\n ";
        
        if(posicionMultiplo>0){
            lista = lista + "\nLas edades multiplos de 7 son:";
            for(int i = 0; i < posicionMultiplo; i++){
            lista = lista + "\n" + (i+1) + ") " + multiplos[i];
        }
        }
        
        
        JOptionPane.showMessageDialog(null, lista);
        
    }
    
}
