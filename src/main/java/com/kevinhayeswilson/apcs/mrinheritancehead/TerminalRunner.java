package com.kevinhayeswilson.apcs.mrinheritancehead;

import com.kevinhayeswilson.apcs.mrinheritancehead.parts.Head;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.eyes.SimpleEye;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.faces.SimpleFace;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.mouths.FancyMouth;
import com.kevinhayeswilson.apcs.mrinheritancehead.parts.noses.TriangleNose;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * A simple class to test out {@link com.kevinhayeswilson.apcs.mrinheritancehead.parts.IPart}s.
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
