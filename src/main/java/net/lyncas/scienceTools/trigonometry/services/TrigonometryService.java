package net.lyncas.scienceTools.trigonometry.services;

import net.lyncas.scienceTools.trigonometry.models.Circle;
import net.lyncas.scienceTools.trigonometry.models.Rectangle;
import net.lyncas.scienceTools.trigonometry.models.TwoDimensionalShape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexandre Marinho de Souza Júnior on 20/04/2022
 */
public class TrigonometryService {


    public void example(){
        TwoDimensionalShape circle = new Circle(100.0);
        TwoDimensionalShape rectangle = new Rectangle(100.0, 100.00);
        
        List<TwoDimensionalShape> list = new ArrayList<TwoDimensionalShape>();
        
        list.add(circle);
        list.add(rectangle);
        
        circle.calculateArea();
        circle.calculatePerimeter();
        
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        
        
    }
}
