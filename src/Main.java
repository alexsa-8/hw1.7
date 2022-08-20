public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("\nЗадание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        //Задание 2
        System.out.println("\nЗадание 2");
        String bigFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + bigFullName);
        //Задание 3
        System.out.println("\nЗадание 3");
        StringBuilder sb = new StringBuilder(fullName);
        sb.delete(0, fullName.length());
        sb.insert(0, "Иванов Семён Сумёнович");
        String newFullName = sb.toString();
        newFullName = newFullName.replace("ё", "е");
        System.out.println(newFullName);
        //Задание 4
        System.out.println("\nЗадание 4");
        System.out.println(fullName);
        int index1 = fullName.indexOf(' ');
        int index2 = fullName.indexOf(' ', index1 + 1);
        int index3 = fullName.length();
        System.out.println("В строке " + fullName + " пробел ' ' находится под индексом " + index1 + " и " + index2 + ".");
        System.out.println("Длина строки " + index3 + " ячейка.");
        String lastName1 = fullName.substring(0, index1);
        String firstName1 = fullName.substring(index1, index2);
        String middleName1 = fullName.substring(index2, index3);
        System.out.println(lastName1 + "\n" + firstName1 + "\n" + middleName1);
        //Задание 5
        System.out.println("\nЗадание 5");
        String lFullName = "ivanov ivan ivanovich";
        System.out.println(lFullName);
        String lFullN = lFullName.trim();
        int i4 = lFullN.indexOf(' ');
        int i5 = lFullN.indexOf(' ', i4 + 1);
        int i8 = lFullN.length();
        //System.out.println("В строке " + lFullN + " пробел ' ' находится под индексом " + i4 + " " + i5 + ".");
        //System.out.println("Длина строки " + i8 + " ячейка.");
        //int iLast = 0;
        int iFirst = (i4 + 1);
        int iMiddle = (i5 + 1);
        //System.out.println("Начальные буквы ФИО находятся под индексами " + iLast + " " + iFirst + " " + iMiddle + ".");
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — "
                + lFullN.substring(0, 1).toUpperCase() + lFullN.substring(2, iFirst).toLowerCase() + " "
                + lFullN.substring(iFirst, iFirst + 1).toUpperCase() + lFullN.substring(iFirst + 1, iMiddle).toLowerCase() + " "
                + lFullN.substring(iMiddle, iMiddle + 1).toUpperCase() + lFullN.substring(iMiddle + 1, i8).toLowerCase());

        //ещё один вариант решения Задачи 5 я нашёл в интернете. Разабраться в нём трудновато.
        /*String upper_case_line = "";
        String lFullName1 = "ivanov ivan ivanovich";
        Scanner lineScan = new Scanner(lFullName1);
        while(lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_line);*/
        {
            //Задание 6
            System.out.println("\nЗадание 6");
            String one = "135";
            String two = "246";
            int three = one.length() + two.length();
            StringBuilder oneTwo = new StringBuilder(three);
            int even = 0;
            int notEven = 0;
            for (int i = 0; i < three; i++) {
                if (i % 2 == 0) {
                    oneTwo.append(one.charAt(notEven));
                    notEven++;
                } else if (i % 2 > 0) {
                    oneTwo.append(two.charAt(even));
                    even++;
                }
            }
            System.out.println(oneTwo);
        }
        {
            //Задание 7
            System.out.println("\nЗадание 7");
            String string = "aabccddefgghiijjkk";
            int d = string.length();
            StringBuilder sting = new StringBuilder();
            for (int i = 1; i < d; i++) {
                if (string.charAt(i) == string.charAt(i - 1)) {
                    sting.append(string.charAt(i));
                }
            }
            String shortString = new String(sting);
            System.out.println(shortString);
        }
    }
}