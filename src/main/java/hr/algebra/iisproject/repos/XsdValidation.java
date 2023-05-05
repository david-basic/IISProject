package hr.algebra.iisproject.repos;

import javax.xml.transform.stream.StreamSource;

public interface XsdValidation {
    String validateXsd(StreamSource xml);
}
