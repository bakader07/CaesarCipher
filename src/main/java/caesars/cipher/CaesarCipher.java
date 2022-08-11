package caesars.cipher;

public class CaesarCipher {
    private final static char LETTER_A = 'a';
    private final static char LETTER_Z = 'z';
    private final static int ALPHABET_SIZE = 26;

    public String cipher(String message, int offset){
        offset %= ALPHABET_SIZE;
        char[] characters = message.toCharArray();
        shift(characters, offset);
        return new String(characters);
    }
    private void shift(char[] characters, int offset){
        for(int i = 0; i < characters.length; i++){
            if(characters[i] >= LETTER_A && characters[i]<= LETTER_Z){
                characters[i] = shiftChar(characters[i], offset, LETTER_A, LETTER_Z);
            }
        }
    }
    private char shiftChar(char c, int offset, char start, char end){
        c += offset;
        if(c < start){
            return (char)(c + ALPHABET_SIZE);
        }
        if(c > end){
            return (char)(c - ALPHABET_SIZE);
        }
        return c;
    }
}
