package oop.part1.objects.project1;

import java.util.Date;

/*
ПРОЕКТ. Часть 1
Проект — это выполняемая на протяжении всего курса задача по программированию, сопровождаемая короткими видеороликами, которые показывают непосредственно написание кода программы (кодирование) и тестирование.

Чтобы выполнить первую часть проекта, необходимо попробовать самостоятельно решить задачу в GigaIDE, и только в случае каких-либо проблем с написанием кода перейти к просмотру видео.

На видео вам будет продемонстрировано решение задачи, связанной с банковскими счетами, которое будет усложняться по мере изучения материала курса.

Постановка задачи
Создайте класс с именем Account для представления банковского счета. Класс Account должен содержать:

Скрытое поле данных типа int с именем id (идентификатор) счета (по умолчанию равное 0).
Скрытое поле данных типа double с именем balance (остаток, баланс) счета (по умолчанию равное 0).
Скрытое поле данных типа double с именем annualInterestRate, в котором хранится годовая процентная ставка (по умолчанию равная 0). Пусть у всех счетов она будет одинаковая.
Скрытое поле данных типа Date с именем dateCreated, в котором хранится дата создания счета.
Безаргументный конструктор, который создает счет с заданными по умолчанию значениями.
Конструктор, который создает счет с указанными id и balance.
Getter и setter-методы для id, balance и annualInterestRate.
Getter-метод для dateCreated.
Метод с именем getMonthlyInterest(), который возвращает ежемесячный процент.
Метод с именем withdraw(), который снимает со счета указанную сумму.
Метод с именем deposit(), который пополняет счет на указанную сумму.
Нарисуйте UML-диаграмму класса Account, а затем реализуйте этот класс. (Подсказка: метод getMonthlyInterest() предназначен для возврата ежемесячных процентов, а не процентной ставки. Ежемесячные проценты = balance * ежемесячная процентная ставка. Ежемесячная процентная ставка = annualInterestRate / 12. Обратите внимание, что значение annualInterestRate измеряется в процентах, например, 4.5%, поэтому необходимо делить его на 100.)

Напишите клиент этого класса — программу, которая создает объект типа Account с ID счета, равным 1122, балансом, равным 20 000 руб., и годовой процентной ставкой, равной 4.5%. Используйте метод withdraw(), чтобы снять 2 500 руб., метод deposit(), чтобы положить 3 000 руб. и отобразите в консоли баланс, ежемесячные проценты и дату создания этого счета.


 */

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated = new Date();

    Account() {
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() {
        return balance * ((annualInterestRate / 12) / 100);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }


}
