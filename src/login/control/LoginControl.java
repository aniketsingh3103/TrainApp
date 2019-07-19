package login.control;

import java.rmi.*;
public interface LoginControl extends Remote{
    
    public boolean getlogin(String name,String password) throws RemoteException;
    public int getTrainInfo(String source,String destination)throws RemoteException;
    //public String getPersonInfo(String name,String tname,int age,int proof);
    
}
