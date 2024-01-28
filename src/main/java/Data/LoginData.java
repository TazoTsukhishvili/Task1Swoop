package Data;

import java.util.Random;

public class LoginData {
    public static String generateRandomString(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sbRandom = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sbRandom.append(symbols.charAt(random.nextInt(symbols.length())));
        }
        return sbRandom.toString();
    }

    public String
            randomPasswordText = generateRandomString(8),
            randomEmailText = generateRandomString(8) + "@gmail.com",
            loginErrorMsgText = "მომხმარებელი ან პაროლი არასწორია";
}
