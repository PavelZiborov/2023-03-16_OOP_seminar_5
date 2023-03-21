import java.util.Scanner;

public class View {

    public View(){
    }

    Scanner scanner = new Scanner(System.in);

    public String getExpression(String msg){
        System.out.print(msg);
        return scanner.nextLine();
    }

    public double printResult(double result){
        System.out.println(result);
        return result;
    }
}
