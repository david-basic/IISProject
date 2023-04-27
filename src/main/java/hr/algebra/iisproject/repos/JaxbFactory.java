package hr.algebra.iisproject.repos;

import hr.algebra.iisproject.models.AlkoholnaPica;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class JaxbFactory implements XsdFactory {

    @Override
    public String XsdValidation(StreamSource xml) {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance("hr.algebra.iisproject.models.AlkoholnaPica");
            Unmarshaller unmarshaller = context.createUnmarshaller();

            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(new File("alkoholnaPica.xsd"));
            unmarshaller.setSchema(schema);

            JAXBElement<AlkoholnaPica> picaJAXBElement = (JAXBElement<AlkoholnaPica>) unmarshaller.unmarshal(xml);
        } catch (JAXBException | SAXException e) {
            throw new RuntimeException(e);
        }

        return "Valid";
    }
}
