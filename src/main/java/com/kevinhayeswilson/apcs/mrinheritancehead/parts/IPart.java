package com.kevinhayeswilson.apcs.mrinheritancehead.parts;

/**
 * A part of a face.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public interface IPart {

    /**
     * What color should this part be? Should return a string that's parseable by SVG, e.g.,
     * "#ff0000" or "rgb(255, 0, 0)"
     *
     * @return The color
     */
    String getColor();

    /**
     * Actually draw the part of the face. Should return fully-fledged SVG elements concatenatd as
     * a single String, e.g.,
     *
     * {@code
     *     <line />
     *     <ellipse />
     * }
     *
     * @return The SVG representing the part of the face.
     */
    String draw();

}
