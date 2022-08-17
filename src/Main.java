public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("\nЗадание 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
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
        newFullName = newFullName.replace("ё","е");
        System.out.println(newFullName);
    }
}