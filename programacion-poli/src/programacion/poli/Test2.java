package programacion.poli;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author general
 */
public class Test2 {
    
    public static int mayor_entre_3(int num1, int num2, int num3)
    {
        int mayor = 0;
        
        if(num1 > num2)
        {
            if(num1 > num3)
            {
                //num1 > num2 y num1 > num3
                mayor = num1;
            }    
            else 
            {
                //num1 > num2 num1 < num3
                mayor = num3;
            }    
        } 
        else
        {
            //num2 > num1
            if(num2 > num3)
            {
                //num2 > num1 y num2 > num3
                mayor = num2;
            }    
            else
            {
                //num2 > num1 y num3 > num2
                mayor = num3;
            }    
        }    
        return mayor;            
    }
    
    public static double promedio_entre_5(int n1, int n2, int n3, int n4, int n5)
    {
        double promedio;
        
        promedio = (n1 + n2 + n3 + n4 + n5) / 5.0;
        
        return promedio;
    }      
    
    public static void main(String[] args)
    {
        System.out.println( mayor_entre_3(15, 12, 9) );
        System.out.println( mayor_entre_3(15, 21, 9) );
        System.out.println( mayor_entre_3(5, 12, 9) );
        System.out.println( mayor_entre_3(3, 4, 9) );
        
        System.out.println( promedio_entre_5(5, 5, 5, 5, 5) );
        System.out.println( promedio_entre_5(5, 3, 2, 1, 5) );
        System.out.println( promedio_entre_5(5, 5, 5, 5, 5) );
    }        
}
