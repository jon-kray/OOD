package designpatterns.behavioral.iterartor;

public interface Iterator {

    public boolean hasNext();
    public Object next();
}

//Итератор(Также известный как: курсор)
//шаблон итератора используется "для последовательного доступа к элементам агрегированного объекта,
// не раскрывая его базовую реализацию"

//Преимущество шаблона итератора:
//Он поддерживает варианты обхода коллекции.
//Это упрощает интерфейс к коллекции.

//Он используется:
//Когда вы хотите получить доступ к коллекции объектов, не раскрывая ее внутреннее представление.
//При наличии нескольких обходов объекты должны поддерживаться в коллекции.