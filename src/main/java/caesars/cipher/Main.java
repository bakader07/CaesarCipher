package caesars.cipher;

public class Main {
    public static void main(String[] args) {
        String message = "hello, baka my friend";
        int offset = 12;
        String cipheredMessage;
        CaesarCipher caesar = new CaesarCipher();

        cipheredMessage = caesar.cipher(message, offset);
        System.out.println(cipheredMessage);
    }
}
