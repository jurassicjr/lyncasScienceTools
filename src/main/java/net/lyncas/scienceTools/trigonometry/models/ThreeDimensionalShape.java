package net.lyncas.scienceTools.trigonometry.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Essa classe abstrata tente a representar um comportamento padrão entre objecto que irão herda-la
 * @author Alexandre Marinho de Souza Júnior on 26/04/2022
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type"
)
public abstract class ThreeDimensionalShape extends TwoDimensionalShape{

    public abstract Double calculateVolume();
}
