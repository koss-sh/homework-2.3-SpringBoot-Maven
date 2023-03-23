package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String showWelcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public int multiplicateNumbers(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divideNumbers(int num1, int num2) {
        return num1 / (double) num2;
    }
}
