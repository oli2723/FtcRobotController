package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeamMemberPractice extends OpMode {
    boolean initDone;


    @Override
    public void init() {
        telemetry.addData("Init", initDone);
        initDone = true;

    }

double squareInputWithSign(double input){
        double output = input*input;
        if (input < 0){
            output*= -1;
        }
        return output;

    }




    }
