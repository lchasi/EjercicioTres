

package ejerciciotres;

import java.util.Scanner;


public class EjercicioTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer = new Scanner(System.in);
      
      
      System.out.println("Ingrese la nota de la conducta en numeros  ");
      int n =leer.nextInt();
      if (n==0) {
      System.out.print("");
      }else if(n<6){
          System.out.println("su conducta es E ");
      }else if(n==6){
          System.out.println("su conducta es D ");
      }else if(n==6.5){
          System.out.println("su conducta es D ");
      }else if(n==7){
          System.out.println("su conducta es C ");
      }else if(n==7.5){
          System.out.println("su conducta es C ");
      }else if(n==8){
          System.out.println("su conducta es B ");
      }else if(n==8.5){
          System.out.println("su conducta es B ");
      }else if(n==9){
          System.out.println("su conducta es A ");
      }else if(n==9.5){
          System.out.println("su conducta es A ");
      }else if(n==10){
          System.out.println("su conducta es A ");
      }else{
          System.out.println("ingreso un valor erroneo ");
          
          
      }
          
      }
      
      
    
    
    
        
        
      
        
    }
    
