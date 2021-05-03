
package com.catstat.ai108;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.catstat.ai108 package. 
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

    private final static QName _GetNbUser_QNAME = new QName("http://ai108.catstat.com", "getNbUser");
    private final static QName _GetNbCatResponse_QNAME = new QName("http://ai108.catstat.com", "getNbCatResponse");
    private final static QName _GetNbUserResponse_QNAME = new QName("http://ai108.catstat.com", "getNbUserResponse");
    private final static QName _GetNbCat_QNAME = new QName("http://ai108.catstat.com", "getNbCat");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.catstat.ai108
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNbCat }
     * 
     */
    public GetNbCat createGetNbCat() {
        return new GetNbCat();
    }

    /**
     * Create an instance of {@link GetNbUser }
     * 
     */
    public GetNbUser createGetNbUser() {
        return new GetNbUser();
    }

    /**
     * Create an instance of {@link GetNbCatResponse }
     * 
     */
    public GetNbCatResponse createGetNbCatResponse() {
        return new GetNbCatResponse();
    }

    /**
     * Create an instance of {@link GetNbUserResponse }
     * 
     */
    public GetNbUserResponse createGetNbUserResponse() {
        return new GetNbUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNbUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ai108.catstat.com", name = "getNbUser")
    public JAXBElement<GetNbUser> createGetNbUser(GetNbUser value) {
        return new JAXBElement<GetNbUser>(_GetNbUser_QNAME, GetNbUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNbCatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ai108.catstat.com", name = "getNbCatResponse")
    public JAXBElement<GetNbCatResponse> createGetNbCatResponse(GetNbCatResponse value) {
        return new JAXBElement<GetNbCatResponse>(_GetNbCatResponse_QNAME, GetNbCatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNbUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ai108.catstat.com", name = "getNbUserResponse")
    public JAXBElement<GetNbUserResponse> createGetNbUserResponse(GetNbUserResponse value) {
        return new JAXBElement<GetNbUserResponse>(_GetNbUserResponse_QNAME, GetNbUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNbCat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ai108.catstat.com", name = "getNbCat")
    public JAXBElement<GetNbCat> createGetNbCat(GetNbCat value) {
        return new JAXBElement<GetNbCat>(_GetNbCat_QNAME, GetNbCat.class, null, value);
    }

}
