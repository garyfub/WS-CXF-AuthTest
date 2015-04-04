package demo.spring.service;

import java.io.IOException;

import javax.security.auth.callback.*;

import org.apache.ws.security.WSPasswordCallback;

public class ServerPasswordCallback implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];

        if ("joe".equals(pc.getIdentifier())) {
            System.out.println("pc.getPassword() " + pc.getPassword());
            pc.setPassword("password1");
        }
       
    }
}
