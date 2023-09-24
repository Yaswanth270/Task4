<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Task Manager</title>
</head>
<body>
    <h1>Task Manager</h1>
    
    <!-- Form to add a new task -->
    <form th:action="@{/add}" method="post">
        <input type="text" name="description" placeholder="Add a new task" required>
        <button type="submit">Add</button>
    </form>
    
    <!-- List to display tasks -->
    <ul>
        <li th:each="task : ${tasks}">
            <span th:text="${task.description}"></span>
            <a th:href="@{'/delete/' + ${task.id}}">Delete</a>
        </li>
    </ul>
</body>
</html>
