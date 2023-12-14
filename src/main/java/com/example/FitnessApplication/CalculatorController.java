package com.example.FitnessApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @Autowired
    private UserService userService;

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping(path = "/calc/{id}")
    public ResponseEntity<Double> calculate(@PathVariable Long id, @RequestParam String gen) {
        User user = userService.findUserById(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }

        Double result = calculatorService.calculateBMR(user);
        return ResponseEntity.ok(result);
    }

}
