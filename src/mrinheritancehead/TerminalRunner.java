package mrinheritancehead;

import mrinheritancehead.parts.Head;
import mrinheritancehead.parts.eyes.SimpleEye;
import mrinheritancehead.parts.faces.SimpleFace;
import mrinheritancehead.parts.mouths.FancyMouth;
import mrinheritancehead.parts.noses.TriangleNose;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * A simple class to test out {@link mrinheritancehead.parts.IPart}s.
 *
 * @author Kevin Wilson - khwilson@gmail.com
 */
public class TerminalRunner {

    private static final String OUTPUT_PATH = "/Users/kevin/github/faces/testface.svg";

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream output = new PrintStream(OUTPUT_PATH);
        output.println(new Head(new SimpleEye(),
                                new SimpleFace(),
                                new FancyMouth(),
                                new TriangleNose())
                           .draw());
        output.close();
    }

}
