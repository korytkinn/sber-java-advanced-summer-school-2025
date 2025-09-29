package oop.part1.objects.project1;

public class AccountClient {
    public static void main(String[] args) {
        Account account = new Account(1122, 20_000);

        account.setAnnualInterestRate(4.5);
        account.withdraw(2_500);
        account.deposit(3_000);
        System.out.printf("Баланс: %.1f руб.\nЕжемесячные проценты: %.3f руб.\nДата создания счета: %s\n", account.getBalance(), account.getMonthlyInterest(), account.getDateCreated());
    }
}
