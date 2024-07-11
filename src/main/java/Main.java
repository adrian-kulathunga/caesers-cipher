
public class Main {
    public static void main(String[] args) {

        String message ="how are you doing today";
        int offset = 12;

        CaesersCipher caesersCipher = new CaesersCipher();

        String cipheredmsg = caesersCipher.cipher(message, offset);


        System.out.println("Message: " + message);
        System.out.println("Offset: " + offset);
        System.out.println("CipherdMessage: " + cipheredmsg);

    }
}