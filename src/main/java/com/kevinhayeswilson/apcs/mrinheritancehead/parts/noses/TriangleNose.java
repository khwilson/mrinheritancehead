package com.kevinhayeswilson.apcs.mrinheritancehead.parts.noses;

import com.kevinhayeswilson.apcs.mrinheritancehead.parts.Color;

/**
 * A simple triangular nose centered on the face.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public class TriangleNose extends AbstractNose {

    int Y1 = 480 / 2 - 28;
    int Y2 = 480 / 2 + 28;
    int X1 = 640 / 2 + 16;
    int X2 = 640 / 2 - 16;
    @Override
    public String drawNose(String color) {
        String output = "";
        output += String.format("<line stroke=\"%s\" stroke-width=\"1px\" y2=\"%d\" "
                             + "x2=\"%d\" y1=\"%d\" x1=\"%d\" id=\"nose_down\"/>", color, Y2, X2, Y1, X1);
        output += String.format("<line stroke=\"%s\" stroke-width=\"1px\" y2=\"%d\""
                             + " x2=\"%d\" y1=\"%d\" x1=\"%d\" id=\"nose_cross\"/>", color, Y2, X1, Y2, X2);
        return output;
    }

    @Override
    public String getColor() {
        return Color.BLACK.rgb;
    }
}
