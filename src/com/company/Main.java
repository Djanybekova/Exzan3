package com.company;

public class Main {
/*a) Написать класс проверяемого исключения LimitException, с конструктором LimitException(String message,
double remainingAmount) и методом getRemainingAmount().
b) Написать класс BankAccount с 1 полем double amount - остаток на счете и методами getAmount() - возвращает
текущий остатокна счете, deposit(double sum) - положить деньги на счет, withDraw(int sum) - снимает указанную сумму со счета.
c) Также метод withDraw() может сгенерировать исключение в том случае если запрашиваемая сумма на снятие
 больше чем остаток денег на счете.
d) Написать Main класс где бы создавался счет клиента. Положить 20 000 сом на счет.
e) Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом,
при этом отлавливать исключение LimitException и при возникновении такого исключения снимать только ту сумму,
 которая осталась на счете и завершать бесконечный цикл
*/
    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        try{
            bankAccount.getAmount();
        }catch (LimitException e){
            System.out.println(e.getMessage());
            System.out.println(e.getRemainingAmount());
        }finally {
            System.out.println("ggghj");
        }

    }
}
