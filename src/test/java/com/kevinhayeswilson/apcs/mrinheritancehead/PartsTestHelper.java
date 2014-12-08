package com.kevinhayeswilson.apcs.mrinheritancehead;

import com.kevinhayeswilson.apcs.mrinheritancehead.parts.IPart;

import org.xml.sax.SAXException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * A simple test that makes sure that all the {@link com.kevinhayeswilson.apcs
 * .mrinheritancehead.parts.IPart}s return valid xml.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public class PartsTestHelper {

    public static void partTestHelper(Class<? extends IPart> klazz)
        throws IllegalAccessException, InstantiationException, ParserConfigurationException,
               IOException, SAXException {
        IPart part = klazz.newInstance();
        xmlValidator("<root>" + part.draw() + "</root>");
    }

    public static void xmlValidator(String xml)
        throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(false);
        factory.setNamespaceAware(true);

        DocumentBuilder builder = factory.newDocumentBuilder();
        builder.parse(new ByteArrayInputStream(xml.getBytes()));
    }

}
