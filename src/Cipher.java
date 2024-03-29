public abstract class Cipher {
    public Cipher(String text) {
        this.text = text;
    }

    String text;
    boolean flag = false;

    public void showText() {
        System.out.println(text);
    }

    public void setText(String str) {
        text = str;
    }

    public void start() {
        long startTime = System.currentTimeMillis();
        encrypt();
        showText();
        decrypt();
        showText();
        long endTime = System.currentTimeMillis();

        System.out.println("Время выполнения: " + (endTime - startTime) + " мс\n");

    }

    public abstract void encrypt();

    public abstract void decrypt();
}
