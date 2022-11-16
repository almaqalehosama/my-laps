public class Q3 {
    public static void main(String[] args) {

        String x = new String("Mississippi");
        x = x.replace("i", "!");
        x = x.replace("s", "$");

        System.out.println(x);
        System.out.println("Expected result: " + "M!$$!$$!pp!");

    }

    }
