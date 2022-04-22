package net.lyncas.scienceTools.trigonometry.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Alexandre Marinho de Souza Júnior on 20/04/2022
 */

@AllArgsConstructor
@Getter
public class Rectangle extends TwoDimensionalShape{

    private Double width;
    private Double height;

    @Override
    public Double calculateArea() {
        return width * height;
    }

    @Override
    public Double calculatePerimeter() {
        return (2 * width) + (2 * height);
    }
}
