package Calculator;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class StackMachine {
    public int evaluate(List<Token> postfixExpression) {
        Deque<Integer> valueStack = new LinkedList<>();
        for (Token token : postfixExpression) {
            if (token instanceof NumberToken number) {
                valueStack.push(number.value());
            } else if (token instanceof BinaryOperationToken operation) {
                var right = valueStack.pop();
                var left = valueStack.pop();
                var result = switch (operation.operationType()) {
                    case PLUS -> left + right;
                    case MINUS -> left - right;
                    case MULTIPLY -> left * right;
                    case DIVIDE -> {
                        if (right == 0) {
                            throw new RuntimeException("Divide by zero!");
                        }
                        yield left / right;
                    }
                };
                valueStack.push(result);
            }
        }
        return valueStack.pop();
    }
}
