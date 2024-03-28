public class CaeserCipher extends Cipher {
    public CaeserCipher(String str)
    {
        super(str);
        text.toLowerCase();
    }
    @Override
    public void crypt() {
        if(!flag)
        {
            StringBuilder result = new StringBuilder();
            for (char character : text.toCharArray()) {
                if (character != '.' && character !=' ' && character != '/') {
                    int originalAlphabetPosition = character - 'a';
                    int newAlphabetPosition = (originalAlphabetPosition + 3) % 26;
                    char newCharacter = (char) ('a' + newAlphabetPosition);
                    result.append(newCharacter);
                } else {
                    result.append(character);
                }
            }
            System.out.println("Текст зашифрован");
            text = result.toString();
            flag = true;
        }
        else
            System.out.println("Текст уже зашифрован");
    }

    @Override
    public void encrypt() {
        if (flag) {
            StringBuilder result = new StringBuilder();
            for (char character : text.toCharArray()) {
                if (character != ' ' && character !='.' && character != '/') {
                    int encryptedAlphabetPosition = character - 'a';
                    int originalAlphabetPosition = (encryptedAlphabetPosition - 3 + 26) % 26;
                    char originalCharacter = (char) ('a' + originalAlphabetPosition);
                    result.append(originalCharacter);
                } else {
                    result.append(character);
                }
            }
            System.out.println("Текст расшифрован");
            text = result.toString();
            flag = false;
        } else {
            System.out.println("Текст уже расшифрован");
        }
    }
}
