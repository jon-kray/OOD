package designpatterns.structual.composite;

//Составной шаблон говорит, что просто "позволяет клиентам работать в общем виде с объектами,
// которые могут представлять или не представлять иерархию объектов".

//Преимущество композитного шаблона проектирования
//Он определяет иерархии классов, которые содержат примитивные и сложные объекты.
//Это упрощает добавление новых типов компонентов.
//Он обеспечивает гибкость структуры с управляемым классом или интерфейсом.

//Он используется:
//Когда вы хотите представить полную или частичную иерархию объектов.
//Когда необходимо динамически добавлять обязанности к отдельным объектам,
// не затрагивая другие объекты. Где ответственность объекта может меняться время от времени

//Простыми словами:
//Составной шаблон позволяет клиентам единообразно обрабатывать отдельные объекты.
public interface Employee {

    public  int getId();
    public String getName();
    public double getSalary();
    public void print();
    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);
}
