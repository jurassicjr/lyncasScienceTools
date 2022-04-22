package net.lyncas.scienceTools.trigonometry.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alexandre Marinho de Souza Júnior on 20/04/2022
 */

@AllArgsConstructor
@Getter
@Setter
public class Circle extends TwoDimensionalShape{

    private Double radius;

    @Override
    public Double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

}
