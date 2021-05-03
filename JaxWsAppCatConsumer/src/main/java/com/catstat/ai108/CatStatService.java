
package com.catstat.ai108;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CatStatService", targetNamespace = "http://ai108.catstat.com", wsdlLocation = "http://localhost:8084/AppCatBusiness-1.0/CatStatService/CatStatWebService?wsdl")
public class CatStatService
    extends Service
{

    private final static URL CATSTATSERVICE_WSDL_LOCATION;
    private final static WebServiceException CATSTATSERVICE_EXCEPTION;
    private final static QName CATSTATSERVICE_QNAME = new QName("http://ai108.catstat.com", "CatStatService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8084/AppCatBusiness-1.0/CatStatService/CatStatWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CATSTATSERVICE_WSDL_LOCATION = url;
        CATSTATSERVICE_EXCEPTION = e;
    }

    public CatStatService() {
        super(__getWsdlLocation(), CATSTATSERVICE_QNAME);
    }

    public CatStatService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CATSTATSERVICE_QNAME, features);
    }

    public CatStatService(URL wsdlLocation) {
        super(wsdlLocation, CATSTATSERVICE_QNAME);
    }

    public CatStatService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CATSTATSERVICE_QNAME, features);
    }

    public CatStatService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CatStatService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CatStatIService
     */
    @WebEndpoint(name = "CatStatPort")
    public CatStatIService getCatStatPort() {
        return super.getPort(new QName("http://ai108.catstat.com", "CatStatPort"), CatStatIService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CatStatIService
     */
    @WebEndpoint(name = "CatStatPort")
    public CatStatIService getCatStatPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ai108.catstat.com", "CatStatPort"), CatStatIService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CATSTATSERVICE_EXCEPTION!= null) {
            throw CATSTATSERVICE_EXCEPTION;
        }
        return CATSTATSERVICE_WSDL_LOCATION;
    }

}