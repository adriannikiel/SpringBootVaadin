package pl.anikiel.rectangleapp;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class RectangleSizeGui extends VerticalLayout {

    private RectangleRepo rectangleRepo;

    private TextField textFieldSize;
    private TextArea textAreaRectangles;
    private Button buttonBigger;
    private Button buttonSmaller;

    @Autowired
    public RectangleSizeGui(RectangleRepo rectangleRepo) {
        this.rectangleRepo = rectangleRepo;

        textFieldSize = new TextField("Podaj rozmiar");
        textAreaRectangles = new TextArea("Wynik");
        buttonBigger = new Button("Pokaz większe");
        buttonSmaller = new Button("Pokaz mniejsze");

        buttonBigger.addClickListener(buttonClickEvent -> textAreaRectangles.setValue(rectangleRepo.getBigRectangles(Integer.parseInt(textFieldSize.getValue())).toString()));
        buttonSmaller.addClickListener(buttonClickEvent -> textAreaRectangles.setValue(rectangleRepo.getSmallRectangles(Integer.parseInt(textFieldSize.getValue())).toString()));

        add(textFieldSize);
        add(buttonBigger);
        add(buttonSmaller);
        add(textAreaRectangles);
    }
}
