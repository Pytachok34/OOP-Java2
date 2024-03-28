public class Main {
    public static void main(String[] args) {
        Cipher caeserCipher = new CaeserCipher("qwerty");
        caeserCipher.showText();
        caeserCipher.crypt();
        caeserCipher.showText();
        caeserCipher.encrypt();
        caeserCipher.showText();
        MorseCipher morseCipher = new MorseCipher("---");
        morseCipher.crypt();
        morseCipher.showText();
        morseCipher.encrypt();
        morseCipher.showText();
    }
}