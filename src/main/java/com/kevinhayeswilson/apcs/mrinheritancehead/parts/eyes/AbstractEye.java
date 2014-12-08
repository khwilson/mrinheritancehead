package com.kevinhayeswilson.apcs.mrinheritancehead.parts.eyes;

import com.kevinhayeswilson.apcs.mrinheritancehead.parts.Color;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.IPart;

/**
 * A class which can be used to draw a nose.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public abstract class AbstractEye implements IPart {

    public abstract String drawPupil(String color);

    public abstract String drawIris(String color);

    public abstract String drawEye(String color);

    @Override
    public String draw() {
        return drawEye(Color.WHITE.rgb) + drawIris(getColor()) + drawPupil(Color.BLACK.rgb);
    }

}
