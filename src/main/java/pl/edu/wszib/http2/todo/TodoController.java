package pl.edu.wszib.http2.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.edu.wszib.http2.service.ToDoService;
import pl.edu.wszib.http2.service.model.ToDo;
import pl.edu.wszib.http2.service.model.ToDoStatus;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private ToDoService toDoService;

    @PostConstruct
    public void init() {
        ToDo newTodo = new ToDo();
        newTodo.setStatus(ToDoStatus.NEW);
        newTodo.setTermin("2023-04-26");
        newTodo.setZadanie("Kup prezent na urodziny X");

        toDoService.create(newTodo);

        ToDo inProgressTodo = new ToDo();
        inProgressTodo.setStatus(ToDoStatus.IN_PROGRESS);
        inProgressTodo.setTermin("2023-04-09");
        inProgressTodo.setZadanie("Skok ze spadochronu");

        toDoService.create(inProgressTodo);

        ToDo doneTodo = new ToDo();
        doneTodo.setStatus(ToDoStatus.DONE);
        doneTodo.setTermin("2023-02-20");
        doneTodo.setZadanie("Zrób zakupy");

        toDoService.create(doneTodo);
    }

    @GetMapping
    public String listView(Model model) {
        List<ToDo> todos = toDoService.list();
        model.addAttribute("todos", todos);
        return "todos/list";
    }

    @GetMapping("/create")
    public String createView (Model model) {
        ToDo newTodo = new ToDo();
        model.addAttribute("newTodo", newTodo);
        return "todos/create";
    }

    @PostMapping("/create")
    public String createAction(ToDo newTodo) {
        newTodo.setStatus(ToDoStatus.NEW);
        toDoService.create(newTodo);
        return "redirect:/todos";
    }

    @GetMapping("/update")
    public String updateStatus(@RequestParam Integer id, @RequestParam ToDoStatus status) {
        ToDo existing = toDoService.get(id);
        existing.setStatus(status);
        toDoService.update(existing);
        return "redirect:/todos";
    }

}