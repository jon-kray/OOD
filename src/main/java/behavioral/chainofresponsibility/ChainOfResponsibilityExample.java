package behavioral.chainofresponsibility;

public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        // Выстраивайте цепочку ответственности
        Logger logger, logger1, logger2;
        logger = new StdoutLogger(Logger.DEBUG);
        logger1 = logger.setNext(new EmailLogger(Logger.NOTICE));
        logger2 = logger1.setNext(new StderrLogger(Logger.ERR));

        // Handled by StdoutLogger
        logger.message("Entering function y.", Logger.DEBUG);

        // Handled by StdoutLogger and EmailLogger
        logger.message("Step1 completed.", Logger.NOTICE);

        // Handled by all three loggers
        logger.message("An error has occurred.", Logger.ERR);
    }
}
//В объектно-ориентированном проектировании шаблон цепочки ответственности - это шаблон проектирования,
// состоящий из источника командных объектов и ряда объектов обработки.
// Каждый обрабатывающий объект содержит логику,
// которая определяет типы командных объектов, которые он может обрабатывать;
// остальные передаются следующему обрабатывающему объекту в цепочке

//Это помогает построить цепочку объектов.
// Запрос поступает с одного конца и продолжает переходить от объекта к другому,
// пока не найдет подходящий обработчик.