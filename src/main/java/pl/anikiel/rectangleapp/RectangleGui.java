package pl.anikiel.rectangleapp;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route
public class RectangleGui extends VerticalLayout {

    private TextField textFieldHeight;
    private TextField textFieldWidth;
    private Button button;

    public RectangleGui() {
         textFieldHeight = new TextField("Podaj wysokość");
         textFieldWidth = new TextField("Podaj szerokość");
         button = new Button("Dodaj!");

         add(textFieldHeight);
         add(textFieldWidth);
         add(button);
    }
}
