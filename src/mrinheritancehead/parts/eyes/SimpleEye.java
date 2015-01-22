package mrinheritancehead.parts.eyes;

import mrinheritancehead.parts.Color;

/**
 * A simple, googly pair of eyes.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public class SimpleEye extends AbstractEye {

    private static int LEFT_X = 640 / 2 - 60;
    private static int RIGHT_X = 640 / 2 + 60;
    private static int Y = 150;

    @Override
    protected String drawPupil(String color) {
        String output = "";
        output += String.format("<circle fill=\"%s\" r=\"9.43398\" stroke-width=\"1px\" "
                       + "cy=\"%d\" cx=\"%d\" id=\"left_eye_pupil\"/>", color, Y, LEFT_X);
        output += String.format("<circle fill=\"%s\" r=\"9.43398\" stroke-width=\"1px\" "
                  + "cy=\"%d\" cx=\"%d\" id=\"right_eye_pupil\"/>", color, Y, RIGHT_X);
        return output;
    }

    @Override
    protected String drawIris(String color) {
        String output = "";
        output += String.format("<circle fill=\"%s\" r=\"16.6589\" stroke-width=\"1px\" "
                  + "cy=\"%d\" cx=\"%d\" id=\"left_eye_iris\"/>", color, Y, LEFT_X);
        output += String.format("<circle fill=\"%s\" r=\"16.6589\" "
                                + "stroke-width=\"1px\" cy=\"%d\" cx=\"%d\" "
                                + "id=\"right_eye_iris\"/>\n", color, Y, RIGHT_X);
        return output;
    }

    @Override
    protected String drawEye(String color) {
        String output = "";
        output += String.format("<ellipse fill=\"%s\" ry=\"25\" rx=\"41\" "
                                + "stroke-width=\"1px\" cy=\"%d\" cx=\"%d\" "
                                + "id=\"left_eye_outline\"/>", color, Y, LEFT_X);
        output += String.format("<ellipse fill=\"%s\" ry=\"25\" rx=\"41\" "
                                + "stroke-width=\"1px\" cy=\"%d\" cx=\"%d\" "
                                + "id=\"right_eye_outline\"/>", color, Y, RIGHT_X);
        return output;
    }

    @Override
    public String getColor() {
        return Color.BLUE.rgb;
    }
}
