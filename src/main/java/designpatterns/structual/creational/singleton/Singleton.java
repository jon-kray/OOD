package designpatterns.structual.creational.singleton;

//Гарантирует, что когда-либо будет создан только один объект определенного класса.

//В программной инженерии шаблон singleton - это шаблон проектирования программного обеспечения,
// который ограничивает создание экземпляра класса одним объектом. Это полезно,
// когда для координации действий в системе требуется ровно один объект.

public class Singleton {

    private static Singleton instance;
    private Singleton () {};

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
