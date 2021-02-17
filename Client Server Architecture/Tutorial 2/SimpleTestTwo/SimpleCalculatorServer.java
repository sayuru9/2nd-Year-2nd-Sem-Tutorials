/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletesttwo;

/**
 *
 * @author ASUS ZenBook
 */
public class SimpleCalculatorServer {
    
    public boolean isServerConnected(){
        System.out.println("[SERVER] - Connection is being tested...");
        return true;
    }
    
    public int addIntegerNumbers(int a,int b){
        System.out.println("[SERVER] - Aadding " + a + " and " + b);
        return a + b;
    }
    
    public int divideIntegerNumbers(int a, int b) throws Exception{
        
        if(b == 0){
            throw new Exception();
        }
        
        if((b == 0) && (a == 0)){
            throw new Exception();
        } 
        System.out.println("[SERVER] - Dividing " + a + " and " + b + "...");
        return a/b;
    }
    
    public int subtractIntegerNumbers(int a,int b){
        System.out.println("[SERVER] - Subtracting " + a + " and " + b);
        return a - b;
    }
    
    public int multiplyIntegerNumbers(int a,int b){
        System.out.println("[SERVER] - Multiplying " + a + " and " + b);
        return a * b;
    }
}
