package BANK ;

import UI.* ;
import java.net.* ;  
import java.io.* ;    
import java.util.Arrays;
import BANK.* ;
import BasicOP.* ;

public class Server extends client{
    private ServerSocket serverSocket = null;
    private Socket socket = null;
    private Socket socket1 = null;
    private ObjectInputStream inStream = null;
    private ObjectOutputStream outputStream1 = null;
    private ObjectOutputStream outputStream2 = null;
    private ObjectOutputStream outputStream3 = null;
    private ObjectOutputStream outputStream4 = null;
    private ObjectOutputStream outputStream5 = null;
    private ObjectOutputStream outputStream6 = null;
    private ObjectOutputStream outputStream7 = null;
    private ObjectOutputStream outputStream8 = null;
    private ObjectOutputStream outputStream9 = null;
    private ObjectOutputStream outputStream10 = null;
    private ObjectOutputStream outputStream11 = null;
    private ObjectOutputStream outputStream12 = null;
    private ObjectOutputStream outputStream13 = null;
    private ObjectOutputStream outputStream14 = null;
    private ObjectOutputStream outputStream15 = null;

    
    public Server() {
    
    }

    public void communicate() {
    try {
        serverSocket = new ServerSocket(6042);

        while(true){
                socket = serverSocket.accept();
                System.out.println("Connected");
                inStream = new ObjectInputStream(socket.getInputStream());

                client frame_object = (client) inStream.readObject();
//                System.out.println( "Frame Object : "  + frame_object.Account_No);
                DBConnect obj = new DBConnect() ;
                BasicOp basic_op = new BasicOp();
                client output = new client() ;
                client output1 = new client() ;
//                output = frame_object ;
            switch (frame_object.id) {
                case 11:
                    output =  obj.CBIInsert(frame_object) ;
                    outputStream1 = new ObjectOutputStream(socket.getOutputStream());
                    System.out.println( "Frame Object : "  + output.Account_No);
                    outputStream1.writeObject(output);
                    break;
                case 12:
                    output = obj.KANARAInsert(frame_object);
                    outputStream2 = new ObjectOutputStream(socket.getOutputStream());
                    outputStream2.writeObject(output);
                    break;
                case 13:
                    output = obj.ISISIInsert(frame_object) ;
                    outputStream3 = new ObjectOutputStream(socket.getOutputStream());
                    outputStream3.writeObject(output);
                    break;
                case 21:
                    output1 = obj.CBIAccount_No(frame_object.Account_No,frame_object.Pin1 ) ;
                    output.bool = output1.bool ;
                    outputStream4 = new ObjectOutputStream(socket.getOutputStream());
                    System.out.println(" I am Best " + output.Account_No) ;

                    outputStream4.writeObject(output);
                    break;
                case 22:
                    output1 = obj.KANARAccount_No(frame_object.Account_No,frame_object.Pin1 ) ;
                    output.bool = output1.bool ;
                    outputStream5 = new ObjectOutputStream(socket.getOutputStream());
                    System.out.println(" I am Best " + output.Account_No) ;
                    outputStream5.writeObject(output);
                    break;
                case 23:
                    output1 = obj.ISISIAccount_No(frame_object.Account_No,frame_object.Pin1 ) ;
                    output.bool = output1.bool ;
                    outputStream6 = new ObjectOutputStream(socket.getOutputStream());
                    outputStream6.writeObject(output);
                    break;
                case 31:
                    output = obj.CBIReturn_Details(frame_object.Account_No) ;
                    outputStream7 = new ObjectOutputStream(socket.getOutputStream());
                    outputStream7.writeObject(output);
                    break;
                case 32:
                    output = obj.KANARAReturn_Details(frame_object.Account_No);
                    outputStream8 = new ObjectOutputStream(socket.getOutputStream());
                    outputStream8.writeObject(output);
                    break;
                case 33:
                    output = obj.ISISIReturn_Details(frame_object.Account_No);
                    outputStream9 = new ObjectOutputStream(socket.getOutputStream());
                    outputStream9.writeObject(output);
                    break ;
                case 41:
                    output1 = obj.CBIReturnPin(frame_object.Account_No) ;
                    output.Pin1 = output1.Pin1 ;
                    outputStream10 = new ObjectOutputStream(socket.getOutputStream());
                    outputStream10.writeObject(output);
                    break;
                case 42:
                    output1 = obj.KANARAReturnPin(frame_object.Account_No) ;
                    output.Pin1 = output1.Pin1 ;
                    outputStream11 = new ObjectOutputStream(socket.getOutputStream());
                    outputStream11.writeObject(output);
                    break;
                case 43:
                    output1 = obj.ISISIReturnPin(frame_object.Account_No);
                    output.Pin1 = output1.Pin1 ;
                    outputStream12 = new ObjectOutputStream(socket.getOutputStream());
                    outputStream12.writeObject(output);
                    break;
                case 51:
                    obj.CBIUpdate(frame_object.Account_Balance, frame_object.Account_No);
                    break;
                case 52:
                    obj.KANARAUpdate(frame_object.Account_Balance, frame_object.Account_No);
                    break;
                case 53:
                    obj.ISISIUpdate(frame_object.Account_Balance, frame_object.Account_No);
                    break;
                case 61:
                    output1 = obj.CBIgetBalance(frame_object.Account_No) ;
                    output.Account_Balance = output1.Account_Balance ;
                    output.no = output1.no ;
                    outputStream13 = new ObjectOutputStream(socket.getOutputStream());
                    outputStream13.writeObject(output);
                    break;
                case 62:
                    output1 = obj.KANARAgetBalance(frame_object.Account_No);
                    output.Account_Balance = output1.Account_Balance ;
                    output.no = output1.no ;
                    outputStream14 = new ObjectOutputStream(socket.getOutputStream());
                    outputStream14.writeObject(output);
                    break;
                case 63:
                    output1 = obj.ISISIgetBalance(frame_object.Account_No);
                    output.Account_Balance = output1.Account_Balance ;
                    output.no = output1.no ;
                    outputStream15 = new ObjectOutputStream(socket.getOutputStream());
                    outputStream15.writeObject(output);
                    break;
                case 71:
                    basic_op.deposit(frame_object.Account_Balance, frame_object.damount, frame_object.Account_No, frame_object.id );
                    break;
                case 72:
                    basic_op.deposit(frame_object.Account_Balance, frame_object.damount, frame_object.Account_No, frame_object.id );
                    break;
                case 73:
                    basic_op.deposit(frame_object.Account_Balance, frame_object.damount, frame_object.Account_No, frame_object.id);
                    break;
                case 81:
                    basic_op.withdraw(frame_object.Account_Balance, frame_object.wamount, frame_object.Account_No, frame_object.id);
                    break;
                case 82:
                    basic_op.withdraw(frame_object.Account_Balance, frame_object.wamount, frame_object.Account_No, frame_object.id);
                    break;
                case 83:
                    basic_op.withdraw(frame_object.Account_Balance, frame_object.wamount, frame_object.Account_No, frame_object.id);
                    break;
                default:
                    break;
            }
    //            outputStream = new ObjectOutputStream(socket.getOutputStream());
        //	Student student1 = new Student(4, "hijoy");
        //	System.out.println("Object to be written = " + student1.id);
        //	outputStream.writeObject(student1);
        }

    } catch (SocketException se) {System.out.println(se);} 
    catch (IOException e) {} 
    catch (ClassNotFoundException cn) {}
    }

        public static void main(String[] args) {
            System.out.println("mans");
            Server server = new Server();
            server.communicate();
        }
}
