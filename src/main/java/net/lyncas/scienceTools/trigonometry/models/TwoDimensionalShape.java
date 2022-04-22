package net.lyncas.scienceTools.trigonometry.models;

/**
 * Essa é uma classe modelo abstrata que serve como contrato para as figura geomtricas 2D que irão herda-la
 * @author Alexandre Marinho de Souza Júnior on 20/04/2022
 */
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
