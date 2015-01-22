package mrinheritancehead.parts.faces;

import mrinheritancehead.parts.Color;

/**
 * A simple elliptical face.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public class SimpleFace extends AbstractFace {

    private static int X = 640 / 2;
    private static int Y = 480 / 2;

    @Override
    public String drawFace(String color) {
        return String.format("<ellipse fill=\"%s\" ry=\"229\" rx=\"172\" "
                             + "stroke-width=\"1px\" cy=\"%d\" cx=\"%d\" id=\"face\"/>",
                             color, Y, X);
    }

    @Override
    public String getColor() {
        return Color.YELLOW.rgb;
    }
}
