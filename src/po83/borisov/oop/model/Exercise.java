package po83.borisov.oop.model;

public class Exercise {

    private  String name; //название упражнения
    private  int duration; //продолжительность в минутах
    public  static  final  int dur = 3; //время выполнения - упражнения 3 минуты

    Exercise(String name) {
        this.duration = dur;
    }

    Exercise(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() { return  name; } //метод, возвращающий название

    public  void setName(String newName) { name = newName; } //метод, устанавливающий новое значение названия

    public  int getDuration() { return  duration; } // метод, возвращающий продолжительность

    public void setDuration(int newDuration) { duration = newDuration; } // метод, возвращающий новое значение продолжительности

}
