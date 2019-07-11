
package com.ca.devtest.lisabank.wsdl;

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
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EJB3AccountControlBeanService", targetNamespace = "http://ejb3.examples.itko.com/", wsdlLocation = "http://localhost:9080/itkoExamples/EJB3AccountControlBean?wsdl")
public class EJB3AccountControlBeanService
    extends Service
{

    private final static URL EJB3ACCOUNTCONTROLBEANSERVICE_WSDL_LOCATION;
    private final static WebServiceException EJB3ACCOUNTCONTROLBEANSERVICE_EXCEPTION;
    private final static QName EJB3ACCOUNTCONTROLBEANSERVICE_QNAME = new QName("http://ejb3.examples.itko.com/", "EJB3AccountControlBeanService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9080/itkoExamples/EJB3AccountControlBean?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EJB3ACCOUNTCONTROLBEANSERVICE_WSDL_LOCATION = url;
        EJB3ACCOUNTCONTROLBEANSERVICE_EXCEPTION = e;
    }

    public EJB3AccountControlBeanService() {
        super(__getWsdlLocation(), EJB3ACCOUNTCONTROLBEANSERVICE_QNAME);
    }

    public EJB3AccountControlBeanService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EJB3ACCOUNTCONTROLBEANSERVICE_QNAME, features);
    }

    public EJB3AccountControlBeanService(URL wsdlLocation) {
        super(wsdlLocation, EJB3ACCOUNTCONTROLBEANSERVICE_QNAME);
    }

    public EJB3AccountControlBeanService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EJB3ACCOUNTCONTROLBEANSERVICE_QNAME, features);
    }

    public EJB3AccountControlBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EJB3AccountControlBeanService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EJB3AccountControlBean
     */
    @WebEndpoint(name = "EJB3AccountControlBeanPort")
    public EJB3AccountControlBean getEJB3AccountControlBeanPort() {
        return super.getPort(new QName("http://ejb3.examples.itko.com/", "EJB3AccountControlBeanPort"), EJB3AccountControlBean.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EJB3AccountControlBean
     */
    @WebEndpoint(name = "EJB3AccountControlBeanPort")
    public EJB3AccountControlBean getEJB3AccountControlBeanPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ejb3.examples.itko.com/", "EJB3AccountControlBeanPort"), EJB3AccountControlBean.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EJB3ACCOUNTCONTROLBEANSERVICE_EXCEPTION!= null) {
            throw EJB3ACCOUNTCONTROLBEANSERVICE_EXCEPTION;
        }
        return EJB3ACCOUNTCONTROLBEANSERVICE_WSDL_LOCATION;
    }

}
