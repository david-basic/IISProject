package hr.algebra.iisproject.repos;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.IOException;

@Repository
@NoArgsConstructor
public class XsdFactory implements  XsdValidation{

    @Override
    public String validateXsd(StreamSource xml) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Source schemaFile = new StreamSource("meme.xsd");
            Schema schema = factory.newSchema(schemaFile);
            Validator validator = schema.newValidator();

            validator.validate(xml);
            return "File valid";
        } catch (IOException | SAXException e) {
            System.err.println(e);
            return e.getMessage();
        }
    }
}
