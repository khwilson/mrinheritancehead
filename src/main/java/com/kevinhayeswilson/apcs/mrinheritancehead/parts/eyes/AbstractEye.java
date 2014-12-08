package com.kevinhayeswilson.apcs.mrinheritancehead.parts.eyes;

import com.kevinhayeswilson.apcs.mrinheritancehead.parts.Color;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.IPart;

/**
 * A class which can be used to draw a nose.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public abstract class AbstractEye implements IPart {

    /**
     * Return the SVG for both pupils with the passed color.
     *
     * @param color An SVG-parseable color string.
     * @return The SVG elements for the pupils.
     */
    protected abstract String drawPupil(String color);

    /**
     * Return the SVG for both irises with the passed color.
     *
     * @param color An SVG-parseable color string.
     * @return The SVG elements for the irises.
     */
    protected abstract String drawIris(String color);

    /**
     * Return the SVG for both eyes with the passed color.
     *
     * @param color An SVG-parseable color string.
     * @return The SVG elements for the eyes.
     */
    protected abstract String drawEye(String color);

    @Override
    public String draw() {
        return drawEye(Color.WHITE.rgb) + drawIris(getColor()) + drawPupil(Color.BLACK.rgb);
    }

}
