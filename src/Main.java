public class Main {
    public static void main(String[] args) {
        Cipher caeserCipher = new CaeserCipher("qwerty");
        caeserCipher.start();
        Cipher morseCipher = new MorseCipher("QWERTY");
        morseCipher.start();
    }
}