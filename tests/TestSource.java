import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class TestSource {
    @Test
    public void cesarCopTest()
    {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Cipher caesarCipher = new CaeserCipher("qwerty");
        caesarCipher.crypt();
        caesarCipher.encrypt();
        caesarCipher.showText();

        String expectedOutput = "Текст зашифрован\r\nТекст расшифрован\r\nqwerty\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    public void cesarFlopTest()
    {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Cipher caesarCipher = new CaeserCipher("...");
        caesarCipher.crypt();
        caesarCipher.encrypt();
        caesarCipher.showText();
        assertEquals("Текст зашифрован\r\nТекст расшифрован\r\n...\r\n",outContent.toString());
    }
    @Test
    public void setTextTest()
    {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Cipher morseCipher = new MorseCipher("Hello world!");
        morseCipher.setText("Good bye World!");
        morseCipher.showText();
        assertEquals("Good bye World!\r\n",outContent.toString());
    }
    @Test
    public void morseCopTest()
    {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Cipher morseCipher = new MorseCipher("QWERTY");
        morseCipher.crypt();
        morseCipher.encrypt();
        morseCipher.showText();

        String expectedOutput = "Текст зашифрован\r\n" +
                "Текст расшифрован\r\n" +
                "QWERTY\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    public void morseFlopTest()
    {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Cipher morseCipher = new MorseCipher("...");
        morseCipher.crypt();
        morseCipher.encrypt();
        morseCipher.showText();
        assertEquals("Текст зашифрован\r\nТекст расшифрован\r\n\r\n",outContent.toString());
    }
}
