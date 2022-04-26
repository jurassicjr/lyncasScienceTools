package net.lyncas.scienceTools.trigonometry.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Essa é uma classe modelo abstrata que serve como contrato para as figura geomtricas 2D que irão herda-la
 * @author Alexandre Marinho de Souza Júnior on 20/04/2022
 */

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Circle.class, name = "circle"),
        @JsonSubTypes.Type(value = Triangle.class, name = "triangle"),
        @JsonSubTypes.Type(value = Rectangle.class, name = "rectangle"),
        @JsonSubTypes.Type(value = Sphere.class, name = "sphere"),
        @JsonSubTypes.Type(value = Pyramid.class, name = "pyramid")
})
public abstract class TwoDimensionalShape {

    /**
     * Esse método é responsável por calcular a area da figura.
     * @return Double - a area calculada
     */
    public abstract Double calculateArea();

    /**
     * Esse metódo é responsável por calcular o perimetro da figura.
     * @return Double - perimetro calculado
     */
    public abstract Double calculatePerimeter();
}
