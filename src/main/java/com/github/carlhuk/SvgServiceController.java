package com.github.carlhuk;

import org.apache.batik.transcoder.TranscoderException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
public class SvgServiceController {
    @RequestMapping(value = "/png", method = RequestMethod.GET)
    public void convertSvgToPngTest(HttpServletResponse response) throws IOException, TranscoderException {
        String input = "<svg xmlns=\"http://www.w3.org/2000/svg\">" +
                "  <g transform=\"translate(50,50)\">\n" +
                "    <rect x=\"0\" y=\"0\" width=\"150\" height=\"50\" style=\"fill:red;\" />\n" +
                "  </g></svg>";
        SvgService.convertSvgToPng(new ByteArrayInputStream(input.getBytes()), response.getOutputStream());
    }

    @RequestMapping(value = "/png", method = RequestMethod.POST)
    public void convertSvgToPng(HttpServletRequest request, HttpServletResponse response) throws IOException, TranscoderException {
        SvgService.convertSvgToPng(request.getInputStream(), response.getOutputStream());
    }
}