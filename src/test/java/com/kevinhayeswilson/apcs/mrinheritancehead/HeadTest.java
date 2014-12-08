package com.kevinhayeswilson.apcs.mrinheritancehead;

import com.kevinhayeswilson.apcs.mrinheritancehead.parts.Head;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.eyes.AbstractEye;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.faces.AbstractFace;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.mouths.AbstractMouth;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.noses.AbstractNose;

import org.junit.Test;
import org.reflections.Reflections;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;

/**
 * For every eye, nose, mouth, and face, make sure that the {@link Head} returns fully formed
 * XML.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public class HeadTest {

    @Test
    public void testAllParts()
        throws IllegalAccessException, InstantiationException, IOException, SAXException,
               ParserConfigurationException {
        Reflections reflections = new Reflections("com.kevinhayeswilson.apcs.mrinheritancehead");
        Set<Class<? extends AbstractEye>> eyeClasses =
            reflections.getSubTypesOf(AbstractEye.class);
        Set<Class<? extends AbstractNose>> noseClasses =
            reflections.getSubTypesOf(AbstractNose.class);
        Set<Class<? extends AbstractFace>> faceClasses =
            reflections.getSubTypesOf(AbstractFace.class);
        Set<Class<? extends AbstractMouth>> mouthClasses =
            reflections.getSubTypesOf(AbstractMouth.class);

        for (Class<? extends AbstractEye> eyeClass : eyeClasses) {
            for (Class<? extends AbstractFace> faceClass : faceClasses) {
                for (Class<? extends AbstractMouth> mouthClass : mouthClasses) {
                    for (Class<? extends AbstractNose> noseClass : noseClasses) {
                        Head head = new Head(eyeClass.newInstance(), faceClass.newInstance(),
                                             mouthClass.newInstance(), noseClass.newInstance());
                        PartsTestHelper.xmlValidator(head.draw());
                    }
                }
            }
        }
    }

}
