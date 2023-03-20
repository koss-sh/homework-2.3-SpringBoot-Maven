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
    public String showNumberAddition(@RequestParam(value = "num1", required = false) Integer num1,
                                     @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан один или оба параметра!";
        }
        return num1+ " + " + num2 + " = " + calculatorService.addNumbers(num1, num2);
    }

    @GetMapping("/minus")
    public String showNumberSubtraction(@RequestParam(value = "num1", required = false) Integer num1,
                                        @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан один или оба параметра!";
        }
        return num1+ " - " + num2 + " = " + calculatorService.subtractNumbers(num1, num2);
    }

    @GetMapping("/multiply")
    public String showNumberMultiplication(@RequestParam(value = "num1", required = false) Integer num1,
                                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан один или оба параметра!";
        }
        return num1+ " * " + num2 + " = " + calculatorService.multiplicateNumbers(num1, num2);
    }

    @GetMapping("/divide")
    public String showNumberDivision(@RequestParam(value = "num1", required = false) Integer num1,
                                     @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан один или оба параметра!";
        }
        if (num2 == 0) return "Делить на 0 нельзя!";
        return num1+ " / " + num2 + " = " + calculatorService.divideNumbers(num1, num2);
    }

}
