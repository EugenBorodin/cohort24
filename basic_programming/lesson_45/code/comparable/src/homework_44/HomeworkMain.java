package homework_44;

public class HomeworkMain {

  // # Задача 1
  //
  // Напишите интерфейсы "Умеет летать" `CanFly` с методом `fly()`,
  // "Умеет бегать" `CanRun` с методом `run` и
  // "умеет плавать" `CanSwim` с методом `swim`
  // и реализуйте их в классе "Супермен" `Superman`.
  //
  // # Задача 2
  //
  // Реализуйте **соответствующие** интерфейсы из предыдущей задачи
  // в классах "Человек", "Утка", "Пингвин" и "Самолёт".

  public static void main(String[] args) {
    Superman clarkKent = new Superman();

    clarkKent.fly();
    clarkKent.run();
    clarkKent.swim("бассейне");
  }
}