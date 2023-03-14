package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String showWelcome() {
        return calculatorService.showWelcome();
    }
    @GetMapping("/plus")
    public String showNumberAddition(@RequestParam int num1, @RequestParam int num2) {
        return num1+ " + " + num2 + " = " + calculatorService.addNumbers(num1, num2);
    }
    @GetMapping("/minus")
    public String showNumberSubtraction(@RequestParam int num1, @RequestParam int num2) {
        return num1+ " - " + num2 + " = " + calculatorService.subtractNumbers(num1, num2);
    }
    @GetMapping("/multiply")
    public String showNumberMultiplication(@RequestParam int num1, @RequestParam int num2) {
        return num1+ " * " + num2 + " = " + calculatorService.multiplicateNumbers(num1, num2);
    }
    @GetMapping("/divide")
    public String showNumberDivision(@RequestParam int num1, @RequestParam int num2) {
        return num1+ " / " + num2 + " = " + calculatorService.divideNumbers(num1, num2);
    }

}
