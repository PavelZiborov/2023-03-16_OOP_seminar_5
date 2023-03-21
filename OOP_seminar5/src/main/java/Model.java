import Calculator.Calculator;

import java.util.ArrayList;
import java.util.Stack;

// 3 + 2 * (10 + 1) =

public class Model {

    public Model() {
    }

    double result;

    public double result(String expression){
        Calculator calculator = new Calculator();
        result = calculator.calculate(expression);
        return result;
    }

}
