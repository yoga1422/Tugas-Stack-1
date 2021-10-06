import java.util.Scanner;
public class TugasStack {
    public static void main(String[] args) {

        StackYoga<String> BelajarStack = new StackYoga<>(15);
        String in = "f(x)=(x-3)(x+9)";
        Scanner aga = new Scanner(in);

        aga.useDelimiter("");

        for (int y = 0; y < 15; y++) {
            String agoy = aga.next();
            if (agoy.equals("(")) {
                BelajarStack.push("(");
            } else if (agoy.equals(")")){
                BelajarStack.pop();
            }
        }
        if (BelajarStack.isEmpty()) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
    }
}
