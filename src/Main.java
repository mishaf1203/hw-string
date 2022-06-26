public class Main {
    public static void main(String[] args) {

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        String fullNameCapital = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameCapital);

        fullName = "Иванов Семён Семёнович";
        String fixedFullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);

    }

    }