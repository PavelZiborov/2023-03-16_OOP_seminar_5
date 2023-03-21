package Calculator;

import Calculator.Token;
import Calculator.TokenType;

public record OtherToken(TokenType type) implements Token {
}