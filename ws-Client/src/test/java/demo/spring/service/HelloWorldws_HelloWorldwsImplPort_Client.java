
package demo.spring.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.helpers.FileUtils;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.apache.cxf.ws.rm.Proxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.junit.Test;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2015-04-04T14:34:37.071+08:00
 * Generated source version: 2.7.11
 * 
 */
public final class HelloWorldws_HelloWorldwsImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.spring.demo/", "HelloWorldwsImplService");

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = HelloWorldwsImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        HelloWorldwsImplService ss = new HelloWorldwsImplService(wsdlURL, SERVICE_NAME);
        HelloWorldws port = ss.getHelloWorldwsImplPort();  
        Map<String, Object> ctx = ((BindingProvider)port).getRequestContext();
//        ctx.put("ws-security.username", "joe");
//        ctx.put("ws-security.password", "password");
        ctx.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
        ctx.put(WSHandlerConstants.USER, "joe");
        ctx.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        ctx.put(WSHandlerConstants.PW_CALLBACK_CLASS, ClientUsernamePasswordHandler.class.getName() );
        WSS4JOutInterceptor wss4JOutInterceptor = new WSS4JOutInterceptor(ctx);
        
        
//        JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();    
//        bean.getInInterceptors().add(new LoggingInInterceptor());    
//        bean.getInFaultInterceptors().add(new LoggingOutInterceptor());   
//        bean.setServiceClass(HelloWorldwsImplService.class);  
//        bean.setAddress("http://192.168.0.102:8080/cxfWSTest/services/HelloWorld");   
//        HelloWorldwsImplService helloWorldService = (HelloWorldwsImplService)bean.create();  
//        ClientProxy clientProxy = (ClientProxy)Proxy.getInvocationHandler(passportService);  
//        Client client = clientProxy.getClient();  
//        client.getOutInterceptors().add(new WSS4JOutInterceptor(outProps));//配置拦截器  
        //return helloWorldService;  
        
        {
        System.out.println("Invoking sayHi...");
        java.lang.String _sayHi_arg0 = "_sayHi_arg0-1049831904";
        java.lang.String _sayHi__return = port.sayHi(_sayHi_arg0);
        System.out.println("sayHi.result=" + _sayHi__return);


        }
//        {
//        System.out.println("Invoking sayPerson...");
//        demo.spring.service.PersonDto _sayPerson_arg0 = new demo.spring.service.PersonDto();
//        _sayPerson_arg0.setAge(Integer.valueOf(525450003));
//        _sayPerson_arg0.setName("Name-1292651063");
//        demo.spring.service.PersonDto _sayPerson__return = port.sayPerson(_sayPerson_arg0);
//        System.out.println("sayPerson.result=" + _sayPerson__return);
//
//
//        }

        System.exit(0);
    }
    
    
    @Test
    public void testList() {  
        System.out.println("Test started");
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();  
        factoryBean.setAddress("http://localhost:8080/ws-Server/services/HelloWorld");  
        factoryBean.setServiceClass(HelloWorldws.class);  
        Object obj = factoryBean.create();  
          
        Client client = ClientProxy.getClient(obj);  
        Endpoint endpoint = client.getEndpoint();  
          
        Map<String,Object> props = new HashMap<String,Object>();  
        props.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);  
        props.put(WSHandlerConstants.USER, "admin");  
        props.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);  
        props.put(WSHandlerConstants.PW_CALLBACK_CLASS, ClientUsernamePasswordHandler.class.getName());  
        WSS4JOutInterceptor wss4JOutInterceptor = new WSS4JOutInterceptor(props);  
        endpoint.getOutInterceptors().add(wss4JOutInterceptor);  
          
//        HTTPConduit conduit = (HTTPConduit) client.getConduit();  
//        HTTPClientPolicy policy = new HTTPClientPolicy();  
//        policy.setConnectionTimeout(5 * 1000);  
//        policy.setReceiveTimeout(5 * 1000);  
//        conduit.setClient(policy);  
          
        HelloWorldws service = (HelloWorldws) obj;  
        try {  
        	String tmp = service.sayHi(new Date().toString() );
        	System.out.println(tmp);
        } catch(Exception e) {  
            if (e instanceof WebServiceException   
                    && e.getCause() instanceof SocketTimeoutException) {  
                System.err.println("This is timeout exception.");  
            } else {  
                e.printStackTrace();  
            }  
        }  
    }  
    
    
    @Test
    public void testLoop() throws FileNotFoundException{
    	PrintWriter out = new PrintWriter("filename.txt");
    	for(int i=0; i< 65535; i++){
    		//System.out.println("public String sayHi" + i + "(String text){return \"hi\" + text;}");
    		out.println("public String sayHi" + i + "(String text){return \"hi\" + text;}");
    	}
    }

}
