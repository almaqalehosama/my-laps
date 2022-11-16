import java.security.SecureRandom;

public class Q6 {
    public static void main(String[] args) {

        SecureRandom s = new SecureRandom();

        for (int i = 1 ;i<6 ;i++);
        {
            System.out.println(s.nextInt(6));
        }

    }
}
