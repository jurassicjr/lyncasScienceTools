package net.lyncas.scienceTools.trigonometry.models;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Essa classe representa o modelo geometrico de uma piramide
 * @author Alexandre Marinho de Souza Júnior on 26/04/2022
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@JsonTypeName("pyramid")
public class Pyramid extends ThreeDimensionalShape{

    private Double baseLength;
    private Double baseWidth;
    private Double pyramidHeight;

    @Override
    public Double calculateVolume() {
        return (baseLength * baseWidth * pyramidHeight) / 3;
    }

    @Override
    public Double calculateArea() {
        return (baseLength * baseWidth) +
                (pyramidHeight * Math.sqrt((Math.pow(baseWidth / 2, 2) + Math.pow(pyramidHeight, 2)))
                        + (baseWidth * Math.sqrt((Math.pow(baseLength / 2, 2) + Math.pow(pyramidHeight, 2)))));
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * baseWidth + 2 * baseLength;
    }
}
