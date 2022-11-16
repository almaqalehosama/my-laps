public class Q5 {
    public static void main(String[] args) {
        String  s ="Dessert";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String text = sb.toString();

         System.out.println("Original string: " + s);
         System.out.println("Reversed string: " + text);
         System.out.println("Expected Reversed string: tresseD" );



    }
}
