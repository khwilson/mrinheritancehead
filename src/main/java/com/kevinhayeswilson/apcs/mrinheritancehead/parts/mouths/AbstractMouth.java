package com.kevinhayeswilson.apcs.mrinheritancehead.parts.mouths;

import com.kevinhayeswilson.apcs.mrinheritancehead.parts.Color;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.IPart;

/**
 * A class which can be used to draw a mouth.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public abstract class AbstractMouth implements IPart {

    /**
     * Return the SVG for teeth with the passed color.
     *
     * @param color An SVG-parseable color string.
     * @return The SVG elements for teeth.
     */
    public abstract String drawTeeth(String color);

    /**
     * Return the SVG for a mouth with the passed color.
     *
     * @param color An SVG-parseable color string.
     * @return The SVG elements for a mouth.
     */
    public abstract String drawMouth(String color);

    @Override
    public String draw() {
        return drawTeeth(Color.WHITE.rgb) + drawMouth(getColor());
    }
}
