package com.kevinhayeswilson.apcs.mrinheritancehead.mouths;

import com.kevinhayeswilson.apcs.mrinheritancehead.PartsTestHelper;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.faces.AbstractFace;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.mouths.AbstractMouth;

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
public class AllMouthsTest {

    @Test
    public void testMouths()
        throws IllegalAccessException, InstantiationException, ParserConfigurationException,
               IOException, SAXException {
        Reflections reflections = new Reflections("com.kevinhayeswilson.apcs.mrinheritancehead");
        Set<Class<? extends AbstractMouth>> mouthClasses =
            reflections.getSubTypesOf(AbstractMouth.class);
        for (Class<? extends AbstractMouth> mouthClass : mouthClasses) {
            PartsTestHelper.partTestHelper(mouthClass);
        }
    }

}
