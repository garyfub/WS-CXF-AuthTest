
package demo.spring.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the demo.spring.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Person_QNAME = new QName("http://service.spring.demo/", "Person");
    private final static QName _SayHi_QNAME = new QName("http://service.spring.demo/", "sayHi");
    private final static QName _SayPerson_QNAME = new QName("http://service.spring.demo/", "sayPerson");
    private final static QName _SayHiResponse_QNAME = new QName("http://service.spring.demo/", "sayHiResponse");
    private final static QName _SayPersonResponse_QNAME = new QName("http://service.spring.demo/", "sayPersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: demo.spring.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayPerson }
     * 
     */
    public SayPerson createSayPerson() {
        return new SayPerson();
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link SayPersonResponse }
     * 
     */
    public SayPersonResponse createSayPersonResponse() {
        return new SayPersonResponse();
    }

    /**
     * Create an instance of {@link PersonDto }
     * 
     */
    public PersonDto createPersonDto() {
        return new PersonDto();
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.spring.demo/", name = "Person")
    public JAXBElement<PersonDto> createPerson(PersonDto value) {
        return new JAXBElement<PersonDto>(_Person_QNAME, PersonDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.spring.demo/", name = "sayHi")
    public JAXBElement<SayHi> createSayHi(SayHi value) {
        return new JAXBElement<SayHi>(_SayHi_QNAME, SayHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.spring.demo/", name = "sayPerson")
    public JAXBElement<SayPerson> createSayPerson(SayPerson value) {
        return new JAXBElement<SayPerson>(_SayPerson_QNAME, SayPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.spring.demo/", name = "sayHiResponse")
    public JAXBElement<SayHiResponse> createSayHiResponse(SayHiResponse value) {
        return new JAXBElement<SayHiResponse>(_SayHiResponse_QNAME, SayHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.spring.demo/", name = "sayPersonResponse")
    public JAXBElement<SayPersonResponse> createSayPersonResponse(SayPersonResponse value) {
        return new JAXBElement<SayPersonResponse>(_SayPersonResponse_QNAME, SayPersonResponse.class, null, value);
    }

}
