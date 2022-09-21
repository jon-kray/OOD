package designpatterns.creational.factory;

//Шаблон фабрики или шаблон фабричного метода говорит,
// что просто определите интерфейс или абстрактный класс для создания объекта,
// но позвольте подклассам решать, какой класс создавать.Другими словами,
// подклассы отвечают за создание экземпляра класса.

public interface Product { }

class ConcreteProductA implements Product { }

class ConcreteProductB implements Product { }

abstract class Creator {
    public abstract Product factoryMethod();
}

class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() { return new ConcreteProductA(); }
}

class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() { return new ConcreteProductB(); }
}

