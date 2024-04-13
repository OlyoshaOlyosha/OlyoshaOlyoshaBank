package bank;
import java.util.Random;

public class Card {
    private String pinCode;
    private Long CARD_NUMBER;

    public Card(){
        Random r = new Random();
        CARD_NUMBER = r.nextLong(100000000, 1000000000);
        pinCode = String.format("%04d", r.nextInt(10000));
    }


    public String getPinCode(){
        return pinCode;
    }
    public void setPinCode(String pinCode){
        // Проверка при изменении пинкода
        if (pinCode.length() == 4){
            this.pinCode = pinCode;
        } else {
            throw new IllegalArgumentException("PIN-код должен быть четырёхзначным числом");
        }
    }
    public long getCardNumber(){
        return CARD_NUMBER;
    }


}