package net.lyncas.scienceTools.trigonometry.services;

import net.lyncas.scienceTools.trigonometry.dtos.CalculatedAreaAndPerimeterDTO;
import net.lyncas.scienceTools.trigonometry.dtos.TwoDimensionalShapeDTO;
import net.lyncas.scienceTools.trigonometry.models.Circle;
import net.lyncas.scienceTools.trigonometry.models.Rectangle;
import net.lyncas.scienceTools.trigonometry.models.TwoDimensionalShape;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexandre Marinho de Souza Júnior on 20/04/2022
 */
@Service
public class TrigonometryService {

    public List<CalculatedAreaAndPerimeterDTO> calculateAreaAndPerimeter(TwoDimensionalShapeDTO twoDimensionalShapeDTO){

        var dtos = new ArrayList<CalculatedAreaAndPerimeterDTO>();

        twoDimensionalShapeDTO.shapes().stream().forEach(shape -> {
            var area = shape.calculateArea();
            var perimeter = shape.calculatePerimeter();

            dtos.add(new CalculatedAreaAndPerimeterDTO(shape.toString(), area, perimeter));
        });

        return dtos;
    }

}
