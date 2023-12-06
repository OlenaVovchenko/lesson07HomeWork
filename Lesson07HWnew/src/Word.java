import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое слово ");
        String word1 = sc.nextLine();
        System.out.println("Введите второе слово ");
        String word2 = sc.nextLine();
        if (word1.length() %2 == 0 && word2.length() % 2 == 0) {
            String cobiWord = word1.substring(0, word1.length() / 2)
                    + word2.substring(word2.length() / 2);
            System.out.println("Результат " + cobiWord);
            }
        else {
            System.out.println("Оба слова должны содержать четное количество букв.");
        }
        sc.close();
    }
}
            //Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
            //Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
            //Например:
            // ввод - mama, papa
            //вывод - mapa