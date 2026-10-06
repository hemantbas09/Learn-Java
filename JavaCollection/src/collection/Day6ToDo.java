package collection;

import java.util.*;

public class Day6ToDo {

    // 1. Task: one to-do item
    static class Task {
        private final String title;   // the title never changes
        private boolean done;         // this will change later (Day 7: mark as done)

        Task(String title) {
            this.title = title;
            this.done = false;        // new tasks start as not done
        }

        @Override
        public String toString() {
            return "[" + (done ? "x" : " ") + "] " + title;   // [ ] Buy milk  or  [x] Buy milk
        }
    }

    // 2. ToDoList: holds many tasks
    static class ToDoList {
        private final List<Task> tasks = new ArrayList<>();   // declared by interface

        void addTask(String title) {
            tasks.add(new Task(title));   // O(1) on average
        }

        void listTasks() {
            if (tasks.isEmpty()) {
                System.out.println("No tasks yet");
                return;
            }
            for (int i = 0; i < tasks.size(); i++) {          // index loop: we need the number
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void run() {
        System.out.println("=== Day 6 ===");

        // 3. Create a ToDoList, add 3 tasks, list them
        ToDoList todo = new ToDoList();
        todo.addTask("Buy milk");
        todo.addTask("Study Java");
        todo.addTask("Walk the dog");
        todo.listTasks();

        // Prediction A: a new int[3] holds the default value 0 in every slot
        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));

        // Prediction B: writing past the end throws ArrayIndexOutOfBoundsException
        try {
            arr[3] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("arr[3] failed: " + e.getMessage());
        }

        // Prediction C: a brand-new ArrayList is empty
        System.out.println(new ArrayList<String>().size());
    }
}
