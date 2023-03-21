package Calculator;

import Calculator.OperationType;
import Calculator.Token;
import Calculator.TokenType;

public record BinaryOperationToken(
        OperationType operationType
) implements Token {
    @Override
    public TokenType type() {
        return TokenType.BINARY_OPERATION;
    }
}