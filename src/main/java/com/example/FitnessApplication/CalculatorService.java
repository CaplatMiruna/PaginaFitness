package com.example.FitnessApplication;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Double calculateBMR(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        if ("F".equals(user.getGender())) {
            return 665 + ((9.5 * user.getWeight()) + (1.8 * user.getHeight()) - (4.7 * user.getAge()));
        } else if ("M".equals(user.getGender())) {
            return 66 + ((13.7 * user.getWeight()) + (5 * user.getHeight()) - (6.8 * user.getAge()));
        }

        return null;
    }
}
