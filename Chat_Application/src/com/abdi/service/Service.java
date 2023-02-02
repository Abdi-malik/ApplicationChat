
package com.abdi.service;

import com.abdi.event.PublicEvent;
import com.abdi.model.Model_User_Account;
import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class Service {

    private static Service instance;
    private Socket client;
    private final int PORT_NUMBER = 9999;
    private final String ip = "localhost";
    private Model_User_Account user;
    
    public static Service getInstance(){
        if(instance == null){
            instance = new Service();
        }
        return instance;
    }
    private Service(){
       
    }
    
    public void startServer(){
        
        
        try {
            client = IO.socket("http://" + ip + ":" + PORT_NUMBER);
            client.on("list_user", new Emitter.Listener() {
                @Override
                public void call(Object... os) {
                   // list user
                   List<Model_User_Account> users = new ArrayList<>();
                   for(Object o : os){
                       Model_User_Account u = new Model_User_Account(o);
                       if(u.getUserID() != user.getUserID()){
                       users.add(u);
                       }
                   }
                    PublicEvent.getInstance().getEventMenu().newUser(users);
                }
            });
            client.open();
        } catch (URISyntaxException e) {
            error(e);
        }
    }
    
     public Socket getClient() {
        return client;
    }
    
         public Model_User_Account getUser() {
        return user;
    }

    public void setUser(Model_User_Account user) {
        this.user = user;
    }
    
    private void error(Exception e){
        System.err.println(e);
    }
}
