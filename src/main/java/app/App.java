package app;
import bank.Card;

public class App {
    public static void main(String[] args) {
        testCode();
    }

    // Метод для тестирования программы
    public static void testCode(){
        Card myCard = new Card();
        System.out.println("Карта: " + myCard.getCardNumber());
        System.out.println("Пинкод: " + myCard.getPinCode());

        // Изменяем пинкод
        myCard.setPinCode("0001");
        System.out.println("Новый пинкод: " + myCard.getPinCode());
    }
}
