/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletesttwo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS ZenBook
 */
public class SimpleClient {
    
    SimpleCalculatorServer server = new SimpleCalculatorServer();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("[CLIENT] - Creating instance of client...");
        SimpleClient simpleClient = new SimpleClient();
//        simpleClient.executeTest();
        simpleClient.execute();
        simpleClient.executeDivision1();
        simpleClient.executeDivision2();
        simpleClient.executeMultiplication();
        simpleClient.executeSubtract();

        
        
    }
    
    
    private void execute(){
        
        System.out.println("[CLIENT] - Testing if server is connected...");
        
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - Server is connected, test can proceed...");
            
            int x = 2;
            int y = 3;
            
            System.out.println("[CLIENT] - Asking the server what is the sum of " + x + " and " + y);
            int z = server.addIntegerNumbers(x, y);
          
            System.out.println("[CLIENT] - The server has replied thet the sum of " + x + " and " + y + " is " + z);
            
            if(z == x + y){
            System.out.println("[CLIENT] - The server has returned  the correct answer");
            }
            else{
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
        }
            else{
            System.out.println("[CLIENT] - Server is Not connected,the test CANNOT proceed...");
        }
    }
        
         private void executeDivision1(){
            
            int x = 4;
            int y = 2;
            
            System.out.println("[CLIENT] - Asking the server what is the ratio of " + x + " and " + y);
      
            int z = 0;
            
            try {
                
                z = server.divideIntegerNumbers(x, y);
                
            } catch (Exception ex) {
                
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("[CLIENT] - The server has replied thet the ratio of " + x + " and " + y + " is " + z);
            
            if(z == x / y){
               
            System.out.println("[CLIENT] - The server has returned  the correct answer");
            }
            else{
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            } 
            /*What happens if you divide two numbers like 4 and 3 ? The result
            is 1, is it true that 4/3 is equal to one ? Where is the problem ? How can
            you solve it ? 
            
            yes. The answer is 1 because result(variable z) is an integer. 
            If we use double for variable z we can get the correct answer.
            */
            
         }
         
         
         private void executeDivision2(){
             
            int x = 4;
            int y = 0;
            
            System.out.println("[CLIENT] - Asking the server what is the ratio of " + x + " and " + y);
      
            int z = 0;
            
            try {
                
              System.out.println("[CLIENT] - Server says that " + x + " / " + y + " is " + server.divideIntegerNumbers(x, y));
              System.out.println("[CLIENT] - This line will not be seen!!!");
                
            } catch (Exception ex) {
                
//                System.out.println("[CLIENT] - Exception Caught !!!");
                  System.out.println("[CLIENT] - Test Completed");
                  Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            
//            if(z == x / y){
//               
//            System.out.println("[CLIENT] - The server has returned  the correct answer");
//            }
//            else{
//                System.out.println("[CLIENT] - The server has returned the WRONG answer");
//            }
            
         }
         
         private void executeMultiplication(){
             
            int x = 4;
            int y = 2;
            
            System.out.println("[CLIENT] - Asking the server what is the multiplication of " + x + " and " + y);
            int z = server.addIntegerNumbers(x, y);
          
            System.out.println("[CLIENT] - The server has replied thet the multiplication of " + x + " and " + y + " is " + z);
            
            if(z == x * y){
            System.out.println("[CLIENT] - The server has returned  the correct answer");
            }
            else{
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
         }
         
         private void executeSubtract(){
             
            int x = 3;
            int y = 2;
            
            System.out.println("[CLIENT] - Asking the server what is the subtraction of " + x + " and " + y);
            int z = server.addIntegerNumbers(x, y);
          
            System.out.println("[CLIENT] - The server has replied thet the subtraction of " + x + " and " + y + " is " + z);
            
            if(z == x - y){
            System.out.println("[CLIENT] - The server has returned  the correct answer");
            }
            else{
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
         }

    private void executeTest(){
        
        System.out.println("[CLIENT] - Testing if server is connected...");
        
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - Server Is connected, test can proceed...");
        }
        
        else{
            System.out.println("[CLIENT] - The Client is Not connected,the test has failed...");
        }
    }
    
}
