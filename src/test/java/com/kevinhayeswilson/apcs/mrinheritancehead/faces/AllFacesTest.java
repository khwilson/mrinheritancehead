package com.kevinhayeswilson.apcs.mrinheritancehead.faces;

import com.kevinhayeswilson.apcs.mrinheritancehead.PartsTestHelper;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.faces.AbstractFace;

import org.junit.Test;
import org.reflections.Reflections;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;

/**
 * Just make sure that all functions return valid XML from all of its functions.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public class AllFacesTest {

    @Test
    public void testFaces()
        throws IllegalAccessException, InstantiationException, ParserConfigurationException,
               IOException, SAXException {
        Reflections reflections = new Reflections("com.kevinhayeswilson.apcs.mrinheritancehead");
        Set<Class<? extends AbstractFace>> faceClasses =
            reflections.getSubTypesOf(AbstractFace.class);
        for (Class<? extends AbstractFace> faceClass : faceClasses) {
            PartsTestHelper.partTestHelper(faceClass);
        }
    }

}
