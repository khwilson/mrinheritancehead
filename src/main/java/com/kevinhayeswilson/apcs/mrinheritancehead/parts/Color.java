package com.kevinhayeswilson.apcs.mrinheritancehead.parts;

/**
 * Some static color constants which will be useful in drawing faces.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public enum Color {

    RED("#ff0000"),
    GREEN("00ff00"),
    BLUE("#0000ff"),
    CYAN("#00ffff"),
    MAGENTA("#ff00ff"),
    YELLOW("#ffff00"),
    BLACK("#000000"),
    WHITE("#ffffff");

    public final String rgb;

    Color(String rgb) {
        this.rgb = rgb;
    }

}
