package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TodoListController {
    ArrayList<Todo> todoArrayList = new ArrayList<>();

    @PostMapping(value = "/api/todo")
    public void addTodoToTheList(@RequestParam("message") String message, @RequestParam("author") String author){
        this.todoArrayList.add(new Todo(message, author));
        System.out.println(todoArrayList);
    }

    @GetMapping(value = "/api/todo")
    public @ResponseBody
    ArrayList<Todo> getTodoList(){
        return this.todoArrayList;
    }
}
