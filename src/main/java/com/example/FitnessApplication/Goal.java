package com.example.FitnessApplication;

public class Goal extends GoalUserChoice{

    private String Maintenance;
    private String WeightLoss;
    private String GainMuscle;

    public Goal(String maintenance, String weightLoss, String gainMuscle) {
        super();
        Maintenance = maintenance;
        WeightLoss = weightLoss;
        GainMuscle = gainMuscle;
    }

    public String getMaintenance() {
        return Maintenance;
    }

    public void setMaintenance(String maintenance) {
        Maintenance = maintenance;
    }

    public String getWeightLoss() {
        return WeightLoss;
    }

    public void setWeightLoss(String weightLoss) {
        WeightLoss = weightLoss;
    }

    public String getGainMuscle() {
        return GainMuscle;
    }

    public void setGainMuscle(String gainMuscle) {
        GainMuscle = gainMuscle;
    }

    public String Maintenance(){
        return "Be careful to eat just the calories the calculator that generate.";
    }
    public String  GainMuscle(){
        return "Go to the gym and prioritize the protein. " +
                "See the program for the workout you need!";
    }
    public String WeightLoss(){
        return "You need a caloric deficit. Eat fewer calories than you need. ";
    }
}
