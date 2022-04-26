package net.lyncas.scienceTools.trigonometry.controllers;

import net.lyncas.scienceTools.trigonometry.dtos.CalculatedAreaAndPerimeterDTO;
import net.lyncas.scienceTools.trigonometry.dtos.TwoDimensionalShapeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Alexandre Marinho de Souza Júnior on 26/04/2022
 */
@RequestMapping("/shapes")
@RestController
public interface IShapeController {

    @PostMapping("/calculate-area-and-perimeter")
    ResponseEntity<List<CalculatedAreaAndPerimeterDTO>> calculateAreaAndPerimeterOfShape(@RequestBody TwoDimensionalShapeDTO twoDimensionalShapeDTO);
}
