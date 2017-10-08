/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a2
 */
public class Aritmetica {
    private float a;
    private float b;

    public Aritmetica(float a, float b) {
        this.a = a;
        this.b = b;
    }
   
    
    public float suma(){
        return a+b;
    }
    
    public float resta(){
        return a-b;
    }
    
    public float multiplicacion(){
        return a*b;
    }
    
    public float division(){
        return a/b;
    }
}
