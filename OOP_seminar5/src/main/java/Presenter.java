public class Presenter {
    Model model = new Model();
    View view = new View();
    public void button(){
        String expression = view.getExpression("Введите выражение: ");
        double result = model.result(expression);
        view.printResult(result);
    }
}
