package login.imp;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import login.control.LoginControl;

/**
 *
 * @author Aniket
 */
public class LoginImp extends UnicastRemoteObject implements LoginControl{
    
    private String[] sourcelist={"delhi","goa","mumbai","chennai","punjab"};
    private String[] destinationlist={"delhi","goa","mumbai","chennai","punjab"};

    public LoginImp()throws RemoteException{}
    public boolean getlogin(String name, String password) throws RemoteException {
        boolean check=false;
        
     try{
         if(name.equals("admin")&&password.equals("1234")){
             return check=true;
         }else{
             return check=false;
         }
    
     }catch(Exception e){ e.printStackTrace(); }
      return check;
    }

   
  
    public int getTrainInfo(String source, String destination)throws RemoteException {
        int s=0,d=0;
       for(int i=1;i<sourcelist.length;i++){
           if(sourcelist[i].equals(source)){
               s=i;
           }
           if(destinationlist[i].equals(destination)){
               d=i;
           }
       }     
        
      // if((s!=0)&&(d!=0)){
          int amount=(s-d)*100;
        if(amount<0){amount=-1*amount;}
        
        return amount; 
        
       //}else{
         //  return -1;
       //}
    }

    /*@Override
    public String getPersonInfo(String name, String tname, int age, int proof) {
        
     return null;   
    }*/
    
}
