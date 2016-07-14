package com.github.carlhuk;

import org.apache.batik.transcoder.Transcoder;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;

import java.io.InputStream;
import java.io.OutputStream;

public class SvgService {
    public static void convertSvgToPng(InputStream inputStream, OutputStream outputStream) throws TranscoderException {
        Transcoder transcoder = new PNGTranscoder();
        TranscoderInput transcoderInput = new TranscoderInput(inputStream);
        TranscoderOutput transcoderOutput = new TranscoderOutput(outputStream);
        transcoder.transcode(transcoderInput, transcoderOutput);
    }
}

//    public static void main(String[] args) throws IOException, TranscoderException {
//
//        String svg = "<svg version=\"1.1\"\n" +
//                "     baseProfile=\"full\"\n" +
//                "     width=\"300\" height=\"200\"\n" +
//                "     xmlns=\"http://www.w3.org/2000/svg\">\n" +
//                "  <rect width=\"100%\" height=\"100%\" fill=\"red\" />\n" +
//                "  <circle cx=\"150\" cy=\"100\" r=\"80\" fill=\"green\" />\n" +
//                "  <text x=\"150\" y=\"125\" font-size=\"60\" text-anchor=\"middle\" fill=\"white\">SVG</text>\n" +
//                "</svg>";
//
//        try (OutputStream ostream = new FileOutputStream("out.png")){
//            convertSvgToPng(svg, ostream);
//        }
//
//        System.exit(0);
//    }