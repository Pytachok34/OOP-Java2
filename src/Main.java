public class Main {
    public static void main(String[] args) {
        Cipher CaeserCipher = new CaeserCipher("qwerty");
        CaeserCipher.crypt();
        CaeserCipher.showText();
        CaeserCipher.encrypt();
        CaeserCipher.showText();
        MorseCipher morseCipher = new MorseCipher("qwerty");
        morseCipher.crypt();
        morseCipher.showText();
        morseCipher.encrypt();
        morseCipher.showText();
    }
}