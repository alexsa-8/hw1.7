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
    }
}