public class Main {
    public static void main(String[] args) {

        String[] currencies = {"USD", "EUR", "JPY", "SERG", "RUB", "THB", "UAH", "MAD", "SGD", "AMD", "DKK", "CZK", "SEK", "TRY", "KZT", "CHF"};
        int currenciesCount; // В этой переменной будет храниться размер массива currencies
        currenciesCount = currencies.length; // Обращаемся к свойству length через имя массива и точку

        System.out.println("Сколько валют в приложении?");
        System.out.println(currenciesCount); // Печатаем результат


        double[]massiv; // Создайте массив
        // Ниже задайте значение элементов массива
        massiv = new double [6];
        System.out.println("А тут вот сколько: ");
        System.out.println(6);



        // Создайте и заполните массив именами участников сделки
        String [] participants = {"Петр" , "Надежда" , "Валентина" , "Юра" , "Саша" , "Виктор" , "Кретин"};
        // Создайте и заполните массив документов участников сделки (с заглавной буквы)
        String [] documents = {"Паспорт" , "Права" , "ИНН" , "Снилс" , "Полис" , "ВНЖ" , "Загран"};

        // Проверьте количество документов, оно должно быть равно числу участников
        if (participants.length == documents.length) {
            System.out.println("Документы загружены верно. Список документов:");
            // Если условие верно, напечатайте список документов в формате: "Пётр: Паспорт"
            System.out.println(participants[0] + ": " + documents[0]);
            System.out.println(participants[1] + ": " + documents[1]);
            System.out.println(participants[2] + ": " + documents[2]);
            System.out.println(participants[3] + ": " + documents[3]);
            System.out.println(participants[4] + ": " + documents[4]);
            System.out.println(participants[5] + ": " + documents[5]);
            System.out.println(participants[6] + ": " + documents[6]);
            
        } else {
            /* Для ошибки предусмотрите печать такого сообщения:
						 "Количество документов не соответствует количеству участников сделки." */
            System.out.println("Количество документов не соответствует количеству участников сделки.");
        }

    }

}