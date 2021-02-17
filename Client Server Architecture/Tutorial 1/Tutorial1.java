/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author ASUS ZenBook
 */
public class Tutorial1 {
    DummyServer server = new DummyServer();
    static String id;
    static String serverName;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = sc.nextLine();
        System.out.println("");
        System.out.print("Enter server name: ");
        serverName = sc.nextLine();
        // TODO code application logic here
        Tutorial1 tutorial1 = new Tutorial1();
        tutorial1.execute();
        
        System.out.println("");
    }
    
    private void execute(){
        server.testConnection();
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:SS");
        String formatedDate = date.format(dateFormatter);
        
        System.out.println("[ " + formatedDate + " ]-Server " + serverName + "  Connection from client" + id + " succeded.");
    }
    
    
    
//    private void  execute(){
//        throw  new UnsupportedOperationException("Not supported yet.");
//    }
}
