package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import login.imp.LoginImp;
public class Server {
    public static void main(String args[]){
        try{
            
            Registry reg=LocateRegistry.createRegistry(1111);
            LoginImp imp=new LoginImp();
            reg.rebind("login", imp);
            System.out.print("Server is ready");
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
