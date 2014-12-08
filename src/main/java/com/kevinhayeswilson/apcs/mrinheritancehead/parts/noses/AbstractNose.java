package com.kevinhayeswilson.apcs.mrinheritancehead.parts.noses;

import com.kevinhayeswilson.apcs.mrinheritancehead.parts.IPart;

/**
 * A class which can be used to draw a nose.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public abstract class AbstractNose implements IPart {

    /**
     * Return the SVG for the nose with the passed color.
     *
     * @param color A color string parseable by SVG.
     * @return The SVG for the nose
     */
    public abstract String drawNose(String color);

    @Override
    public String draw() {
        return drawNose(getColor());
    }
}
