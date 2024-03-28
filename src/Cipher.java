import java.util.Objects;
import java.util.Stack;

public abstract class Cipher {
    public Cipher(String text)
    {
        this.text = text;
    }
    String text;
    boolean flag=false;
    public void showText() {
        System.out.println(text);
    }
    public void setText(String str)
    {
        text = str;
    }

    public abstract void crypt();
    public abstract void encrypt();
}
