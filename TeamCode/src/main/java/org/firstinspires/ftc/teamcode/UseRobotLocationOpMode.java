package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class UseRobotLocationOpMode extends OpMode {
    RobotLocationPractice robotlocationpractice = new RobotLocationPractice(0);
    @Override
    public void init() {
        robotlocationpractice.setAngle(0);
        robotlocationpractice.setX(0);
    }

    @Override
    public void loop() {
        if(gamepad1.a){
            robotlocationpractice.turnRobot(-0.1);

        } else if (gamepad1.b){
            robotlocationpractice.turnRobot(0.1);
        }

        if (gamepad1.dpad_left){
            robotlocationpractice.changeX(0.1);
        } else if (gamepad1.dpad_right){
            robotlocationpractice.changeX(-0.1);
        }
        if (gamepad1.dpad_down){
            robotlocationpractice.changeY(0.1);
        } else if (gamepad1.dpad_up){
            robotlocationpractice.changeY(-0.1);
        }





        telemetry.addData("Heading", robotlocationpractice.getHeading());
        telemetry.addData("Angle", robotlocationpractice.getAngle());
        telemetry.addData("x value", robotlocationpractice.getX());
        telemetry.addData("y value", robotlocationpractice.getY());

    }
}
