package ru.mirea.spiski1;
import java.util.Scanner;
class Tester {
    public static void main(String[] args) {
        CardList cardList = new CardList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Введите card");
            System.out.println("2. Верните card");
            System.out.println("3. Дисплей card");
            System.out.println("4. Очистить card");
            System.out.println("5. Проверьте, пуст ли список");
            System.out.println("6. Выйти");
            System.out.print("Введите свой выбор: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cardList.addCard();
                    break;
                case 2:
                    System.out.print("Введите индекс: ");
                    int index = scanner.nextInt();
                    cardList.removeCard(index);
                    break;
                case 3:
                    System.out.print("Введите индекс: ");
                    index = scanner.nextInt();
                    cardList.displayCard(index);
                    break;
                case 4:
                    cardList.clearCards();
                    break;
                case 5:
                    System.out.println("Список пуст: " + cardList.isEmpty());
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}