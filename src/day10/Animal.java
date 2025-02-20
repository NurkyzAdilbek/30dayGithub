package day10;

public class Animal {
    String name;
    int age;
    //Задание:
    //Создай класс Animal с методом speak(),
    // который выводит сообщение "Animal speaks".
    //От этого класса унаследуй классы Dog и Cat.
    // В каждом из них переопредели метод speak(), чтобы он выводил
    // соответствующее сообщение, например, для собаки — "Woof!", а для кошки — "Meow!".
    //В main создай массив типа Animal и добавь в него объекты Dog и Cat.
    // Используя полиморфизм, вызови метод speak() для каждого объекта.

    public String speaks(){
        return "I am an animal";

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Dog extends Animal {


    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String speaks() {
        return "Woof!";
    }
}
class Cat extends Animal {
    String name;
    int age;

    public Cat(String name, int age) {
        super(name, age);
    }


    @Override
    public String speaks() {
        return "Meow!";
    }
}

