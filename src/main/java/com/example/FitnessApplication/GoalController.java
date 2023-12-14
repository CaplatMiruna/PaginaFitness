package com.example.FitnessApplication;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoalController {
    @PostMapping(path = "/goal")
    public String AchieveGoals(@RequestBody Goal goal)
    {

        if("Muscle".equals(goal.getUserSelection())){
            return goal.GainMuscle();
        }
        if("Maintenance".equals(goal.getUserSelection())){
            return goal.Maintenance();
        }

        if("Weight Loss".equals(goal.getUserSelection())){
            return goal.WeightLoss();
        }

        return null;
    }

}
