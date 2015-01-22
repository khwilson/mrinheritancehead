package mrinheritancehead.parts;

import mrinheritancehead.parts.eyes.AbstractEye;
import mrinheritancehead.parts.faces.AbstractFace;
import mrinheritancehead.parts.mouths.AbstractMouth;
import mrinheritancehead.parts.noses.AbstractNose;

/**
 * The wrapper class that handles drawing a 640 x 480 face.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public class Head {
    final AbstractEye eye;
    final AbstractFace face;
    final AbstractMouth mouth;
    final AbstractNose nose;

    public Head(AbstractEye eye, AbstractFace face, AbstractMouth mouth, AbstractNose nose) {
        this.eye = eye;
        this.face = face;
        this.mouth = mouth;
        this.nose = nose;
    }

    public String draw() {
        String output = "";
        output += "<svg width=\"640\" height=\"480\" xmlns=\"http://www.w3.org/2000/svg\" "
                + "xmlns:xlink=\"http://www.w3.org/1999/xlink\">";
        output += "<g>";
        output += face.draw();
        output += eye.draw();
        output += nose.draw();
        output += mouth.draw();
        output += "</g>";
        output += "</svg>";
        return output;
    }
}
