public class Main {
    public static void main(String[] args) {
        int startingScore = 1;
        int replanAmount = 10_000_000;
        int accruedBonuses;
        int finalScore;

        if (replanAmount > 1000) {
            accruedBonuses = replanAmount / 100;
            System.out.println("Сумма начисленных бонусов:" + accruedBonuses);

        } else {
            accruedBonuses = 0;
            System.out.println("Сумма начисленных бонусов = 0");
        }
        finalScore = replanAmount + startingScore + accruedBonuses;
        System.out.println(("Ваш итоговый счет: ") + finalScore);
    }

}
