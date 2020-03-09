package pl.anikiel.rectangleapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RectangularReader {

    @Value("${siteA1}")
    private int siteA1;

    @Value("${siteA2}")
    private int siteA2;

    @Value("${siteA3}")
    private int siteA3;

    @Value("${siteA4}")
    private int siteA4;

    @Value("${siteB1}")
    private int siteB1;

    @Value("${siteB2}")
    private int siteB2;

    @Value("${siteB3}")
    private int siteB3;

    @Value("${siteB4}")
    private int siteB4;

    
}
