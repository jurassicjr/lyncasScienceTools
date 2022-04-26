package net.lyncas.scienceTools.trigonometry.models;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Alexandre Marinho de Souza Júnior on 20/04/2022
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@JsonTypeName("rectangle")
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
