package demo.spring.service;

import javax.jws.WebService;
import org.apache.ws.security.handler.WSHandlerConstants;  

@WebService
public interface HelloWorldws {
	String sayHi(String text);

	PersonDto sayPerson(PersonDto pd);

}
