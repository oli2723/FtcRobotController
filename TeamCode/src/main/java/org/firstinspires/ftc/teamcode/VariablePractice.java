package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class VariablePractice extends OpMode {
    @Override
 public void init(){

        int teamNumber = 23014;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String teamName = "The Yaki Bots";
        int motorAngle = 143;
        telemetry.addData("Team number", teamNumber);
        telemetry.addData("Motor speed", motorSpeed);
        telemetry.addData("claw closed", clawClosed);
        telemetry.addData("teamName", teamName);
        telemetry.addData("Motor Angle", motorAngle);
    }
@Override
    public void loop(){
/*
1. change the string variable name to your team name

 */
}
}
