//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.12 at 09:12:08 PM AEDT 
//


package sunat.names.specification.ubl.peru.schema.xsd.voideddocuments_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sunat.names.specification.ubl.peru.schema.xsd.voideddocuments_1 package. 
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

    private final static QName _VoidedDocuments_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:VoidedDocuments-1", "VoidedDocuments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sunat.names.specification.ubl.peru.schema.xsd.voideddocuments_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VoidedDocumentsType }
     * 
     */
    public VoidedDocumentsType createVoidedDocumentsType() {
        return new VoidedDocumentsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoidedDocumentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:VoidedDocuments-1", name = "VoidedDocuments")
    public JAXBElement<VoidedDocumentsType> createVoidedDocuments(VoidedDocumentsType value) {
        return new JAXBElement<VoidedDocumentsType>(_VoidedDocuments_QNAME, VoidedDocumentsType.class, null, value);
    }

}