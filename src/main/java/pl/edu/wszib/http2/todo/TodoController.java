package pl.edu.wszib.http2.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.http2.service.ToDoService;

@Controller
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private ToDoService toDoService;



}
