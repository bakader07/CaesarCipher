package caesars.cipher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {
    private final CaesarCipher caesarCipher = new CaesarCipher();

    @Test
    void testCipheredMessageWithOffset12(){
        assertEquals("tqxxa, nmwm yk rduqzp", caesarCipher.cipher("hello, baka my friend", 12));
    }
//    @Test
//    void testCipheredMessageWithOffset11(){
//        assertEquals("tqxxa, nmwm yk rduqzp", caesarCipher.cipher("hello, baka my friend", 11));
//    }
    @Test
    void testCipheredEmptyMessage(){
        assertEquals("", caesarCipher.cipher("", 12));
    }
}