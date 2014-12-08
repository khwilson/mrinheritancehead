package com.kevinhayeswilson.apcs.mrinheritancehead.parts.faces;

import com.kevinhayeswilson.apcs.mrinheritancehead.parts.IPart;

/**
 * A class which can be used to draw the outline of a face.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public abstract class AbstractFace implements IPart {

    /**
     * Return the SVG for a face with the passed color.
     *
     * @param color An SVG-parseable color string.
     * @return The SVG elements for a face.
     */
    public abstract String drawFace(String color);

    @Override
    public String draw() {
        return drawFace(getColor());
    }

}
