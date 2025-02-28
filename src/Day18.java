import java.util.Stack;

public class Day18 {
    public static void main(String[] args) {


    Stack<String> stack = new Stack<>();
    stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");


    // Просмотр верхнего элемента без удаления
        System.out.println("Верхний элемент: " + stack.peek()); // Cherry

    // Удаление элемента (pop)
        System.out.println("Удалено: " + stack.pop()); // Cherry

    // Проверка, пуст ли стек
        System.out.println("Стек пуст? " + stack.isEmpty());

    // Вывод оставшихся элементов
        System.out.println("Оставшиеся элементы: " + stack);
}
}