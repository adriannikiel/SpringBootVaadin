package pl.anikiel.rectangleapp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RectangleRepo extends CrudRepository<Rectangle,Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM rectangle rect WHERE 2*rect.height+2*rect.width > 20")
    List<Rectangle> getBigRectangles();

    @Query(nativeQuery = true, value = "SELECT * FROM rectangle rect WHERE 2*rect.height+2*rect.width <= 20")
    List<Rectangle> getSmallRectangles();
}
