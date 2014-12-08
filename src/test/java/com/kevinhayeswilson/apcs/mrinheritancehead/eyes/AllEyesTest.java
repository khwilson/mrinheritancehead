package com.kevinhayeswilson.apcs.mrinheritancehead.eyes;

import com.kevinhayeswilson.apcs.mrinheritancehead.PartsTestHelper;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.eyes.AbstractEye;

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
public class AllEyesTest {

    @Test
    public void testEyes()
        throws IllegalAccessException, InstantiationException, ParserConfigurationException,
               IOException, SAXException {
        Reflections reflections = new Reflections("com.kevinhayeswilson.apcs.mrinheritancehead");
        Set<Class<? extends AbstractEye>> eyeClasses = reflections.getSubTypesOf(AbstractEye.class);
        for (Class<? extends AbstractEye> eyeClass : eyeClasses) {
            PartsTestHelper.partTestHelper(eyeClass);
        }
    }

}
