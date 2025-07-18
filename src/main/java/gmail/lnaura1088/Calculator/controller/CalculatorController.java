package gmail.lnaura1088.Calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gmail.lnaura1088.Calculator.service.Calculator;

@RestController
@RequestMapping("/")
public class CalculatorController {

	@Autowired
    private Calculator calculator; // 세미콜론(;) 추가

    @GetMapping("/sum")
    public String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        // 괄호, 세미콜론 수정
        return String.valueOf(calculator.sum(a, b));
    }
}
