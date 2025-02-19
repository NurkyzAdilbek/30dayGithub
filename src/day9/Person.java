package day9;

public class Person {
  private   String name;
  private   int age;
  public Person(String name, int age) {
      this.name = name;
      this.age = age;

  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //Задание:
    //Создай класс Person, у которого есть приватные поля name и age.
    // Реализуй геттеры и сеттеры для доступа к этим полям.
    // В main создай объект Person, задай значения с помощью сеттеров и выведи их с помощью геттеров.
    public static void main(String[] args) {
        Person person=new Person("Nurkyz",12);
        System.out.println(person.getName());
        person.setName("Asel");
        System.out.println(person);
    }
}
