package pl.anikiel.rectangleapp;

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

    @Autowired
    public RectangleSizeGui(RectangleRepo rectangleRepo) {
        this.rectangleRepo = rectangleRepo;

        textAreaRectangles = new TextArea();
        textFieldSize = new TextField();

        textAreaRectangles.setValue(rectangleRepo.getBigRectangles().toString());

        add(textAreaRectangles);
    }
}
