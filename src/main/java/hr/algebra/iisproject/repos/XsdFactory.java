package hr.algebra.iisproject.repos;

import javax.xml.transform.stream.StreamSource;

public interface XsdFactory {
    String XsdValidation(StreamSource xml);
}
