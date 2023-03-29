package pl.edu.wszib.http2.todo;

import org.springframework.stereotype.Service;
import pl.edu.wszib.http2.service.model.ToDoStatus;

@Service
public class TodoUtils { //todoutils
    public String color (ToDoStatus status) {
        switch (status) {
            case NEW:
                return "#00ff00";
            case IN_PROGRESS:
                return "#ffff00";
            case DONE:
                return "#0000ff";
            default:
                return "#000000";
        }
    }
}
