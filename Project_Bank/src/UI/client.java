/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;
//import java.net.Socket;
//import java.net.SocketException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harshavardhan
 */
public class client implements Serializable {
    public Socket socket = null;
    public ObjectInputStream inputStream = null;
    public ObjectOutputStream outputStream = null;
    public DataOutputStream outputint= null;
    public DataInputStream inputint =null;
    public boolean isConnected = false;
    private static final long serialVersionUID = 5950169519310163575L ;
    public String FName  ;
    public String MName ;
    public String LName ;
    public String L1 ;
    public String Dis ;
    public String state ; 
    public String Dob1 ;
    public String MID;   
    public long Number ;
    public int PIN ;
    public String city ;
    public int var;
    public int Account_Balance ;
    public int Account_No ;
    public int Pin1 ;
    public int wamount;
    public int damount;
    public long Debit_No ;
    public String Address1 ;
    public int LAmt;
    public int LTime;
    public int var1 ;
    public int id;
    public boolean bool;
    public int no;
//    public client() {
//    while (!isConnected) {
//    try {
//        socket = new Socket("192.168.43.107", 5567);
//        System.out.println("Connected");
//        isConnected = true;
//        //outputStream = new ObjectOutputStream(socket.getOutputStream());
//        //Student student = new Student(1, "Bijoy");
//        //outputStream.writeObject(student);
//    } 
//    catch (SocketException se) {
//        System.out.println("Socket Exception Error : " + se) ;
////        se.printStackTrace();
//// System.exit(0);
//    } 
//    catch (IOException e) {
//        System.out.println("IO Exception Error : " + e) ;
//        e.printStackTrace();
//    }
//    
//    }
//}
//    public int sendobjectinsert(client ob){
//        client f = new client() ;
//        try{
//            outputStream = new ObjectOutputStream(socket.getOutputStream());
//        } 
//      catch (SocketException se) {
//        se.printStackTrace();
//        // System.exit(0);
//    } 
//    catch (IOException e) {
//        e.printStackTrace();
//    }
//        try {
//            outputStream.writeObject(ob);
//            
//            outputStream.close();
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try{
//            inputStream=new ObjectInputStream(socket.getInputStream());
//        }
//        catch (SocketException se) {
//        se.printStackTrace();
//        // System.exit(0);
//    } 
//    catch (IOException e) {
//        e.printStackTrace();
//    }
//        try {
//            f = (client) inputStream.readObject();
//            inputStream.close();
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       
//        try {
//            socket.close();
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//     return f.Account_No;   
//     }
//    
//public int sendobjectreturnpin(client ob){
//        client f = new client();
//        try{
//            outputStream = new ObjectOutputStream(socket.getOutputStream());
//        } 
//      catch (SocketException se) {
//        se.printStackTrace();
//        // System.exit(0);
//    } 
//    catch (IOException e) {
//        e.printStackTrace();
//    }
//        try {
//            outputStream.writeObject(ob);
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try{
//            inputStream=new ObjectInputStream(socket.getInputStream());
//        }
//        catch (SocketException se) {
//        se.printStackTrace();
//        // System.exit(0);
//    } 
//    catch (IOException e) {
//        e.printStackTrace();
//    }
//        try {
//            f= (client) inputStream.readObject();
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       if (f.no == 0){
//           return 0;
//       }
//        try {
//            socket.close();
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       return f.PIN;
//        
//     }
//
//public int sendobjectreturnaccountbalance(client ob){
//        client f = new client();
//        System.out.println(ob.Account_No);
//        try{
//            outputStream = new ObjectOutputStream(socket.getOutputStream());
//        } 
//      catch (SocketException se) {
//        se.printStackTrace();
//        // System.exit(0);
//    } 
//    catch (IOException e) {
//        e.printStackTrace();
//    }
//        try {
//        outputStream.writeObject(ob);
//        outputStream.close();
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try{
//        inputStream=new ObjectInputStream(socket.getInputStream());
//        }
//        catch (SocketException se) {
//        se.printStackTrace();
//        // System.exit(0);
//    } 
//    catch (IOException e) {
//        e.printStackTrace();
//    }
//        try {
//            f= (client) inputStream.readObject();
//            inputStream.close();
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//         try {
//            socket.close();
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       return f.Account_Balance;
//        
//     }
//
//
//
//public void sendobjectreturnnothing(client ob){
//        client f = new client();
//        try{
//            outputStream = new ObjectOutputStream(socket.getOutputStream());
//        } 
//      catch (SocketException se) {
//        se.printStackTrace();
//        // System.exit(0);
//    } 
//    catch (IOException e) {
//        e.printStackTrace();
//    }
//        try {
//            outputStream.writeObject(ob);
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//         try {
//            socket.close();
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    
//     }
//
//public boolean sendobjectreturnbool(client ob){
//       client f = new client();
//        try{
//            outputStream = new ObjectOutputStream(socket.getOutputStream());
//        } 
//      catch (SocketException se) {
//        se.printStackTrace();
//        // System.exit(0);
//    } 
//    catch (IOException e) {
//        e.printStackTrace();
//    }
//        try {
//            outputStream.writeObject(ob);
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try{
//            inputStream=new ObjectInputStream(socket.getInputStream());
//        }
//        catch (SocketException se) {
//        se.printStackTrace();
//        // System.exit(0);
//    } 
//    catch (IOException e) {
//        e.printStackTrace();
//    }
//        try {
//            f= (client) inputStream.readObject();
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//         try {
//            socket.close();
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       return f.bool;
//    
//     }
//
//
//    public client sendobjectreturnobject(client ob){
//        client f = new client();
//        try{
//            outputStream = new ObjectOutputStream(socket.getOutputStream());
//        } 
//      catch (SocketException se) {
//        se.printStackTrace();
//        // System.exit(0);
//    } 
//    catch (IOException e) {
//        e.printStackTrace();
//    }
//        try {
//            outputStream.writeObject(ob);
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try{
//            inputStream=new ObjectInputStream(socket.getInputStream());
//        }
//        catch (SocketException se) {
//        se.printStackTrace();
//        // System.exit(0);
//    } 
//    catch (IOException e) {
//        e.printStackTrace();
//    }
//        try {
//            f= (client) inputStream.readObject();
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//         try {
//            socket.close();
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       return f;
//        
//     }

}
