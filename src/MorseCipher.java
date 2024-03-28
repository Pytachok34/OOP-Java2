import java.util.HashMap;

public class MorseCipher extends Cipher{
    public MorseCipher(String str)
    {
        super(str);
        text.toUpperCase();
    }
    private static final HashMap<Character, String> morseCodeMap = new HashMap<>();
    static {
        // Заполнение таблицы соответствия символов и их кодировки в азбуке Морзе
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
    }

    @Override
    public void crypt() {
        if(!flag)
        {
            StringBuilder encryptedText = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (morseCodeMap.containsKey(c)) {
                    encryptedText.append(morseCodeMap.get(c)).append(" ");
                } else if (c == ' ') {
                    encryptedText.append("/ ");
                }
            }
            System.out.println("Текст зашифрован");
            text = encryptedText.toString();
            flag = true;
        }
        else
            System.out.println("Текст уже зашифрован");
    }
    public void encrypt()
    {
        if (flag) {
            StringBuilder decryptedText = new StringBuilder();
            String[] words = text.split(" / ");
            for (String word : words) {
                String[] letters = word.split(" ");
                for (String letter : letters) {
                    for (HashMap.Entry<Character, String> entry : morseCodeMap.entrySet()) {
                        if (entry.getValue().equals(letter)) {
                            decryptedText.append(entry.getKey());
                            break;
                        }
                    }
                }
                decryptedText.append(" ");
            }
            System.out.println("Текст расшифрован");
            text = decryptedText.toString();
            flag = false;
        } else {
            System.out.println("Текст уже расшифрован");
        }
    }
}
