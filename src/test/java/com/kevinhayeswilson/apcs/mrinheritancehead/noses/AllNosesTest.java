package com.kevinhayeswilson.apcs.mrinheritancehead.noses;

import com.kevinhayeswilson.apcs.mrinheritancehead.PartsTestHelper;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.faces.AbstractFace;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.noses.AbstractNose;

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
public class AllNosesTest {

    @Test
    public void testFaces()
        throws IllegalAccessException, InstantiationException, ParserConfigurationException,
               IOException, SAXException {
        Reflections reflections = new Reflections("com.kevinhayeswilson.apcs.mrinheritancehead");
        Set<Class<? extends AbstractNose>> noseClasses =
            reflections.getSubTypesOf(AbstractNose.class);
        for (Class<? extends AbstractNose> noseClass : noseClasses) {
            PartsTestHelper.partTestHelper(noseClass);
        }
    }

}
