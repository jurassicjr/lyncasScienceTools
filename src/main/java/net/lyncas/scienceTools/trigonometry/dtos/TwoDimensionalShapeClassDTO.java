package net.lyncas.scienceTools.trigonometry.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.lyncas.scienceTools.trigonometry.models.TwoDimensionalShape;

import java.util.List;

/**
 * @author Alexandre Marinho de Souza Júnior on 26/04/2022
 */

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TwoDimensionalShapeClassDTO {

    private List<TwoDimensionalShape> shapes;
}
